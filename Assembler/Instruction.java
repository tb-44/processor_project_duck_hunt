/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assembler;

import java.util.ArrayList;

public class Instruction {
    public String b1 = "";
    public String b2 = "";
    public String b3 = "";
    public String b4 = "";
    public String imm = "";
    public String binImm = "";
    public String immExt = "";
    public Var var;
    int addr = 0;
    int value = 0;
    int instructionAddress = 0;
    String binAddr = "";
    Label l;
    public ArrayList<String> binaryInstructions;
    public ArrayList<String> hexInstructions;
    public boolean littleEndian;
    ArrayList<Label> labels;
    ArrayList<Var> vars;

    public Instruction(String str, boolean _littleEndian, ArrayList<Label> _labels, ArrayList<Var> _vars,
            int _instrAddr) {
        littleEndian = _littleEndian;
        labels = _labels;
        vars = _vars;
        instructionAddress = _instrAddr;
        binaryInstructions = new ArrayList<String>();
        hexInstructions = new ArrayList<String>();
        String temp[] = str.split(" ");
        switch (temp[0]) {
            case "ADD":
                b2 = this.getBinary(temp[2], 4);
                b4 = temp[1];
                b3 = "0101";
                b1 = "0000";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "ADDI":
                imm = temp[2];
                b2 = this.getBinary(temp[1], 4);
                b1 = "0101";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "ADDU":
                b2 = this.getBinary(temp[2], 4);
                b4 = temp[1];
                b3 = "0110";
                b1 = "0000";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "ADDUI":
                imm = temp[2];
                b2 = this.getBinary(temp[1], 4);
                b1 = "0110";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "ADDC":
                b2 = this.getBinary(temp[2], 4);
                b4 = temp[1];
                b3 = "0111";
                b1 = "0000";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "ADDCI":
                imm = temp[2];
                b2 = this.getBinary(temp[1], 4);
                b1 = "0111";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "MUL":
                b2 = this.getBinary(temp[2], 4);
                b4 = temp[1];
                b3 = "1110";
                b1 = "0000";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "MULI":
                imm = temp[2];
                b2 = this.getBinary(temp[1], 4);
                b1 = "1110";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "SUB":
                b2 = this.getBinary(temp[2], 4);
                b4 = temp[1];
                b3 = "1001";
                b1 = "0000";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "SUBI":
                imm = temp[2];
                b2 = this.getBinary(temp[1], 4);
                b1 = "1001";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "SUBC":
                b2 = this.getBinary(temp[2], 4);
                b4 = temp[1];
                b3 = "1010";
                b1 = "0000";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "SUBCI":
                imm = temp[2];
                b2 = this.getBinary(temp[1], 4);
                b1 = "1010";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "CMP":
                b2 = this.getBinary(temp[2], 4);
                b4 = temp[1];
                b3 = "1011";
                b1 = "0000";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "CMPI":
                imm = temp[2];
                b2 = this.getBinary(temp[1], 4);
                b1 = "1011";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "AND":
                b2 = this.getBinary(temp[2], 4);
                b4 = temp[1];
                b3 = "0001";
                b1 = "0000";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "ANDI":
                imm = temp[2];
                b2 = this.getBinary(temp[1], 4);
                b1 = "0001";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "OR":
                b2 = this.getBinary(temp[2], 4);
                b4 = temp[1];
                b3 = "0010";
                b1 = "0000";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "ORI":
                imm = temp[2];
                b2 = this.getBinary(temp[1], 4);
                b1 = "0010";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "XOR":
                b2 = this.getBinary(temp[2], 4);
                b4 = temp[1];
                b3 = "0011";
                b1 = "0000";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "XORI":
                imm = temp[2];
                b2 = this.getBinary(temp[1], 4);
                b1 = "0011";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "MOV":
                b2 = this.getBinary(temp[2], 4);
                b4 = temp[1];
                b3 = "1101";
                b1 = "0000";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "MOVI":
                imm = temp[2];
                b2 = this.getBinary(temp[1], 4);
                b1 = "1101";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "LSH":
                b2 = this.getBinary(temp[2], 4);
                b4 = temp[1];
                b3 = "0100";
                b1 = "1000";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "LSHI":
                imm = temp[2];
                immExt = "000";
                b2 = this.getBinary(temp[1], 4);
                b1 = "1000";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "ASHU":
                b2 = this.getBinary(temp[2], 4);
                b4 = temp[1];
                b3 = "0110";
                b1 = "1000";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "ASHUI":
                imm = temp[2];
                immExt = "001";
                b2 = this.getBinary(temp[1], 4);
                b1 = "1000";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "LUI":
                imm = temp[2];
                b2 = this.getBinary(temp[1], 4);
                b1 = "1111";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "LOAD":
                b2 = this.getBinary(temp[1], 4);
                b4 = temp[2];
                b1 = "0100";
                b3 = "0000";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "STOR":
                b2 = this.getBinary(temp[1], 4);
                b4 = temp[2];
                b3 = "0100";
                b1 = "0100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "SNXB":
                b4 = temp[2];
                b2 = this.getBinary(temp[1], 4);
                b3 = "0100";
                b1 = "0100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "ZRXB":
                b4 = temp[2];
                b2 = this.getBinary(temp[1], 4);
                b3 = "0110";
                b1 = "0100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "BEQ":
                imm = temp[1];
                b2 = "0000";
                b1 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "BNE":
                imm = temp[1];
                b2 = "0001";
                b1 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "BGE":
                imm = temp[1];
                b2 = "1101";
                b1 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "BCS":
                imm = temp[1];
                b2 = "0010";
                b1 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "BCC":
                imm = temp[1];
                b2 = "0011";
                b1 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "BHI":
                imm = temp[1];
                b2 = "0100";
                b1 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "BLS":
                imm = temp[1];
                b2 = "0101";
                b1 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "BLO":
                imm = temp[1];
                b2 = "1010";
                b1 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "BHS":
                imm = temp[1];
                b2 = "1011";
                b1 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "BGT":
                imm = temp[1];
                b2 = "0110";
                b1 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "BLE":
                imm = temp[1];
                b2 = "0111";
                b1 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "BFS":
                imm = temp[1];
                b2 = "1000";
                b1 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "BFC":
                imm = temp[1];
                b2 = "1001";
                b1 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "BLT":
                imm = temp[1];
                b2 = "1100";
                b1 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "BUC":
                imm = temp[1];
                b2 = "1110";
                b1 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "JEQ":
                b4 = temp[1];
                b2 = "0000";
                b1 = "0100";
                b3 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "JNE":
                b4 = temp[1];
                b2 = "0001";
                b1 = "0100";
                b3 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "JGE":
                b4 = temp[1];
                b2 = "0001";
                b1 = "1101";
                b3 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "JCS":
                b4 = temp[1];
                b2 = "0001";
                b1 = "0010";
                b3 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "JCC":
                b4 = temp[1];
                b2 = "0011";
                b1 = "0100";
                b3 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "JHI":
                b4 = temp[1];
                b2 = "0100";
                b1 = "0100";
                b3 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "JLS":
                b4 = temp[1];
                b2 = "0101";
                b1 = "0100";
                b3 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "JLO":
                b4 = temp[1];
                b2 = "1010";
                b1 = "0100";
                b3 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "JHS":
                b4 = temp[1];
                b2 = "1011";
                b1 = "0100";
                b3 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "JGT":
                b4 = temp[1];
                b2 = "0110";
                b1 = "0100";
                b3 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "JLE":
                b4 = temp[1];
                b2 = "0111";
                b1 = "0100";
                b3 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "JFS":
                b4 = temp[1];
                b2 = "1000";
                b1 = "0100";
                b3 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "JFC":
                b4 = temp[1];
                b2 = "1001";
                b1 = "0100";
                b3 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "JLT":
                b4 = temp[1];
                b2 = "1100";
                b1 = "0100";
                b3 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "JUC":
                b4 = temp[1];
                b2 = "1110";
                b1 = "0100";
                b3 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "JAL":
                b4 = temp[2];
                b2 = this.getBinary(this.parseString(temp[1]), 4);
                b3 = "1000";
                b1 = "0100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "TBIT":
                b4 = temp[2];
                b2 = temp[1];
                b3 = "1010";
                b1 = "0100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "TBITI":
                b4 = temp[2];
                b2 = temp[1];
                b3 = "1110";
                b1 = "0100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "LPR":
                b4 = temp[2];
                b2 = temp[1];
                b3 = "0001";
                b1 = "0100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "SPR":
                b4 = temp[2];
                b2 = temp[1];
                b3 = "0101";
                b1 = "0100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "DI":
                b4 = "0";
                b2 = "0";
                b3 = "0011";
                b1 = "0100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "EI":
                b4 = "0";
                b2 = "0";
                b3 = "0111";
                b1 = "0100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "EXCP":
                b4 = temp[1];
                b2 = "0";
                b3 = "1011";
                b1 = "0100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "RETX":
                b4 = "0";
                b2 = "0";
                b3 = "1001";
                b1 = "0100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "WAIT":
                b4 = "0";
                b2 = "0";
                b3 = "0000";
                b1 = "0000";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "SUBU":
                b4 = temp[2];
                b2 = temp[1];
                b3 = "1000";
                b1 = "0000";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "NOT":
                b4 = temp[2];
                b2 = temp[1];
                b3 = "1100";
                b1 = "0000";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "SUBUI":
                imm = temp[2];
                b2 = temp[1];
                b1 = "1010";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "JUMPEQ":
                this.jumpAndBranchImm(temp[3]);
                binImm = "";
                b4 = temp[1];
                b3 = "1011";
                b2 = this.getBinary(temp[2], 4);
                b1 = "0000";
                binaryInstructions.add(this.createBinaryMachineCode());
                b4 = "14";
                b2 = "0000";
                b1 = "0100";
                b3 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "JUMPNE":
                this.jumpAndBranchImm(temp[3]);
                binImm = "";
                b4 = temp[1];
                b3 = "1011";
                b2 = this.getBinary(temp[2], 4);
                b1 = "0000";
                binaryInstructions.add(this.createBinaryMachineCode());
                b4 = "14";
                b2 = "0001";
                b1 = "0100";
                b3 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "JUMPGE":
                this.jumpAndBranchImm(temp[3]);
                binImm = "";
                b4 = temp[1];
                b3 = "1011";
                b2 = this.getBinary(temp[2], 4);
                b1 = "0000";
                binaryInstructions.add(this.createBinaryMachineCode());
                b4 = "14";
                b2 = "0001";
                b1 = "1101";
                b3 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "JUMPCS":
                this.jumpAndBranchImm(temp[3]);
                binImm = "";
                b4 = temp[1];
                b3 = "1011";
                b2 = this.getBinary(temp[2], 4);
                b1 = "0000";
                binaryInstructions.add(this.createBinaryMachineCode());
                b4 = "14";
                b2 = "0001";
                b1 = "0010";
                b3 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "JUMPCC":
                this.jumpAndBranchImm(temp[3]);
                binImm = "";
                b4 = temp[1];
                b3 = "1011";
                b2 = this.getBinary(temp[2], 4);
                b1 = "0000";
                binaryInstructions.add(this.createBinaryMachineCode());
                b4 = "14";
                b2 = "0011";
                b1 = "0100";
                b3 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "JUMPHI":
                this.jumpAndBranchImm(temp[3]);
                binImm = "";
                b4 = temp[1];
                b3 = "1011";
                b2 = this.getBinary(temp[2], 4);
                b1 = "0000";
                binaryInstructions.add(this.createBinaryMachineCode());
                b4 = "14";
                b2 = "0100";
                b1 = "0100";
                b3 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "JUMPLS":
                this.jumpAndBranchImm(temp[3]);
                binImm = "";
                b4 = temp[1];
                b3 = "1011";
                b2 = this.getBinary(temp[2], 4);
                b1 = "0000";
                binaryInstructions.add(this.createBinaryMachineCode());
                b4 = "14";
                b2 = "0101";
                b1 = "0100";
                b3 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "JUMPLO":
                this.jumpAndBranchImm(temp[3]);
                binImm = "";
                b4 = temp[1];
                b3 = "1011";
                b2 = this.getBinary(temp[2], 4);
                b1 = "0000";
                binaryInstructions.add(this.createBinaryMachineCode());
                b4 = "14";
                b2 = "1010";
                b1 = "0100";
                b3 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "JUMPHS":
                this.jumpAndBranchImm(temp[3]);
                binImm = "";
                b4 = temp[1];
                b3 = "1011";
                b2 = this.getBinary(temp[2], 4);
                b1 = "0000";
                binaryInstructions.add(this.createBinaryMachineCode());
                b4 = "14";
                b2 = "1011";
                b1 = "0100";
                b3 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "JUMPGT":
                this.jumpAndBranchImm(temp[3]);
                binImm = "";
                b4 = temp[1];
                b3 = "1011";
                b2 = this.getBinary(temp[2], 4);
                b1 = "0000";
                binaryInstructions.add(this.createBinaryMachineCode());
                b4 = "14";
                b2 = "0110";
                b1 = "0100";
                b3 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "JUMPLE":
                this.jumpAndBranchImm(temp[3]);
                binImm = "";
                b4 = temp[1];
                b3 = "1011";
                b2 = this.getBinary(temp[2], 4);
                b1 = "0000";
                binaryInstructions.add(this.createBinaryMachineCode());
                b4 = "14";
                b2 = "0111";
                b1 = "0100";
                b3 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "JUMPFS":
                this.jumpAndBranchImm(temp[3]);
                binImm = "";
                b4 = temp[1];
                b3 = "1011";
                b2 = this.getBinary(temp[2], 4);
                b1 = "0000";
                binaryInstructions.add(this.createBinaryMachineCode());
                b4 = "14";
                b2 = "1000";
                b1 = "0100";
                b3 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "JUMPFC":
                this.jumpAndBranchImm(temp[3]);
                binImm = "";
                b4 = temp[1];
                b3 = "1011";
                b2 = this.getBinary(temp[2], 4);
                b1 = "0000";
                binaryInstructions.add(this.createBinaryMachineCode());
                b4 = "14";
                b2 = "1001";
                b1 = "0100";
                b3 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "JUMPLT":
                this.jumpAndBranchImm(temp[3]);
                binImm = "";
                b4 = temp[1];
                b3 = "1011";
                b2 = this.getBinary(temp[2], 4);
                b1 = "0000";
                binaryInstructions.add(this.createBinaryMachineCode());
                b4 = "14";
                b2 = "1100";
                b1 = "0100";
                b3 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "JUMPUC":
                this.jumpAndBranchImm(temp[1]);
                binImm = "";
                b4 = "14";
                b2 = "1110";
                b1 = "0100";
                b3 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "JUMPAL":
                this.jumpAndBranchImm(temp[2]);
                // this.jumpAndBranchImm(this.instructionAddress + 1);
                binImm = "";
                b4 = "14";
                b2 = this.getBinary(temp[1], 4);
                b3 = "1000";
                b1 = "0100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "BRANCHEQ":
                l = this.labelSubstitution(temp[1]);
                addr = this.instructionAddress - l.address;
                binImm = this.getBinary(addr, 16);
                b2 = "0000";
                b1 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "BRANCHNE":
                l = this.labelSubstitution(temp[1]);
                addr = this.instructionAddress - l.address;
                binImm = this.getBinary(addr, 16);
                b2 = "0001";
                b1 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "BRANCHGE":
                l = this.labelSubstitution(temp[1]);
                addr = this.instructionAddress - l.address;
                binImm = this.getBinary(addr, 16);
                b2 = "1101";
                b1 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "BRANCHCS":
                l = this.labelSubstitution(temp[1]);
                addr = this.instructionAddress - l.address;
                binImm = this.getBinary(addr, 16);
                b2 = "0010";
                b1 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "BRANCHCC":
                l = this.labelSubstitution(temp[1]);
                addr = this.instructionAddress - l.address;
                binImm = this.getBinary(addr, 16);
                b2 = "0011";
                b1 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "BRANCHHI":
                l = this.labelSubstitution(temp[1]);
                addr = this.instructionAddress - l.address;
                binImm = this.getBinary(addr, 16);
                b2 = "0100";
                b1 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "BRANCHLS":
                l = this.labelSubstitution(temp[1]);
                addr = this.instructionAddress - l.address;
                binImm = this.getBinary(addr, 16);
                b2 = "0101";
                b1 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "BRANCHLO":
                l = this.labelSubstitution(temp[1]);
                addr = this.instructionAddress - l.address;
                binImm = this.getBinary(addr, 16);
                b2 = "1010";
                b1 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "BRANCHHS":
                l = this.labelSubstitution(temp[1]);
                addr = this.instructionAddress - l.address;
                binImm = this.getBinary(addr, 16);
                b2 = "1011";
                b1 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "BRANCHGT":
                l = this.labelSubstitution(temp[1]);
                addr = this.instructionAddress - l.address;
                binImm = this.getBinary(addr, 16);
                b2 = "0110";
                b1 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "BRANCHLE":
                l = this.labelSubstitution(temp[1]);
                addr = this.instructionAddress - l.address;
                binImm = this.getBinary(addr, 16);
                b2 = "0111";
                b1 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "BRANCHFS":
                l = this.labelSubstitution(temp[1]);
                addr = this.instructionAddress - l.address;
                binImm = this.getBinary(addr, 16);
                b2 = "1000";
                b1 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "BRANCHFC":
                l = this.labelSubstitution(temp[1]);
                addr = this.instructionAddress - l.address;
                binImm = this.getBinary(addr, 16);
                b2 = "1001";
                b1 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "BRANCHLT":
                l = this.labelSubstitution(temp[1]);
                addr = this.instructionAddress - l.address;
                binImm = this.getBinary(addr, 16);
                b2 = "1100";
                b1 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "BRANCHUC":
                l = this.labelSubstitution(temp[1]);
                addr = this.instructionAddress - l.address;
                binImm = this.getBinary(addr, 16);
                b2 = "1110";
                b1 = "1100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "STORI":
                this.load16bitVal(this.parseString(temp[1]), 14);
                this.load16bitVal(this.parseString(temp[2]), 13);
                imm = "";
                binImm = "";
                b4 = "14";
                b2 = this.getBinary(13, 4);
                b3 = "0100";
                b1 = "0100";
                binaryInstructions.add(this.createBinaryMachineCode());

                break;
            case "LOADI":
                binAddr = this.getBinary(temp[2], 16);
                binImm = binAddr.substring(0, 7);
                b2 = temp[1];
                b1 = "1111";
                binaryInstructions.add(this.createBinaryMachineCode());
                binImm = binAddr.substring(8, 16);
                b2 = temp[1];
                b1 = "1101";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "SETVAR":
                this.varImm(temp[2]);
                b2 = this.getBinary(temp[1], 4);
                b4 = "14";
                b3 = "0100";
                b1 = "0100";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "GETVAR":
                this.varImm(temp[2]);
                b2 = this.getBinary(temp[1], 4);
                b4 = "14";
                b1 = "0100";
                b3 = "0000";
                binaryInstructions.add(this.createBinaryMachineCode());
                break;
            case "VGADUMMY":
                switch (temp[1]) {
                    case "BLUE":
                        binaryInstructions.add("1000000000011111");
                        break;
                    case "RED":
                        binaryInstructions.add("1111110000000000");
                        break;
                    case "GREEN":
                        binaryInstructions.add("1000001111100000");
                        break;
                    case "YELLOW":
                        binaryInstructions.add("1111111111100000");
                        break;
                    case "PURPLE":
                        binaryInstructions.add("1111111111100000");
                        break;
                    default:
                        binaryInstructions.add(temp[1]);
                        break;
                }
                break;
            case "GLYPHLINE":
                String s = "";
                for (int i = 1; i < temp.length; i++) {
                    switch (temp[i]) {
                        case "B":
                            s += "00000111";
                            break;
                        case "R":
                            s += "01100000";
                            break;
                        case "G":
                            s += "0011000";
                            break;
                        case "Y":
                            s += "01111000";
                            break;
                        case "P":
                            s += "01100110";
                            break;
                        case "T":
                            s += "10000000";
                            break;
                        default:
                            s += temp[i];
                            break;
                    }

                }
                binaryInstructions.add(s);
                break;
            default:
                break;
        }

    }

