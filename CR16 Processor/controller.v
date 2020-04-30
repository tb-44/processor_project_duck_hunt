`timescale 1ns/1ps
////////////////////////////////////////////////////////////////////////////////
//
// ECE 3710 - TEAM PROJECT - DUCK HUNT GAME
// Trent Bennett, Ty Jensen, Haden Ondricek, Aaron Hillquist
// controller module for cr16 processor (controls)
// Module - controller.v
// Description - controller module for cr16 processor 
// Date:  Oct. 15, 2019
// 
////////////////////////////////////////////////////////////////////////////////

module controller(clk, reset, op, funct_op, cond, readEn, writeEn, intrRegEn, marRegEn, regWriteEn, jumpEn, branchEn, PCEn, aluOutMuxEn,
						regWriteMuxEn, aluBMuxEn, signedExtInd, pcToMAREn, JALEn,PSREn,PSR);
						
	input clk, reset;
	input [3:0] op, funct_op, cond;
	input [4:0] PSR;
	output reg  readEn, writeEn, intrRegEn, marRegEn, regWriteEn, jumpEn, branchEn, PCEn, aluOutMuxEn, regWriteMuxEn, aluBMuxEn, signedExtInd, pcToMAREn, JALEn,PSREn;

   parameter   FETCH   		      =  6'b000001;
   parameter   DECODE  		      =  6'b000010;
   parameter   ALU	  		      =  6'b000011;
   parameter   SIGN_ALUI          =  6'b000100;
   parameter   LOAD    		      =  6'b000101;
   parameter   IDLE      	      =  6'b000110;
   parameter   SIGN_SHIFTI        =  6'b000111;
   parameter   UNSIGN_SHIFTI      =  6'b001000;
   parameter   UNSIGN_ALUI        =  6'b001001;
   parameter   EQ				  =  6'b001010;
   parameter   NE				  =  6'b001011;
	parameter	CS				  =  6'b001100;	
	parameter	CC				  =  6'b001101;	
	parameter	HI				  =  6'b001110;	
	parameter	LS				  =  6'b001111;
	parameter	GT				  =  6'b010000;
	parameter	LE				  =  6'b010001;
	parameter	FS				  =  6'b010010;
	parameter	FC				  =  6'b010011;
	parameter	LO				  =  6'b010100;
	parameter	HS				  =  6'b010101;
	parameter	LT				  =  6'b010110;
	parameter	GE				  =  6'b010111;
	parameter	UC				  =  6'b011000;
	parameter	JUMP			  =  6'b011001;
	parameter	BRANCH		  	  =  6'b011010;
	parameter	REGWRITE		  =  6'b011011;
	parameter   STOR			  =  6'b011100;
	parameter   SIGN_ALUILOAD 	  =  6'b011101;
	parameter   MDRREGWRITE       =  6'b011110;
	parameter   ADDRUPDATE        =  6'b011111;
	parameter   MEMWRITE          =  6'b100000;
	parameter   MEMREAD           =  6'b100001;
	parameter   ALULOAD           =  6'b100010;
	parameter   JAL               =  6'b100011;
	parameter   JALJUMP           =  6'b100100;
	parameter   JUMPFINAL	      =  6'b100101;
	parameter   BRANCHFINAL       =  6'b100110;

   reg [5:0] state, nextstate;

   // state register
   always @(posedge clk)
      if(reset) state <= IDLE;
      else state <= nextstate;

   // next state logic
   always @ (*)
      begin
         case(state)
            FETCH:  nextstate <= DECODE;
            DECODE:  case(op)
								4'b0000:  nextstate <= ALULOAD;
								4'b0001:  nextstate <= SIGN_ALUILOAD; 	// ANDI
								4'b0010:  nextstate <= SIGN_ALUILOAD; 	// ORI
								4'b0011:  nextstate <= SIGN_ALUILOAD; 	// XORI
								4'b0100:  case (funct_op)
												4'b0000:  nextstate <= LOAD;  	// LOAD
												4'b0100:  nextstate <= STOR;  	// STORE
												4'b1100:  nextstate <= JUMP;  	// JUMP
												4'b1000:  nextstate <= JALJUMP;
												default:  nextstate <= ADDRUPDATE; // should not happen
											 endcase
											 
								4'b0101:  nextstate <= SIGN_ALUILOAD; 	// ADDI
								4'b0110:  nextstate <= UNSIGN_ALUI; 	// ADDUI
								
								4'b1000:  case (funct_op)	
												4'b0110:  nextstate <= UNSIGN_SHIFTI;	// ASHU
												4'b0100:  nextstate <= SIGN_SHIFTI;		// LSH
												4'b0001:  nextstate <= SIGN_SHIFTI;  	// LSHI
												4'b0000:  nextstate <= UNSIGN_SHIFTI;  // LSHI
												4'b0011:  nextstate <= UNSIGN_SHIFTI; 	// ASHUI
												4'b0010:  nextstate <= UNSIGN_SHIFTI; 	// ASHUI
												default:  nextstate <= ADDRUPDATE;
											 endcase
								
								4'b1001:  nextstate <= SIGN_ALUILOAD;   // SUBI
								4'b1010:  nextstate <= UNSIGN_ALUI; 	// SUBUI
								4'b1011:  nextstate <= SIGN_ALUILOAD;   // CMPI
								4'b1100:  nextstate <= BRANCH;      	// BRANCH	 
								4'b1101:  nextstate <= SIGN_ALUILOAD;   // MOVI
								4'b1110:  nextstate <= SIGN_ALUILOAD;   // MULI
								4'b1111:  nextstate <= SIGN_ALUILOAD;   // LUI
                        default:  nextstate <= ADDRUPDATE; 			// should never happen
                     endcase
							
				ALULOAD: nextstate <= ALU;
				
				ALU:	nextstate <= REGWRITE;
				
				SIGN_ALUILOAD: nextstate <= SIGN_ALUI;
				
				SIGN_ALUI:	nextstate <= REGWRITE;
				
				LOAD:	nextstate <= MEMREAD;
				
				IDLE:	nextstate <= FETCH;
				
				SIGN_SHIFTI:	nextstate <= REGWRITE;
				
				UNSIGN_SHIFTI:	nextstate <= REGWRITE;
				
				UNSIGN_ALUI:	nextstate <= REGWRITE;
				
				
				//5'b N, Z, F, L, C
				EQ:	begin
						if(PSR[3]) begin
							if(op==4'b0100) nextstate 	<= JUMPFINAL;
							else nextstate <= BRANCHFINAL;
						end
						else nextstate <= ADDRUPDATE;
					end
				
				NE:	begin
						if(!PSR[3]) begin
							if(op==4'b0100) nextstate <= JUMPFINAL;
							else nextstate <= BRANCHFINAL;
						end
						else nextstate <= ADDRUPDATE;
					end
				
				GE:	begin
						if(PSR[3] & PSR[4]) begin
							if(op==4'b0100) nextstate <= JUMPFINAL;
							else nextstate <= BRANCHFINAL;
						end
						else nextstate <= ADDRUPDATE;
					end
				
				CS:	begin
						if(PSR[0]) begin
							if(op==4'b0100) nextstate <= JUMPFINAL;
							else nextstate <= BRANCHFINAL;
						end
						else nextstate <= ADDRUPDATE;
					end
				
				CC:	begin
						if(!PSR[0]) begin
							if(op==4'b0100) nextstate <= JUMPFINAL;
							else nextstate <= BRANCHFINAL;
						end
						else nextstate <= ADDRUPDATE;
					end
				
				HI:   begin
						if(PSR[1]) begin
							if(op==4'b0100) nextstate <= JUMPFINAL;
							else nextstate <= BRANCHFINAL;
						end
						else nextstate <= ADDRUPDATE;
					end
				
				LS:	begin
						if(!PSR[1]) begin
							if(op==4'b0100) nextstate <= JUMPFINAL;
							else nextstate <= BRANCHFINAL;
						end
						else nextstate <= ADDRUPDATE;
					end
				
				LO:	begin
						if(!PSR[1] & !PSR[3]) begin
							if(op==4'b0100) nextstate <= JUMPFINAL;
							else nextstate <= BRANCHFINAL;
						end
						else nextstate <= ADDRUPDATE;
					end
				
				HS:	begin
						if(PSR[1] & PSR[3]) begin
							if(op==4'b0100) nextstate <= JUMPFINAL;
							else nextstate <= BRANCHFINAL;
						end
						else nextstate <= ADDRUPDATE;
					end
					
				GT:   begin
						if(PSR[4]) begin
							if(op==4'b0100) nextstate <= JUMPFINAL;
							else nextstate <= BRANCHFINAL;
						end
						else nextstate <= ADDRUPDATE;
					end
					
				LE:   begin
						if(!PSR[4]) begin
							if(op==4'b0100) nextstate <= JUMPFINAL;
							else nextstate <= BRANCHFINAL;
						end
						else nextstate <= ADDRUPDATE;
					end
				
				FS:	begin
						if(PSR[2]) begin
							if(op==4'b0100) nextstate <= JUMPFINAL;
							else nextstate <= BRANCHFINAL;
						end
						else nextstate <= ADDRUPDATE;
					end
				
				FC:	begin
						if(!PSR[2]) begin
							if(op==4'b0100) nextstate <= JUMPFINAL;
							else nextstate <= BRANCHFINAL;
						end
						else nextstate <= ADDRUPDATE;
					end
				
				LT:	begin
						if(!PSR[4] & !PSR[3]) begin
							if(op==4'b0100) nextstate <= JUMPFINAL;
							else nextstate <= BRANCHFINAL;
						end
						else nextstate <= ADDRUPDATE;
					end
				
				UC:	begin
					if(op==4'b0100) nextstate <= JUMPFINAL;
					else nextstate <= BRANCHFINAL;	
				end
				
				JUMP:		case (cond)
								4'b0000:		nextstate <= EQ;				// EQ (Equal)
								4'b0001:		nextstate <= NE;				// NE (Not Equal)
								4'b0010:		nextstate <= CS;				// CS (Carry Set)
								4'b0011:		nextstate <= CC;				// CC (Carry clear)
								4'b0100:		nextstate <= HI;				// HI (Higher than)
								4'b0101:		nextstate <= LS;				// LS (Lower than or Same as)
								4'b0110:		nextstate <= GT;				// GT (Greater Than)
								4'b0111:		nextstate <= LE;				// LE (Less than or equal)
								4'b1000:		nextstate <= FS;				// FS (Flag set)
								4'b1001:		nextstate <= FC;				// FC (Flag clear)
								4'b1010:		nextstate <= LO;				// LO (Lower than)
								4'b1011:		nextstate <= HS;				// HS (Higher than or Same as)
								4'b1100:		nextstate <= LT;				// LT (Less Than)
								4'b1101:		nextstate <= GE;				// GE (Greater Than or Equal)
								4'b1110:		nextstate <= UC;				// UC (Unconditional)
								default:    nextstate <= ADDRUPDATE;        // should not happen
							endcase
				
				BRANCH: case (cond)
								4'b0000:		nextstate <= EQ;				// EQ (Equal)
								4'b0001:		nextstate <= NE;				// NE (Not Equal)
								4'b0010:		nextstate <= CS;				// CS (Carry Set)
								4'b0011:		nextstate <= CC;				// CC (Carry clear)
								4'b0100:		nextstate <= HI;				// HI (Higher than)
								4'b0101:		nextstate <= LS;				// LS (Lower than or Same as)
								4'b0110:		nextstate <= GT;				// GT (Greater Than)
								4'b0111:		nextstate <= LE;				// LE (Less than or equal)
								4'b1000:		nextstate <= FS;				// FS (Flag set)
								4'b1001:		nextstate <= FC;				// FC (Flag clear)
								4'b1010:		nextstate <= LO;				// LO (Lower than)
								4'b1011:		nextstate <= HS;				// HS (Higher than or Same as)
								4'b1100:		nextstate <= LT;				// LT (Less Than)
								4'b1101:		nextstate <= GE;				// GE (Greater Than or Equal)
								4'b1110:		nextstate <= UC;				// UC (Unconditional)
								default:    nextstate <= ADDRUPDATE;        // should not happen
							endcase
				
				REGWRITE:  nextstate <= ADDRUPDATE; 
				
				MDRREGWRITE: nextstate <= ADDRUPDATE;
				
				STOR:  nextstate <= MEMWRITE;
				
				MEMWRITE: nextstate <= ADDRUPDATE;
				
				MEMREAD: nextstate <= MDRREGWRITE;
				
				ADDRUPDATE: nextstate <= FETCH;
				
				JAL: nextstate <= JALJUMP;
				
				JALJUMP: nextstate <= IDLE;
				
				JUMPFINAL: nextstate <= ADDRUPDATE;
				
				BRANCHFINAL: nextstate <= IDLE;
		
            default: nextstate <= ADDRUPDATE; // should never happen
         endcase
      end

   always @ (*)
      begin
			// set all controls to zero (1'b0) for every clock cycle
			intrRegEn 		<= 1'b0; 
			marRegEn 		<= 1'b0; 
			regWriteEn 		<= 1'b0; 
			jumpEn 			<= 1'b0; 
			branchEn 		<= 1'b0; 
			PCEn 				<= 1'b0;  
			aluOutMuxEn 	<= 1'b0; 
			regWriteMuxEn 	<= 1'b0;  
			aluBMuxEn 		<= 1'b0; 
			signedExtInd 	<= 1'b0;  
			pcToMAREn 		<= 1'b0; 
			readEn         <= 1'b0;
			writeEn        <= 1'b0;
			JALEn          <= 1'b0;
			PSREn          <= 1'b0;
		
            case(state)
					IDLE:
						begin
							readEn    <= 1'b1;
						end
					ADDRUPDATE:
						begin
							marRegEn 	<= 1'b1;
							pcToMAREn 	<= 1'b0;
							PCEn      <= 1'b1;
							readEn    <= 1'b1;
							
						end
                    FETCH: 
                        begin
							//marRegEn  <= 1'b1;
							//intrRegEn <= 1'b1;  
							readEn    <= 1'b1;
							intrRegEn <= 1'b1;
                        end
						
					DECODE: 
                        begin
							intrRegEn <= 1'b1;
                        end
						
					ALULOAD:
						begin
							aluBMuxEn   	<= 1'b1;
						end
					
					ALU: 
						begin
							regWriteMuxEn 	<= 1'b1;
							regWriteEn    	<= 1'b1;
							PSREn           <= 1'b1;
						end
						
					SIGN_ALUILOAD:
						begin
							signedExtInd  	<= 1'b1;
						end
						
					SIGN_ALUI:
						begin
							regWriteMuxEn 	<= 1'b1;
							regWriteEn    	<= 1'b1;
						end
						
					REGWRITE:
						begin
						    regWriteMuxEn 	<= 1'b1;
							regWriteEn    	<= 1'b1;
						end
						
					MDRREGWRITE:
						begin
							regWriteEn    	<= 1'b1;
						end
						
					UNSIGN_ALUI:
						begin
							signedExtInd  	<= 1'b1;
							aluOutMuxEn 	<= 1'b1;
						end
						
					SIGN_SHIFTI:
						begin
							aluOutMuxEn <= 1'b1;
							aluBMuxEn   <= 1'b1;
						end
						
					UNSIGN_SHIFTI:
						begin
							aluOutMuxEn <= 1'b1;
							aluBMuxEn   <= 1'b1;
						end
						
					LOAD:
						begin
							marRegEn 	<= 1'b1;
							pcToMAREn 	<= 1'b1;
							//jumpEn      <= 1'b1;
							//aluOutMuxEn <= 1'b1;
							//aluBMuxEn   <= 1'b1;
							
						end
						
					STOR:
						begin
							pcToMAREn 	<= 1'b1;
							marRegEn 	<= 1'b1;
						end
					MEMREAD:
						begin
							readEn     	<= 1'b1;
						end
					MEMWRITE:
						begin
							writeEn     <= 1'b1;
						end
						
					BRANCH:
						begin
							branchEn 	<= 1'b0;
							PCEn 			<= 1'b1;
						   jumpEn 		<= 1'b0;
						end
						
					JUMP:
						begin
						end
					JAL: 
						begin
						end
					JALJUMP:
						begin
							JALEn <= 1'b1;
							PCEn  <= 1'b1;
							jumpEn <= 1'b1;
							marRegEn <=1'b1;
						end
					JUMPFINAL:
						begin
							jumpEn <= 1'b1;
							PCEn <= 1'b1;
						end
						
             default:  begin
					   end
				endcase
    end
endmodule