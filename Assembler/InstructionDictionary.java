/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assembler;

import java.util.ArrayList;

public class InstructionDictionary {
    ArrayList<StringIntPair> instructions;

    public InstructionDictionary() {
        instructions = new ArrayList<StringIntPair>();
        instructions.add(new StringIntPair("default", 1));
        instructions.add(new StringIntPair("JUMPEQ", 4));
        instructions.add(new StringIntPair("JUMPNE", 4));
        instructions.add(new StringIntPair("JUMPGE", 4));
        instructions.add(new StringIntPair("JUMPCS", 4));
        instructions.add(new StringIntPair("JUMPCC", 4));
        instructions.add(new StringIntPair("JUMPHI", 4));
        instructions.add(new StringIntPair("JUMPLS", 4));
        instructions.add(new StringIntPair("JUMPLO", 4));
        instructions.add(new StringIntPair("JUMPHS", 4));
        instructions.add(new StringIntPair("JUMPGT", 4));
        instructions.add(new StringIntPair("JUMPLE", 4));
        instructions.add(new StringIntPair("JUMPFS", 4));
        instructions.add(new StringIntPair("JUMPFC", 4));
        instructions.add(new StringIntPair("JUMPLT", 4));
        instructions.add(new StringIntPair("JUMPUC", 3));
        instructions.add(new StringIntPair("JUMPAL", 3));
        instructions.add(new StringIntPair("STORI", 5));
        instructions.add(new StringIntPair("LOADI", 2));
        instructions.add(new StringIntPair("SETVAR", 3));
        instructions.add(new StringIntPair("GETVAR", 3));
    }

    public int getInstructionSize(String str) {
        for (StringIntPair sip : this.instructions) {
            if (sip.key.equals(str)) {
                return sip.value;
            }
        }
        return 1;
    }
}