    private void load16bitVal(String str, int reg) {
        value = Integer.parseInt(str);
        String tempBinImm = this.getBinary(value, 16);
        String strReg = this.getBinary(reg, 4);
        binImm = tempBinImm.substring(8, 16);
        b2 = strReg;
        b1 = "1101";
        binaryInstructions.add(this.createBinaryMachineCode());
        binImm = tempBinImm.substring(0, 8);
        b2 = strReg;
        b1 = "1111";
        binaryInstructions.add(this.createBinaryMachineCode());
    }

    private void jumpAndBranchImm(String str) {
        l = this.labelSubstitution(str);
        addr = l.address;
        binAddr = this.getBinary(addr, 16);
        binImm = binAddr.substring(8, 16);
        b2 = "1110";
        b1 = "1101";
        binaryInstructions.add(this.createBinaryMachineCode());
        binImm = binAddr.substring(0, 8);
        b2 = "1110";
        b1 = "1111";
        binaryInstructions.add(this.createBinaryMachineCode());
    }

    private void varImm(String str) {
        var = this.varSubstitution(str);
        addr = var.address;
        binAddr = this.getBinary(addr, 16);
        binImm = binAddr.substring(8, 16);
        b2 = "1110";
        b1 = "1101";
        binaryInstructions.add(this.createBinaryMachineCode());
        binImm = binAddr.substring(0, 8);
        b2 = "1110";
        b1 = "1111";
        binaryInstructions.add(this.createBinaryMachineCode());
    }

