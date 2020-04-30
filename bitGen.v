module bitGen(clk,bright, r, g, b, x, y, RAMData, RAMAddr, ROMAddr,ROMData, bgEn);
	input bright,clk;
	input [15:0] RAMData;
	input [63:0] ROMData; 
	input [9:0] x,y;
	output reg [13:0] RAMAddr;
	output reg [13:0] ROMAddr;
	output reg [7:0] r,g,b;
	reg [7:0] rgb;
	reg [15:0] bg;
	input bgEn;
	parameter BLACK = 3'b000;
	parameter RED = 3'b100;
	parameter GLYPHWIDTH = 8;
	
	always @ (negedge clk) begin
		ROMAddr = RAMData[13:0]*8+y[2:0];
		RAMAddr = x[9:3] + 80*y[9:3];
		rgb = ROMData[((9-x[2:0])*GLYPHWIDTH-1)-:GLYPHWIDTH];
		bg = bg;
		
		if(bright == 1) begin
			if(RAMData[15]) begin
				if(bgEn&&x[2:0] > 3'b101)bg = RAMData;
					r = {RAMData[14:10],3'b000};
					g = {RAMData[9:5],3'b000};
					b = {RAMData[4:0],3'b000};
			end
			else begin
			
				if(rgb[7])begin
					//added here -- NEED TO FIX THIS!!
					if(rgb & 1) begin
						r = 8'b00000000;
						g = 8'b00000000;
						b = 8'b00000000;
					end
					else begin
					r = {bg[14:10],3'b000};
					g = {bg[9:5],3'b000};
					b = {bg[4:0],3'b000};
					end
				end
				else begin
					if(rgb == 8'b00000000)begin
						{r,g,b} = 24'd0;
					end
					else begin
						r= {rgb[6:5],6'b111111};
						g= {rgb[4:3],6'b111111};
						b= {rgb[2:0],5'b11111};
					end
					
				end
			end
		end
		else begin
			{r,g,b} = 24'd0;
				bg = bg;
		end
	end
endmodule