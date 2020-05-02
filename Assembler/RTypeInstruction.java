/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assembler;

public class RTypeInstruction {
    public String op = "000000";
    public String rs = "";
    public String rt = "";
    public String rd = "";
    public String shamt = "";
    public String function = "";
    public boolean littleEndian;

    public void RTypeInstruction(String str, boolean _littleEndian) {
        littleEndian = _littleEndian;
        String temp[] = str.split(" ");
        String temp1[] = temp[1].split(", ");
        switch (temp[0]) {
            case "sll":
                rd = temp1[0];
                rt = temp1[1];
                shamt = temp1[2];
                op = "000000";
                break;
            case "srl":
                rd = temp1[0];
                rt = temp1[1];
                shamt = temp1[2];
                op = "000010";
                break;
            case "sra":
                rd = temp1[0];
                rt = temp1[1];
                shamt = temp1[2];
                op = "000011";
                break;
            case "sllv":
                rd = temp1[0];
                rt = temp1[1];
                rs = temp1[2];
                op = "000100";
                break;
            case "srlv":
                rd = temp1[0];
                rt = temp1[1];
                rs = temp1[2];
                op = "000110";
                break;
            case "srav":
                rd = temp1[0];
                rt = temp1[1];
                rs = temp1[2];
                op = "000111";
                break;
            case "jr":
                rs = temp1[0];
                op = "001000";
                break;
            case "jalr":
                rd = temp1[0];
                rs = temp1[1];
                op = "001001";
                break;
            case "syscall":
                op = "001100";
                break;
            case "mfhi":
                rd = temp1[0];
                op = "010000";
                break;
            case "mthi":
                rs = temp1[0];
                op = "010001";
                break;
            case "mflo":
                rd = temp1[0];
                op = "010010";
                break;
            case "mtlo":
                rs = temp1[0];
                op = "010011";
                break;
            case "mult":
                rs = temp1[0];
                rt = temp1[1];
                op = "011000";
                break;
            case "multu":
                rs = temp1[0];
                rt = temp1[1];
                op = "011001";
                break;
            case "div":
                rs = temp1[0];
                rt = temp1[1];
                op = "011010";
                break;
            case "divu":
                rs = temp1[0];
                rt = temp1[1];
                op = "011011";
                break;
            case "add":
                rd = temp1[0];
                rs = temp1[1];
                rt = temp1[2];
                op = "100000";
                break;
            case "addu":
                rd = temp1[0];
                rs = temp1[1];
                rt = temp1[2];
                op = "100001";
                break;
            case "sub":
                rd = temp1[0];
                rs = temp1[1];
                rt = temp1[2];
                op = "100010";
                break;
            case "subu":
                rd = temp1[0];
                rs = temp1[1];
                rt = temp1[2];
                op = "100011";
                break;
            case "and":
                rd = temp1[0];
                rs = temp1[1];
                rt = temp1[2];
                op = "100100";
                break;
            case "or":
                rd = temp1[0];
                rs = temp1[1];
                rt = temp1[2];
                op = "100101";
                break;
            case "xor":
                rd = temp1[0];
                rs = temp1[1];
                rt = temp1[2];
                op = "100110";
                break;
            case "nor":
                rd = temp1[0];
                rs = temp1[1];
                rt = temp1[2];
                op = "100111";
                break;
            case "slt":
                rd = temp1[0];
                rs = temp1[1];
                rt = temp1[2];
                op = "101010";
                break;
            case "sltu":
                rd = temp1[0];
                rs = temp1[1];
                rt = temp1[2];
                op = "101011";
                break;
            default:
                break;
        }
    }

    public String getAssembly() {
        String result;
        if (littleEndian) {
            result = getBinary(function) + getBinary(shamt) + getBinary(rd) + getBinary(rt) + getBinary(rs) + op;
        } else {
            result = op + getBinary(rs) + getBinary(rt) + getBinary(rd) + getBinary(shamt) + getBinary(function);
        }
        return result;
    }

    public String getBinary(String str) {
        String result = "";
        if (str.equals("")) {
            result = "";
        } else if (str.charAt(0) == '$') {
            String temp = str.substring(1, str.length());
            Integer tempInt = Integer.parseInt(temp);
            while (tempInt > 0) {
                int b = tempInt % 2;
                result = b + result;
                tempInt = tempInt / 2;
            }
        }
        return result;
    }
}