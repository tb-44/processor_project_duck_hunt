# CR16 (16-bit) Processor - Duck Hunt Game

ECE 3710 - Fall 2019 Group Project - University of Utah

This documentation is an overall description to the CR16 ISA Processor project (Duck Hunt Game). This work includes the design/build of a 16-bit processor (from scratch) onto an Intel Cyclone V FPGA board, assembler program for selected ISA assembly instructions, I/O, and the application to run our custom version of the Nintendo Entertainment System (NES) game of Duck Hunt (application).

![Image description](images/duck_hunt_poster.png)

[Poster link](images/DuckHunt_Poster.pdf)

## Complete CR16 Processor Diagram

This diagram is the complete CR16 processor. The processor executes all the assembly instructions generated to run the application (Duck Hunt Game). The entire processor was designed and built from scratch using FPGA (using Verilog code).

The system consists of the Datapath, control finite state machine (FSM), ALU control, and memory.

![Image description](images/completeProcessor.png)

## Processor Datapath Diagram

This diagram is the complete datapath infrastructure (digital logic design). Including the program counter (PC), Instruction Registers (IR), Sign Extension, and Memory and Memory-Mapped I/O system.

![Image description](images/datapath.png)
