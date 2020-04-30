////////////////////////////////////////////////////////////////////////////////
//
// ECE 3710 - TEAM PROJECT - DUCK HUNT GAME
// Trent Bennett, Ty Jensen, Haden Ondricek, Aaron Hillquist
// hierarchal memory module
// Module - memory.v
// Description - 16 bit hierarchal memory module of memory block (64k locations)
// Date:  Oct. 2, 2019
// 
////////////////////////////////////////////////////////////////////////////////

module memory(clk, addr, writeEn, readEn, writeData,readData, In_devices, Out_devices,vgaData,vgaAddr);
	parameter WIDTH = 16;
	input [WIDTH-1:0] addr;
	input [12:0]vgaAddr;
	input writeEn, readEn,clk;
	input [31:0] In_devices;
	output [31:0] Out_devices;
	input [WIDTH-1:0] writeData;
	wire [15:0] io_data, memdata, randomNum;
	wire ioen, rmen,vgaen,randen;
	wire [1:0] muxSel;
	output [WIDTH-1:0] readData, vgaData;

	assign ioen = addr[15] & ~addr[14] & ~addr[13];
	assign rmen = ~addr[15] & ~addr[14] & ~addr[13];
	assign vgaen = addr[15] & addr[14] & addr[13];
	assign randen = addr == 16'b1111111111100000;
	
	xorshift_rng rng(.clk(clk), .xs(randomNum));
	mux4 mux_mem(.d0(memdata), .d1(io_data), .d2(randomNum), .d3(vgaData), .s(muxSel), .y(readData));
	IO io(.clk(clk), .en(ioen), .memwrite(writeEn), .memread(readEn), .adr(addr[6:0]), .writedata(writeData), .memdata(io_data), .Out_devices(Out_devices), .In_devices(In_devices));
	exmem RAM(.clk(clk), .en(rmen), .memwrite(writeEn), .memread(readEn), .adr(addr[12:0]), .writedata(writeData), .memdata(memdata));
	VGARAM ram (.clk(clk),.en(vgaen), .inAddr(addr[12:0]), .outAddr(vgaAddr),.writedata(writeData),.memdata(vgaData));
	enDecoder enDec(.en0(rmen),.en1(ioen),.en2(randen),.en3(vgaen),.outEn(muxSel));

endmodule
