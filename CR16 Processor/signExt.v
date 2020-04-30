////////////////////////////////////////////////////////////////////////////////
//
// ECE 3710 - TEAM PROJECT - DUCK HUNT GAME
// Trent Bennett, Ty Jensen, Haden Ondricek, Aaron Hillquist
// SIGN EXTENSION MODULE
// Module - signExt.v
// Description - 16 bit sign extension for our datapath
// Date:  Oct. 2, 2019
// 
////////////////////////////////////////////////////////////////////////////////

module signExt(in, signedInd, out);
	input [7:0] in;
	input signedInd;
	output reg [15:0] out;
	
	always @ (*) begin
		if(signedInd) begin
			if(in[7]) begin
				out = {8'b11111111, in};
			end
			else begin
				out = {8'b00000000, in};
			end
		end
		else begin
			out = {8'b00000000, in};
		end
	end
endmodule