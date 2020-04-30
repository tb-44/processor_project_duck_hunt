`timescale 1ns / 1ps
////////////////////////////////////////////////////////////////////////////////
//
// ECE 3710 - TEAM PROJECT - DUCK HUNT GAME
// Trent Bennett, Ty Jensen, Haden Ondricek, Aaron Hillquist
// MEMORY MODULE
// Module - exmem.v
// Description - 16 bit memory RAM
// Date:  Oct. 2, 2019
// 
////////////////////////////////////////////////////////////////////////////////

module exmem #(parameter WIDTH = 16, RAM_ADDR_BITS = 13)
   (input clk, en,
    input memwrite, memread,
    input [RAM_ADDR_BITS-1:0] adr,
    input [WIDTH-1:0] writedata,
    output reg [WIDTH-1:0] memdata
    );
   reg [WIDTH-1:0] mips_ram [(2**RAM_ADDR_BITS)-1:0];

 initial

 // The following $readmemh statement is only necessary if you wish
 // to initialize the RAM contents via an external file (use
 // $readmemb for binary data). The fib.dat file is a list of bytes,
 // one per line, starting at address 0.   
 $readmemh("HexMachineCode.dat", mips_ram);

 // This "always" block simulates as a RAM. Note that the RAM is clocked. Reading
 // and writing happen on the rising clock edge. This is very important
 // to keep in mind when you're using the RAM in your system! 
   
	always @(negedge clk)
      if (en) begin
         if (memwrite)
            mips_ram[adr] <= writedata;
			else if(memread)
				memdata <= mips_ram[adr];
      end				
endmodule