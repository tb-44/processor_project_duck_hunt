`timescale 1ns / 1ps

////////////////////////////////////////////////////////////////////////////////
// ECE 3710 - TEAM PROJECT - DUCK HUNT GAME
// TEAM 8 - Trent Bennett, Ty Jensen, Haden Ondricek, Aaron Hillquist
// CR16 Register File
// Module - reg_file.v
// Description - 16 Bit register file
//
// INPUT:
// clk - clock
// writeEn - write enable
// data - 
// dst - destination register
// src - source register
//
// OUTPUT:
// read1 = reg input A into ALU
// read2 = reg input B into ALU
// mem_data 
// 
////////////////////////////////////////////////////////////////////////////////

module regFile(clk, writeEn,JALEn, src, dst, data, read1, read2, addr);
	parameter WIDTH = 16;
	parameter REGBITS = 4;
	input clk, writeEn,JALEn;
	input [WIDTH -1:0] data, addr;
	input [REGBITS-1:0] dst, src;
	output [WIDTH-1:0] read1, read2;
	
	reg [WIDTH-1:0] RAM [(1<<REGBITS)-1:0];
	
	always @(negedge clk)begin
		if(writeEn) RAM[dst] <= data;
		else if(JALEn) RAM[dst] <= addr;
	end	
		assign read1 = dst ? RAM[dst] : 0;
		assign read2 = src ? RAM[src] : 0;
		
endmodule