    private void jumpAndBranchImm(int num) {
        addr = num;
        binAddr = this.getBinary(addr, 16);
        binImm = binAddr.substring(8, 16);
        b2 = "1110";
        b1 = "1101";
        binaryInstructions.add(this.createBinaryMachineCode());
        binImm = binAddr.substring(0, 8);
        b2 = "1110";
        b1 = "1111";
        binaryInstructions.add(this.createBinaryMachineCode());
    }

    private Label labelSubstitution(String str) {
        for (Label lab : labels) {
            if (lab.label.equals(str)) {
                return lab;
            }
        }
        return null;
    }

    private Var varSubstitution(String str) {
        for (Var v : vars) {
            if (v.name.equals(str)) {
                return v;
            }
        }
        return null;
    }

    public String createBinaryMachineCode() {
        String result = b1 + b2 + b3 + getBinary(b4, 4) + immExt + binImm + getBinary(imm, 8 - immExt.length());
        if (littleEndian) {
            result = littleEndian(result);
        }
        return result;
    }

    public int size() {
        return this.binaryInstructions.size();
    }

    public String littleEndian(String str) {
        String result = "";
        for (char c : str.toCharArray()) {
            result = c + result;
        }
        return result;
    }

    public String parseString(String str) {
        String result = "";
        String temp = str;
        // boolean signed = false;
        if (str.equals("")) {
            result = "";
        } else {
            // String temp = str.substring(1, str.length());
            temp = this.remove(temp, 'r');
            temp = this.remove(temp, ',');
            temp = this.remove(temp, '$');
            result = temp;
        }

        return result;
    }

