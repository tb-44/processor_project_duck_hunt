`timescale 1ns/1ps

module tb_RAMROM();

reg clk, memread;
reg [9:0] adr;

GlyphROM UUT(.clk(clk), .memread(memread), .adr(adr), .vgadata(vgadata));

always #5 clk <=~clk;
initial 
	begin	
	clk = 0; memread = 0;
		#15;
		memread <= 1;
		#20;
		adr <= 9'b1000;
		#20
		$display("At Address adr %b VGAData %b", adr, vgadata); 
		#20
		adr <= 9'b10000;
		#20
		$display("At Address adr %b VGAData %b", adr, vgadata); 
	end
endmodule