////////////////////////////////////////////////////////////////////////////////
//
// ECE 3710 - TEAM PROJECT - DUCK HUNT GAME
// Trent Bennett, Ty Jensen, Haden Ondricek, Aaron Hillquist
// ALU CONTROL MODULE
// Module - alu_control.v
// Description - 16 bit alu control for our CPU
// Date:  Oct. 2, 2019
// 
////////////////////////////////////////////////////////////////////////////////

module alu_control(aluop, funct_op, alu_contrl, shift_control);
	input [3:0] aluop;
	input [3:0] funct_op;
	output reg [3:0] alu_contrl;
	output reg shift_control;
	
	always @ (*) begin
		alu_contrl <= 4'b0000;
		shift_control <= 1'b0;
		
		// aluop = instruction[15:12] - ITYPE INSTRUCTIONS
		case (aluop)

		 4'b0101: 	alu_contrl <= 4'b0000; // ADDI
         4'b0001: 	alu_contrl <= 4'b0001; // ANDI
         4'b0010: 	alu_contrl <= 4'b0010; // ORI
         4'b0011: 	alu_contrl <= 4'b0011; // XORI
         4'b1001: 	alu_contrl <= 4'b0100; // SUBI
         4'b0110: 	alu_contrl <= 4'b0101; // ADDUI
         4'b1010: 	alu_contrl <= 4'b0110; // SUBUI
		 4'b1011: 	alu_contrl <= 4'b1000; // CMPI
		 4'b1101:   alu_contrl <= 4'b1001; // MOVI
		 4'b1110:   alu_contrl <= 4'b1010; // MULI
		 4'b1000: 	begin
				case (funct_op)
					4'b0100:  shift_control <= 1'b0; // LSH
					4'b0000:  shift_control <= 1'b0; // LSHI
					4'b0110:  shift_control <= 1'b1; // ASHU
					4'b0010:  shift_control <= 1'b1; // ASHUI
					4'b0001:  shift_control <= 1'b0; // LSHI
					4'b0011:  shift_control <= 1'b1; // ASHUI
					default:  shift_control <= 1'b0;
				endcase
			end
			4'b1111:    alu_contrl <= 4'b1011; //LUI
			// funct_op = instruction[7:4] - RTYPE INSTRUCTIONS
			default:  case(funct_op)
				  4'b0101: 	alu_contrl <= 4'b0000; // ADD
                  4'b0001: 	alu_contrl <= 4'b0001; // AND
                  4'b0010: 	alu_contrl <= 4'b0010; // OR
                  4'b0011: 	alu_contrl <= 4'b0011; // XOR
                  4'b1001: 	alu_contrl <= 4'b0100; // SUB
                  4'b0110: 	alu_contrl <= 4'b0101; // ADDU
                  4'b1010: 	alu_contrl <= 4'b0110; // SUBU
                  4'b1100: 	alu_contrl <= 4'b0111; // NOT
				  4'b1011: 	alu_contrl <= 4'b1000; // CMP
				  4'b1101:  alu_contrl <= 4'b1001; // MOV
				  4'b1110:  alu_contrl <= 4'b1010; // MUL
				  default:  alu_contrl <= 4'b0000; // should not happen
                endcase	
		endcase
	end
endmodule
