module enDecoder(en0,en1,en2,en3,outEn);
	input en0,en1,en2,en3;
	output reg [1:0] outEn;
	
	always @ * begin
			outEn = 2'b00;
			if(en0) outEn = 2'b00;
			else if(en1) outEn = 2'b01;
			else if(en2) outEn = 2'b10;
			else if(en3) outEn = 2'b11;
	end
endmodule