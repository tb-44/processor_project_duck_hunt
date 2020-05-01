/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assembler;

import static java.lang.Math.pow;

public class Hex {
    private char[] values = "0123456789ABCDEF".toCharArray();
    private String hexNumber = "";

    public Hex(String binNum) {
        String tempBinNum = binNum;
        int decNum = 0;
        String byteString = "";
        int temp = tempBinNum.length() / 4;
        for (int i = 0; i < temp; i++) {
            decNum = 0;
            byteString = tempBinNum.substring(0, 4);
            tempBinNum = tempBinNum.substring(4, tempBinNum.length());
            for (int j = 0; j < byteString.length(); j++) {
                if (byteString.charAt(j) == 49) {
                    decNum += pow(2, (byteString.length() - j - 1));
                }
            }
            hexNumber += values[decNum];
        }
    }

    public String getHex() {
        return this.hexNumber;
    }
}