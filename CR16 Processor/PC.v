module PC(clk,reset,jumpEn,branchEn,PCEn,regDataToPC,immToPC,PCOut);
	parameter WIDTH = 16;
	input [WIDTH-1:0] regDataToPC, immToPC;
	input branchEn, jumpEn, clk, reset, PCEn;
	wire [WIDTH-1:0] aluToMux, muxToReg,muxToALU;
	output [WIDTH-1:0] PCOut;

	localparam CONST_ONE = 16'b0000000000000001;
	
	miniALU PCALU(.A(PCOut),.B(muxToALU),.Sum(aluToMux));
	flopenr_neg #(WIDTH) PCREG(.clk(clk),.reset(reset),.en(PCEn),.d(muxToReg),.q(PCOut));
	mux2 #(WIDTH) jumpMux(.d0(aluToMux),.d1(regDataToPC),.s(jumpEn),.y(muxToReg));
	mux2 #(WIDTH) branchMux(.d0(CONST_ONE),.d1(immToPC),.s(branchEn),.y(muxToALU));
	
endmodule