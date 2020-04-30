`timescale 1ns / 1ps
////////////////////////////////////////////////////////////////////////////////
//
// ECE 3710 - TEAM PROJECT - DUCK HUNT GAME
// Trent Bennett, Ty Jensen, Haden Ondricek, Aaron Hillquist
// MEMORY MODULE
// Module - glyphROM.v
// Description - 16 bit memory ROM
// Date:  Nov. 1, 2019
// 
////////////////////////////////////////////////////////////////////////////////

module glyphROM #(parameter WIDTH = 64, ROM_ADDR_BITS = 13)
   (input clk,
    input [ROM_ADDR_BITS-1:0] addr,
    output reg [WIDTH-1:0] memdata
    );

   reg [WIDTH-1:0] glyphROM [(2**ROM_ADDR_BITS)-1:0];

 initial
	$readmemh("glyphData.dat", glyphROM);

	always @(posedge clk)
		memdata <= glyphROM[addr];				
endmodule