    public String getBinary(String str, int places) {
        String result = "";
        if (str.equals("")) {
            return result;
        } else {
            Integer tempInt = Integer.parseInt(parseString(str));
            Binary bin = new Binary(tempInt, places);
            result = bin.getValue();

            return result;
        }
    }

    public String getBinary(int num, int places) {
        String result = "";
        Binary bin = new Binary(num, places);
        result = bin.getValue();

        return result;
    }

    public void getHexMachineCode() {
        for (String s : binaryInstructions) {
            hexInstructions.add(this.getHex(s));
        }
    }

    public String getHex(String str, int places) {
        // String result = "";
        if (!parseString(str).equals("")) {
            Integer tempInt = Integer.parseInt(parseString(str));
            Binary bin = new Binary(tempInt, places);
            Hex h = new Hex(bin.getValue());
            return h.getHex();
        }
        return "";
    }

    public String getHex(int num, int places) {
        // String result = "";
        Binary bin = new Binary(num, places);
        Hex h = new Hex(bin.getValue());
        return h.getHex();
    }

    public String getHex(String str) {
        // String result = "";
        Binary bin = new Binary(str);
        Hex h = new Hex(bin.getValue());
        return h.getHex();
    }

    private String remove(String str, char chr) {
        String result = "";
        for (char c : str.toCharArray()) {
            if (chr != c) {
                result += c;
            }
        }
        return result;
    }
}