module IOTop #(parameter WIDTH = 16, RAM_ADDR_BITS = 16)
   (input clk, en,
    input memwrite, memread,
    input [RAM_ADDR_BITS-1:0] adr,
    input [WIDTH-1:0] writedata,
    output [WIDTH-1:0] dataOut,
	 output [31:0] Out_devices,
	 input [31:0] In_devices
    );
	 wire clkEn, ioEn, randen, timerEn, zapEN, trig, data;
	 wire[15:0] outClk, IOMemData, randomNum, outTimer, ZapTrig;
	 wire[1:0] muxSel, zapd;
	 
	 assign randen = adr == 16'b1011111111111101;
	 assign clkEn = adr == 16'b1011111111111111;
	 assign timerEn = adr == 16'b1011111111111110;
	 assign zapEn = adr == 16'b1011111111111100;
	 assign ioEn = ~clkEn && ~randen && ~timerEn && ~zapEn; 
	
	mux4 ioMux(.d0(outClk), .d1({14'd0,zapd}), .d2(randomNum), .d3(outTimer), .s(muxSel), .y(dataOut));
	enDecoder enDec(.en0(clkEn),.en1(zapEn),.en2(randen),.en3(timerEn),.outEn(muxSel));
	xorshift_rng rng(.clk(clk), .xs(randomNum)); // vgaData in the mux_mem might need changed.	
	clock clkdiv(.clk(clk), .reset(reset), .outClk(outClk));
	timer time1(.clk(clk), .reset(reset), .en(timerEn), .outClk(outTimer), .timerRes(memwrite));
	//IO io(.clk(clk), .en(ioEn), .memwrite(memwrite), .memread(memread), .adr(adr), .writedata(writedata), .memdata(IOMemData), .Out_devices(Out_devices), .In_devices(In_devices));
	zapper zap(.t(In_devices[0]), .d(In_devices[1]), .to(Out_devices[0]), .do(Out_devices[1]), .out(zapd));
	//Zapper zap1(.clk(clk), .trigger(ZapTrig), .detect(detect), .pulse(pulse), .hit(hit));
	
	endmodule
	
module zapper(t,d,to,do,out);
	input t, d;
	output reg [1:0]out;
	output reg to,do;
	
	always @ (*)begin
		to = t;
		do = d;
		if(t & d)begin
			out = 2'b11;
		end
		else if(t & ~d)begin
			out = 2'b10;
		end
		else begin
			out = 2'b00;
		end
	end
	
endmodule