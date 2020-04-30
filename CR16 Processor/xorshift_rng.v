`timescale 1ns / 1ps

////////////////////////////////////////////////////////////////////////////////
// ECE 3710 - TEAM PROJECT  - DUCK HUNT GAME
// TEAM 8 - Trent Bennett, Ty Jensen, Haden Ondricek, Aaron Hillquist
// CR16 Register File
// Module - xorshift_rng.v
// Description - 16 Bit Pseudorandom number generator. 
//
// INPUT:
// clk = global clock. New random number generated each clock cycle.
//
// OUTPUT:
// xs = 16 bit binary random number
// 
////////////////////////////////////////////////////////////////////////////////

module xorshift_rng(clk, xs);
	input clk;
	output reg [15:0] xs = 16'b1;

	always @(posedge clk)
    begin
        xs = xs ^ (xs << 4'd7);
        xs = xs ^ (xs >> 4'd9);
        xs = xs ^ (xs << 4'd8);
	end
		
endmodule