////////////////////////////////////////////////////////////////////////////////
//
// ECE 3710 - TEAM PROJECT (Team 8) - DUCK HUNT GAME
// Trent Bennett, Ty Jensen, Haden Ondricek, Aaron Hillquist
// DATAPATH INFRASTRUCTURE
// Module - datapath.v
// Description - 16 bit datapath for the processor including memory
// Date:  Oct. 2, 2019
// 
////////////////////////////////////////////////////////////////////////////////

module datapath(clk,reset,intrRegEn,marRegEn,regWriteEn, jumpEn,branchEn,PCEn,aluOutMuxEn,
					regWriteMuxEn,aluBMuxEn,signedExtInd,shiftFunct,pcToMAREn,PSREn, JALEn, PSR,aluControl, writeData, readData, addr, instruction);
									
	parameter WIDTH = 16;
	//1-bit base controls
	input clk,reset;
	//controls
	input intrRegEn,marRegEn,regWriteEn, jumpEn,branchEn,PCEn,aluOutMuxEn,regWriteMuxEn,aluBMuxEn,signedExtInd,shiftFunct,pcToMAREn,JALEn,PSREn;
	//data lines
	input [15:0] readData;
	wire [WIDTH - 1:0] rega,alua,muxToRegB,alub,aluToReg,aluOut,addrBus,dataBus,regWriteData,regb,aluToMux,PCToAddrMux,shifterOut,signedExtOut,addrToMar, memdata, rega1;
	wire [4:0] aluToPsr;
	input [3:0] aluControl;
	output [WIDTH - 1:0] addr;
	output [4:0] PSR;
	output [15:0] instruction;
	output [15:0] writeData;
	
	// flop registers including instruction register, MAR, MDR
	flop #(WIDTH) a(.clk(clk),.d(rega1),.q(alua));
	flop #(WIDTH) b(.clk(clk),.d(muxToRegB),.q(alub));
	flop #(WIDTH) aluReg(.clk(clk),.d(aluToReg),.q(aluOut));
	flopenr_neg #(5) PSRReg(.clk(clk),.reset(reset),.en(PSREn),.d(aluToPsr),.q(PSR));
	flopenr #(WIDTH) instructionReg(.clk(clk),.reset(reset),.en(intrRegEn),.d(readData),.q(instruction));
	flopenr #(WIDTH) MAR(.clk(clk),.reset(reset),.en(marRegEn),.d(addrToMar),.q(addr));
	flop #(WIDTH) MDR(.clk(clk),.d(readData),.q(dataBus));
	
	// regfile, alu, and PC
	regFile Registers(.clk(clk),.writeEn(regWriteEn),.JALEn(JALEn),.src(instruction[3:0]),.dst(instruction[11:8]),.data(regWriteData),.read1(rega),.read2(regb), .addr(PCToAddrMux));
	alu16 alublock(.A(alua),.B(alub),.alu_op(aluControl),.alu_Out(aluToMux),.PSR(aluToPsr));
	PC pc_1(.clk(clk),.reset(reset),.jumpEn(jumpEn),.branchEn(branchEn),.PCEn(PCEn),.regDataToPC(regb),.immToPC(signedExtOut),.PCOut(PCToAddrMux));
	
	// 2 to 1 mux for datapath
	mux2 #(WIDTH) addrMux(.d0(PCToAddrMux),.d1(regb),.s(pcToMAREn),.y(addrToMar));
	mux2 #(WIDTH) aluOutMux(.d0(aluToMux),.d1(shifterOut),.s(aluOutMuxEn),.y(aluToReg));
	mux2 #(WIDTH) regWriteMux(.d0(dataBus),.d1(aluOut),.s(regWriteMuxEn),.y(regWriteData));
	mux2 #(WIDTH) aluBMux(.d0(signedExtOut),.d1(regb),.s(aluBMuxEn),.y(muxToRegB));
	
	// sign Extension, shifter, and memory 
	signExt signExtender(.in(instruction[7:0]),.signedInd(signedExtInd),.out(signedExtOut));
	shifter #(WIDTH) shft(.A(alua),.B(alub[4:0]),.funct(shiftFunct),.Out(shifterOut));
	dataDuplicator dataDup(.input1(rega),.out1(rega1), .out2(writeData));

endmodule

module flop #(parameter WIDTH = 16)
             (input                  clk, 
              input      [WIDTH-1:0] d, 
              output reg [WIDTH-1:0] q);

   always @(posedge clk)
      q <= d;
endmodule

module flopen #(parameter WIDTH = 16)
               (input                  clk, en,
                input      [WIDTH-1:0] d, 
                output reg [WIDTH-1:0] q);

   always @(posedge clk)
      if (en) q <= d;
endmodule

module flopenr #(parameter WIDTH = 16)
                (input                  clk, reset, en,
                 input      [WIDTH-1:0] d, 
                 output reg [WIDTH-1:0] q);
 
   always @(posedge clk)
      if      (reset) q <= 0;
      else if (en)    q <= d;
endmodule

module flopenr_neg #(parameter WIDTH = 16)
                (input                  clk, reset, en,
                 input      [WIDTH-1:0] d, 
                 output reg [WIDTH-1:0] q);
 
   always @(negedge clk)
      if      (reset) q <= 0;
      else if (en)    q <= d;
endmodule

module mux2 #(parameter WIDTH = 16)
             (input  [WIDTH-1:0] d0, d1, 
              input              s, 
              output [WIDTH-1:0] y);

   assign y = s ? d1 : d0; 
endmodule

module mux4 #(parameter WIDTH = 16)
             (input      [WIDTH-1:0] d0, d1, d2, d3,
              input      [1:0]       s, 
              output reg [WIDTH-1:0] y);

   always @(*)
      case(s)
         2'b00: y <= d0;
         2'b01: y <= d1;
         2'b10: y <= d2;
         2'b11: y <= d3;
      endcase
endmodule
