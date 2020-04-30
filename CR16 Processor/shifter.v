////////////////////////////////////////////////////////////////////////////////
//
// ECE 3710 - TEAM PROJECT - DUCK HUNT GAME
// Trent Bennett, Ty Jensen, Haden Ondricek, Aaron Hillquist
// SHIFTER MODULE
// Module - shifter.v
// Description - 16 bit shifter module for our datapath
// Date:  Oct. 2, 2019
// 
////////////////////////////////////////////////////////////////////////////////

module shifter(A, B, funct, Out);
	parameter WIDTH = 16;
	input [WIDTH-1:0] A;
	input [4:0] B;
	input funct;
	output reg [WIDTH-1:0] Out;
	wire [4:0] Bpos;
	
	assign Bpos = ~B + 1'b1;
	
	always @ (*) begin
		case(funct)
			0: begin
				if(B[4]==0)Out = A << B;
				else Out = A >> Bpos;	
			end
			1: begin // Implement ASH Here
				Out = A << B;
				Out = {A[15],Out[14:0]};
			end
			default: begin
				Out = 16'b0000000000000000;
			end
		endcase
	end
endmodule
