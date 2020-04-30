`timescale 1ns/1ps
////////////////////////////////////////////////////////////////////////////////
//
// ECE 3710 - TEAM PROJECT (Team 8) - DUCK HUNT GAME
// Trent Bennett, Ty Jensen, Haden Ondricek, Aaron Hillquist
// xorshift rng testbench file
// Module - tb_cr16.v
// Description - testbench for our cr16 processor top module
// Date:  Oct. 15, 2019
// 
////////////////////////////////////////////////////////////////////////////////

module tb_xorshiftrng();
	reg clk;
	
	xorshift_rng RNG(.clk(clk));

	initial
		begin
			clk = 0; #10;
		end
	always #5 clk <= ~clk;

endmodule