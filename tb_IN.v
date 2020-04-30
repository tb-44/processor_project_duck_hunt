`timescale 1ns/1ps

module tb_IN();

reg clk, trigger, detect;
//reg [9:0] adr;

Zapper UUT(.clk(clk), .trigger(trigger), .detect(detect), .pulse(pulse));

always #5 clk <=~clk;
initial 
	begin	
	clk = 0; trigger = 0; detect = 1;
		#15;
		trigger = 1;
		$display("States of: Trigger %b detect %b and pulse %b", trigger, detect, pulse); 
		#200;
		trigger = 0;
		$display("States of: Trigger %b detect %b and pulse %b", trigger, detect, pulse); 
		#200;
		detect = 1;
		$display("States of: Trigger %b detect %b and pulse %b", trigger, detect, pulse);
		#200;
		detect = 0;
		$display("States of: Trigger %b detect %b and pulse %b", trigger, detect, pulse);
		#200;
	end
endmodule