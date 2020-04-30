`timescale 1ns / 1ps

////////////////////////////////////////////////////////////////////////////////
// ECE 3710 - TEAM PROJECT - DUCK HUNT GAME
// CR16 ALU
// Module - alu16.v
// Description - 16 Bit ALU
//
// INPUT:
// A: 16 bit input
// B: 16 bit input
// alu_op: 4 bit alu control - select 
//
// OUTPUT:
// alu_Out: 16 bit ALU result 
// F: Overflow 1 bit flag
// L: unsigned CMP, CMPI 1 bit flag
// C: Carry out 1 bit flag
// N: signed CMP, CMPI  bit flag
// Z: Zero 1 bit flag
// 
////////////////////////////////////////////////////////////////////////////////

module alu16(A, B, alu_op, alu_Out, PSR);
	input [15:0] A, B;
	input [3:0] alu_op;	
	
	// output result
	reg [16:0] result;
	output reg [15:0] alu_Out;
	
	// PSR Reg Flags - need to set flags for CR16 requirements
	output reg [4:0] PSR;
	reg [16:0] A_ext;
	
   always @ (*) begin
	/*
		F = 1'b0;
		L = 1'b0;
		C = 1'b0;
		N = 1'b0;
		Z = 1'b0;*/
		result = 16'b00000000000000000;
		// PSR = {N,Z,F,L,C};
		A_ext = {1'b1,A};
		PSR = 5'b00000;
			
		case (alu_op)
			// ADD, ADDI
			4'b0000:  begin
				result = A + B;
				PSR[0] = result[16];
				PSR[2] = (A[15] & B[15] & ~result[15]) | (~A[15] & ~B[15] & result[15]);
				alu_Out=result[15:0];
				end
				
			// AND  
			4'b0001: begin
				alu_Out = A & B;
			end
			//OR, ORI
			4'b0010: begin
				alu_Out = A | B;
			end
			// XOR, XORI
			4'b0011: begin
				alu_Out = A ^ B;
			end
			// SUB, SUBI
			4'b0100: begin
			
				result = A + (~B + 1'b1);
				PSR[0] = 1'b0;
				PSR[1] = result[15];
				PSR[3] = A==B;
				alu_Out=result[15:0];
				end
				
			// ADDU, ADDUI
			4'b0101: begin
				result = A + B;
				if(result[16])PSR[0] = 0; else PSR[0] = 1;
				alu_Out=result[15:0];
				end
				
			// SUBU, SUBUI
			4'b0110: begin
				result = A_ext - B;
				PSR[0] = ~result[16];
				PSR[1] = ~result[16];
				PSR[3] = A == B;
				alu_Out=result[15:0];
			end
			
			// NOT
			4'b0111: begin
				alu_Out = ~A;
			end
			// CMP, CMPI
			4'b1000: begin
				result = A_ext - B;
				//L
				if(A<B) PSR[1] = 1; else PSR[1] = 0;
				//Z
				if(A == B) PSR[3] = 1; else PSR[3] = 0;
				//N
				if($signed(A) < $signed(B)) PSR[4] = 1; else PSR[4] = 0;
				alu_Out = result[15:0];
			end
			
			// MOV, MOVI
			4'b1001: begin
				alu_Out = B;
			end
			
			// MUL, MULI
			4'b1010: begin
				alu_Out = (A * B);
			end
			
			//LUI
			4'b1011: begin
				alu_Out = {B[7:0], A[7:0]};
			end
			
			default:begin
				alu_Out = 16'b0;  //should not happen
				PSR = 5'b00000;
			end
		endcase
	end
endmodule
