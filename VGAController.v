module vgaController(clk, clr, vgaBlankn, hSync, vSync, bright,vgaClk,x,y,bgEn);
	input clk, clr;
	output hSync, vSync;
	output reg bright, vgaBlankn, vgaClk;
	output reg [9:0] x,y;
	reg [9:0] hCount, vCount;
	reg counter;
	output reg bgEn;
	
	//parameters for the vga different regions of the horizontal and vertical outputs
	parameter hs_start = 16;
	parameter hs_sync = 96;
	parameter hs_end = 48;
	parameter hs_total = 800;
	parameter hs_init = 640;
	parameter vs_init = 480;
	parameter vs_start = 10;
	parameter vs_sync = 2;
	parameter vs_end = 33;
	parameter vs_total = 525;
	
	always@(posedge clk)
	begin
		if(clr == 0) begin //initalize counters when reset
			hCount <= 0;
			vCount <= 0;
			counter <=0;
			vgaClk <= 0;
		end
		else if(counter ==1)begin
			hCount <= hCount + 1;
			if(hCount == hs_total)begin
				hCount <= 0;
				vCount <= vCount +1;
				if(vCount == vs_total)begin
					vCount <=0;
				end
			end
		end
		vgaClk <=~ vgaClk;
		counter<= counter + 1;
	end
	
	assign hSync = ~((hCount >= hs_start) & (hCount < hs_start + hs_sync));
	assign vSync = ~((vCount >= (vs_init + vs_start)) & (vCount < (vs_init + vs_start + vs_sync)));
	
	always @ * begin
		//bright
		bgEn = 1'b0;
		if(hCount >= hs_sync + hs_end && hCount < hs_sync + hs_end + hs_init && vCount < vs_init) begin
			bright = 1;
			vgaBlankn = 1;
			x = hCount - (hs_sync + hs_end);
			y = vCount;
			bgEn = 1'b1;
		end	
		else begin
			x=10'b0;
			y=10'b0;
			bright = 0;
			vgaBlankn = 0;
			bgEn = 1'b0;
		end
	end
endmodule