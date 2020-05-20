/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assembler;

public class ITypeInstruction {
    public String op = "000000";
    public String rs;
    public String rt;
    public String rd;
    public String shift;
    public String function;

    public void ITypeInstructions(String str) {
        String temp[] = str.split(",");
        rs = temp[1];
        rt = temp[2];
        rd = temp[3];
        switch (temp[0]) {
            case "add":
                function = "000000";
                break;
            case "addu":
                function = "000001";
                break;
            case "sub":
                function = "000010";
                break;
            case "subu":
                function = "000011";
                break;
            case "and":
                function = "000100";
                break;
            case "or":
                function = "000101";
                break;
            case "xor":
                function = "000110";
                break;
            default:
                break;
        }
    }

    public String getAssembly() {
        String result = op + rs + rt + rd + shift + function;
        return result;
    }
}