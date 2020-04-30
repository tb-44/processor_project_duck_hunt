`timescale 1ns/1ps
////////////////////////////////////////////////////////////////////////////////
//
// ECE 3710 - TEAM PROJECT - DUCK HUNT GAME
// Trent Bennett, Ty Jensen, Haden Ondricek, Aaron Hillquist
// cr16 processor testbench module
// Module - tb_cr16.v
// Description - testbench for our cr16 processor top module
// Date:  Oct. 15, 2019
// 
////////////////////////////////////////////////////////////////////////////////

module tb_cr16();
	reg clk,reset;
	reg [31:0] In_devices;
	wire [31:0] Out_devices;
	wire hSync, vSync, vgaBlankn,vgaClk;
	wire [7:0] r,g,b;
	
	CR16 top_process(.clk(clk), .reset(reset), .In_devices(In_devices), .Out_devices(Out_devices),.clr(reset),.hSync(hSync),.vSync(vSync),.vgaBlankn(vgaBlankn),.vgaClk(vgaClk),.r(r),.g(g),.b(b));

	initial
		begin
			clk = 0; reset = 1; #10;
			reset = 0; #10;
		
		end
	
	always #5 clk <= ~clk;

endmodule