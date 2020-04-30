module timer(clk, reset, en, outClk, timerRes);
	input clk, reset, timerRes, en;
	output reg [15:0] outClk = 16'd0;
	reg [15:0] count=16'd0;
	
	always@( posedge clk) begin
		count <= count + 1'b1;
		if(timerRes == 1'b1 && en == 1'b1)begin
			count <= 16'd0;
			outClk <= 16'd0;
		end
		if(count == 16'b1100001101010000)begin
			count <= 16'd0;
			outClk <= outClk + 1'b1;
		end
	end
endmodule