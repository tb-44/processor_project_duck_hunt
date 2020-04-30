module VGA(clk,clr, hSync, vSync, vgaBlankn, vgaClk, r,g,b, data,addr);
	input clk, clr;
	input [15:0] data;
	output hSync, vSync, vgaBlankn, vgaClk;
	output [7:0] r, g, b;
	output [12:0] addr;
	wire bright;
	wire [9:0] x,y;
	wire [12:0] glyphAddr;
	wire [63:0] glyphData;
	wire bgEn;
	
	vgaController vgaCont(.clk(clk), .clr(clr), .vgaBlankn(vgaBlankn), .hSync(hSync), .vSync(vSync), .bright(bright), .vgaClk(vgaClk), .x(x), .y(y), .bgEn(bgEn));
	bitGen bg(.clk(clk),.bright(bright), .r(r), .g(g), .b(b), .x(x), .y(y), .RAMData(data), .RAMAddr(addr), .ROMAddr(glyphAddr),.ROMData(glyphData), .bgEn(bgEn));
	glyphROM glyphs(.clk(clk),.addr(glyphAddr),.memdata(glyphData));
	
endmodule