module tb_clk();
	reg clk, reset;
	wire [15:0]outClk;
	
	clock UUT(.clk(clk), .reset(reset), .outClk(outClk));
	
	initial
		begin
			clk = 0; reset = 1; #10;
			reset = 0; #10;
			reset = 1; #10;
		end
	
	always #5 clk <= ~clk;
endmodule