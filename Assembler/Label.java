/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assembler;

public class Label {
    public String label;
    public int index;
    public int address;
    public int instructionSize;

    public Label(int _instructionSize, String name, int _index) {
        index = _index;
        label = name;
        instructionSize = _instructionSize;
        address = index * _instructionSize;
    }
}