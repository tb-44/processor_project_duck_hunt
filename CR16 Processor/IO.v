////////////////////////////////////////////////////////////////////////////////
//
// ECE 3710 - TEAM PROJECT - DUCK HUNT GAME
// Trent Bennett, Ty Jensen, Haden Ondricek, Aaron Hillquist
// I/O MEMORY MODULE
// Module - IO.v
// Description - 16 bit memory I/O module
// Date:  Oct. 2, 2019
// 
////////////////////////////////////////////////////////////////////////////////

module IO #(parameter WIDTH = 16, RAM_ADDR_BITS = 16)
   (input clk, en,
    input memwrite, memread,
    input [RAM_ADDR_BITS-1:0] adr,
    input [WIDTH-1:0] writedata,
    output reg [WIDTH-1:0] memdata,
	 output reg [31:0] Out_devices,
	 input [31:0] In_devices
    );

	always @ (posedge clk) begin
      if (en) begin
			memdata <= 16'b0000000000000000;
			case (adr[4:0])
				5'b00000:begin
					if (memwrite) 
						Out_devices[0] <= writedata[0];
					else if(memread) 
						memdata[0] <= In_devices[0];
				end
				5'b00001:begin
					if (memwrite) 
						Out_devices[1] <= writedata[0];
					else if(memread) 
						memdata[0] <= In_devices[1];
				end
				5'b00010:begin
					if (memwrite) 
						Out_devices[2] <= writedata[0];
					else if(memread) 
						memdata[0] <= In_devices[2];
				end
				5'b00011:begin
					if (memwrite) 
						Out_devices[3] <= writedata[0];
					else if(memread) 
						memdata[0] <= In_devices[3];
				end
				5'b00100:begin
					if (memwrite) 
						Out_devices[4] <= writedata[0];
					else if(memread) 
						memdata[0] <= In_devices[4];
				end
				
				5'b00101:begin
					if (memwrite) 
						Out_devices[5] <= writedata[0];
					else if(memread) 
						memdata[0] <= In_devices[5];
				end
				5'b00110:begin
					if (memwrite) 
						Out_devices[6] <= writedata[0];
					else if(memread) 
						memdata[0] <= In_devices[6];
				end
				5'b00111:begin
					if (memwrite) 
						Out_devices[7] <= writedata[0];
					else if(memread) 
						memdata[0] <= In_devices[7];
				end
				5'b01000:begin
					if (memwrite) 
						Out_devices[8] <= writedata[0];
					else if(memread) 
						memdata[0] <= In_devices[8];
				end
				5'b01001:begin
					if (memwrite) 
						Out_devices[9] <= writedata[0];
					else if(memread) 
						memdata[0] <= In_devices[9];
				end
				
				5'b01010:begin
					if (memwrite) 
						Out_devices[10] <= writedata[0];
					else if(memread) 
						memdata[0] <= In_devices[10];
				end
				5'b01011:begin
					if (memwrite) 
						Out_devices[11] <= writedata[0];
					else if(memread) 
						memdata[0] <= In_devices[11];
				end
				5'b01100:begin
					if (memwrite) 
						Out_devices[12] <= writedata[0];
					else if(memread) 
						memdata[0] <= In_devices[12];
				end
				5'b01101:begin
					if (memwrite) 
						Out_devices[13] <= writedata[0];
					else if(memread) 
						memdata[0] <= In_devices[13];
				end
				5'b01110:begin
					if (memwrite) 
						Out_devices[14] <= writedata[0];
					else if(memread) 
						memdata[0] <= In_devices[14];
				end
				
				5'b01111:begin
					if (memwrite) 
						Out_devices[15] <= writedata[0];
					else if(memread) 
						memdata[0] <= In_devices[15];
				end
				
				5'b10000:begin
					if (memwrite) 
						Out_devices[16] <= writedata[0];
					else if(memread) 
						memdata[0] <= In_devices[16];
				end
				5'b10001:begin
					if (memwrite) 
						Out_devices[17] <= writedata[0];
					else if(memread) 
						memdata[0] <= In_devices[17];
				end
				5'b10010:begin
					if (memwrite) 
						Out_devices[18] <= writedata[0];
					else if(memread) 
						memdata[0] <= In_devices[18];
				end
				5'b10011:begin
					if (memwrite) 
						Out_devices[19] <= writedata[0];
					else if(memread) 
						memdata[0] <= In_devices[19];
				end
				5'b10100:begin
					if (memwrite) 
						Out_devices[20] <= writedata[0];
					else if(memread) 
						memdata[0] <= In_devices[20];
				end
				5'b10101:begin
					if (memwrite) 
						Out_devices[21] <= writedata[0];
					else if(memread) 
						memdata[0] <= In_devices[21];
				end
				5'b10110:begin
					if (memwrite) 
						Out_devices[22] <= writedata[0];
					else if(memread) 
						memdata[0] <= In_devices[22];
				end
				5'b10111:begin
					if (memwrite) 
						Out_devices[23] <= writedata[0];
					else if(memread) 
						memdata[0] <= In_devices[23];
				end
				5'b11000:begin
					if (memwrite) 
						Out_devices[24] <= writedata[0];
					else if(memread) 
						memdata[0] <= In_devices[24];
				end
				5'b11001:begin
					if (memwrite) 
						Out_devices[25] <= writedata[0];
					else if(memread) 
						memdata[0] <= In_devices[25];
				end
				5'b11010:begin
					if (memwrite) 
						Out_devices[26] <= writedata[0];
					else if(memread) 
						memdata[0] <= In_devices[26];
				end
				5'b11011:begin
					if (memwrite) 
						Out_devices[27] <= writedata[0];
					else if(memread) 
						memdata[0] <= In_devices[27];
				end
				5'b11100:begin
					if (memwrite) 
						Out_devices[28] <= writedata[0];
					else if(memread) 
						memdata[0] <= In_devices[28];
				end
				5'b11101:begin
					if (memwrite) 
						Out_devices[29] <= writedata[0];
					else if(memread) 
						memdata[0] <= In_devices[29];
				end
				5'b11110:begin
					if (memwrite) 
						Out_devices[30] <= writedata[0];
					else if(memread) 
						memdata[0] <= In_devices[30];
				end
				5'b11111:begin
					if (memwrite) 
						Out_devices[31] <= writedata[0];
					else if(memread) 
						memdata[0] <= In_devices[31];
				end
				default:begin
					memdata <= 16'b0000000000000000;
				end
       endcase
		end
	end
endmodule