module Zapper(clk, trigger1, detect1, trigger2, detect2, hit);
	input trigger1, trigger2, detect1, detect2, clk;
	reg trigreg1, trigreg2;
	output reg [3:0] hit;
	reg [23:0] count;
	parameter HOLD = 24'd50000000;
	//Set reg values 
	initial begin
		trigreg1 <= 0;
		trigreg2 <= 0;	//Trigger is active low, trigreg follows convention to hold as needed.
		/*
		hit:
		hit[0]: detect1, high for success, low for miss 
		hit[1]: trigger1, high for pull, low for ready
		hit[2]: detect2, high for success, low for miss 
		hit[3]: trigger2, high for pull, low for ready
		*/
		hit [3:0] <= 4'b0000;	
		count <= 0; 	//counter
	end
	always @(posedge clk) begin
		//When trigger is pulled, set trigreg to 1, set hit for gun to 1, set count to 0, don't re-enter until trigreg goes back to 0
		if(trigger1 == 1 && trigreg1 == 0)//&& trigger2 == 0 
			begin
				trigreg1 = 1;
				hit [1:0] = 2'b10;
				count = 0;
			end	

		/*
		After trigger is pulled, send out a pulse so the background can be flashed to black 
		and the glyphs around the duck can be flashed white
		*/
		if(trigreg1 == 1 && trigreg2 == 0) begin
			count = count + 1;
			//once in this loop don't let gun2 detect a hit until its done
			hit[2] = 0;
			//If a hit it detected OR the timer runs out, reset 
			//the values back to default to await the next trigger pull
			if(detect1 == 1)begin
				hit [1:0] = 2'b11;
			end
			if((trigreg1 == 1 && hit[1:0] == 2'b11) && (count < HOLD))
			begin 
				hit [1] = 0;
				trigreg1 = 0;
			end
			else if(trigreg1 == 1 && count == HOLD)
			begin
				hit [1] = 0;
				trigreg1 = 0;
			end
		end	
		else if (trigreg2 == 1 && trigreg1 == 0) begin
			count = count + 1;
			hit[0] = 0;
			if(detect2 == 1) begin
				hit [3:2] = 2'b11;
			end
			if((trigreg2 == 1 && hit[3:2] == 2'b11) && (count < HOLD))begin
				hit [3] = 0;
				trigreg2 = 0;
			end
			else if (trigreg2 == 1 && count == HOLD)begin
				hit [3] = 0;
				trigreg2 = 0;
			end
		end
	end
endmodule