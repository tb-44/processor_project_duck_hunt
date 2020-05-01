/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assembler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class decoder {
    File mips;
    File resultPath;
    ArrayList<Instruction> instructions;
    ArrayList<String> binary;
    ArrayList<String> hex;
    ArrayList<StringIntPair> mipsCode;
    InstructionDictionary instDict = new InstructionDictionary();
    ArrayList<Label> lables;
    ArrayList<Var> vars;
    boolean endianInd = false;
    boolean fillFile = false;
    int fileLines;
    int lineCount;

    public decoder(File _mips, File _resultPath, boolean _endianInd, boolean _fillFile, int _fileLines)
            throws Exception {
        fillFile = _fillFile;
        fileLines = _fileLines;
        endianInd = _endianInd;
        hex = new ArrayList<String>();
        binary = new ArrayList<String>();
        instructions = new ArrayList<Instruction>();
        lables = new ArrayList<Label>();
        vars = new ArrayList<Var>();
        mipsCode = new ArrayList<StringIntPair>();
        mips = _mips;
        String temp = "";
        resultPath = _resultPath;
        lineCount = 0;
        try {
            Scanner s = new Scanner(mips);
            while (s.hasNext()) {
                temp = s.nextLine();
                if (this.contains(temp, ':')) {
                    lables.add(new Label(1, this.remove(temp, ':'), lineCount));
                } else if (this.contains(temp, '#')) {

                } else if (this.contains(temp, '&')) {
                    String[] varTemp = temp.split("=");
                    vars.add(new Var(this.remove(varTemp[0], '&').trim(), Integer.parseInt(varTemp[1].trim())));
                } else {
                    lineCount += this.instDict.getInstructionSize(this.getInstructionName(temp));
                    mipsCode.add(new StringIntPair(temp.trim(), lineCount));
                }

            }
            s.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (StringIntPair str : mipsCode) {
            Instruction tempIns = new Instruction(str.key, endianInd, lables, vars, str.value);
            instructions.add(tempIns);
            for (String s : tempIns.binaryInstructions) {
                binary.add(s);
            }
            tempIns.getHexMachineCode();
            for (String s : tempIns.hexInstructions) {
                hex.add(s);
            }
        }
    }

    public String getInstructionName(String str) {
        String result = "";
        for (char c : str.toCharArray()) {
            if (c == ' ') {
                return result;
            }
            result += c;
        }
        return result;
    }

    public boolean printBinary() {
        try {
            File bin = new File(resultPath + "/" + "binInstructions.b");
            FileWriter fw = new FileWriter(bin);
            for (String s : binary) {
                fw.write(s);
                fw.write("\r\n");
            }
            fw.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean printHex() {
        try {
            int i = 0;
            File hexFile = new File(resultPath + "/" + "HexMachineCode.h");
            FileWriter fw = new FileWriter(hexFile);
            for (String s : hex) {
                if (!s.equals("")) {
                    fw.write(s);
                    fw.write("\r\n");
                    i++;
                }
            }
            if (fillFile) {
                while (i < fileLines) {
                    fw.write("0000\r\n");
                    i++;
                }
            }
            fw.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean contains(String str, char c) {
        if (str.equals("")) {
            return false;
        } else {
            for (char ch : str.toCharArray()) {
                if (ch == c) {
                    return true;
                }
            }
            return false;
        }
    }

    public String remove(String str, char c) {
        String result = "";
        if (str.length() > 0) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != c) {
                    result += str.charAt(i);
                }
            }
            return result;
        } else {
            return result;
        }
    }
}