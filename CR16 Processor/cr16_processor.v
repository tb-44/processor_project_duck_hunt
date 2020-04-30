`timescale 1ns/1ps
////////////////////////////////////////////////////////////////////////////////
//
// ECE 3710 - TEAM PROJECT - DUCK HUNT GAME
// Trent Bennett, Ty Jensen, Haden Ondricek, Aaron Hillquist
// CR16 PROCESSOR TOP MODULE
// Module - cr16_processor.v
// Description - Top Hierarchal Processor Module - connecting datapath, controller, memory, and alu control
// Date:  Oct. 15, 2019
// 
////////////////////////////////////////////////////////////////////////////////

module CR16(clk, reset, In_devices, Out_devices,clr,hSync,vSync,vgaBlankn,vgaClk,r,g,b);
	input clk, reset;
	input [31:0] In_devices;
	output [31:0] Out_devices;
	wire [15:0] instr, writeData, readData, addr;
	wire [3:0] aluControl;
	wire shiftFunct, intrRegEn, marRegEn, regWriteEn, jumpEn, branchEn, PCEn, aluOutMuxEn, regWriteMuxEn, aluBMuxEn,JALEn, signedExtInd, 
	pcToMAREn, aluRegEn, writeEn, readEn,PSREn;
	wire [4:0] PSR;
	
	input clr;
	output hSync, vSync, vgaBlankn, vgaClk;
	output [7:0] r, g, b;
	wire[15:0] vgaData;
	wire[12:0] vgaAddr;

	alu_control alu_ctrl(.aluop(instr[15:12]), .funct_op(instr[7:4]), .alu_contrl(aluControl), .shift_control(shiftFunct));
	datapath dp(.clk(clk),.reset(reset),.intrRegEn(intrRegEn), .marRegEn(marRegEn),  .regWriteEn(regWriteEn), .jumpEn(jumpEn), .branchEn(branchEn), .PCEn(PCEn), .aluOutMuxEn(aluOutMuxEn),
					.regWriteMuxEn(regWriteMuxEn), .aluBMuxEn(aluBMuxEn), .signedExtInd(signedExtInd), .shiftFunct(shiftFunct), .pcToMAREn(pcToMAREn), .PSREn(PSREn), .JALEn(JALEn),.PSR(PSR), .aluControl(aluControl), .writeData(writeData), .readData(readData), .addr(addr), .instruction(instr));
	memory mem(.clk(clk), .addr(addr), .writeEn(writeEn), .readEn(readEn), .writeData(writeData), .readData(readData), .In_devices(In_devices), .Out_devices(Out_devices), .vgaData(vgaData), .vgaAddr(vgaAddr));
	controller cntrl(.clk(clk), .reset(reset), .op(instr[15:12]), .funct_op(instr[7:4]), .cond(instr[11:8]), .readEn(readEn),.writeEn(writeEn), .intrRegEn(intrRegEn), .marRegEn(marRegEn), .regWriteEn(regWriteEn), .jumpEn(jumpEn), .branchEn(branchEn), .PCEn(PCEn), .aluOutMuxEn(aluOutMuxEn),
						.regWriteMuxEn(regWriteMuxEn), .aluBMuxEn(aluBMuxEn), .signedExtInd(signedExtInd), .pcToMAREn(pcToMAREn), .JALEn(JALEn), .PSREn(PSREn), .PSR(PSR));
	VGA vgaMod(.clk(clk),.clr(clr), .hSync(hSync), .vSync(vSync), .vgaBlankn(vgaBlankn), .vgaClk(vgaClk), .r(r),.g(g),.b(b), .data(vgaData),.addr(vgaAddr));
	
endmodule