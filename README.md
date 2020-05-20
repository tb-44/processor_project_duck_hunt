# CR16 (16-bit) Processor - Duck Hunt Game

ECE 3710 - Fall 2019 Group Project - University of Utah

This documentation is a description to the CR16 ISA Processor project (Duck Hunt Game). This work includes design/build of a 16-bit processor (from scratch) onto an Intel Cyclone V FPGA board, assembler program for selected ISA assembly instructions, I/O, and the application to run our custom version of the Nintendo Entertainment System (NES) game of Duck Hunt.

![Image description](images/duck_hunt_poster.png)

[Poster link](images/DuckHunt_Poster.pdf)

## Processor Datapath Diagram

This diagram is the complete datapath infrastructure (digital logic design for FPGA (Verilog)) to our datapath design (Finite State Machine). Including the program counter (PC), Instruction Register (IR), Sign Extension, and Memory and Memory-Mapped I/O system.

![Image description](images/datapath.png)

## Complete CR16 Processor

This diagram is the complete CR16 processor. This processor can execute all the assembly instructions generated with the controls - Finite State Machine (FSM).

![Image description](images/completeProcessor.png)
