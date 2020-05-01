/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlyphMaker;

import static java.lang.Math.pow;

public class Binary {
    private String value = "";
    private int decValue = 0;
    private int places = 0;

    public Binary(int num, int _places) {
        decValue = num;
        places = _places;
        value = this.intToBin(num, places);
    }

    public Binary(String num) {
        value = num;
        places = num.length();
        decValue = this.binToInt(num);
    }

    public String twosCompliment() {
        String temp = this.subtract(1);
        String result = "";
        int a = 0;
        for (int i = 0; i < value.length(); i++) {
            a = temp.charAt(i) - 48;
            a = (a + 1) % 2;
            result = result + a;
        }

        return result;
    }

    public String twosCompliment(String str) {
        value = str;
        String temp = this.intToBin(((this.getDecimalValue() * -1) - 1), places);
        String result = "";
        int a = 0;
        for (int i = 0; i < value.length(); i++) {
            a = temp.charAt(i) - 48;
            a = (a + 1) % 2;
            result = result + a;
        }

        return result;
    }

    public String add(int num) {
        decValue += num;
        value = intToBin(decValue, places);
        return value;
    }

    public String add(String num) {
        int temp = this.binToInt(num);
        decValue += temp;
        value = this.intToBin(decValue, places);
        return value;
    }

    public String subtract(String num) {
        // int temp = decValue - this.binToInt(num);
        return this.intToBin(decValue, places);
    }

    public String subtractSet(String num) {
        decValue -= this.binToInt(num);
        value = this.intToBin(decValue, places);
        return value;
    }

    public String subtract(int num) {
        // int temp = decValue - num;
        return this.intToBin(decValue, places);
    }

    public String subtractSet(int num) {
        decValue -= num;
        value = this.intToBin(decValue, places);
        return value;
    }

    public String getValue() {
        return value;
    }

    public int getDecimalValue() {
        return decValue;
    }

    // private void setValue(int num) {
    // decValue = num;
    // value = this.intToBin(decValue, places);
    // }

    // private void setValue(String num) {
    // value = num;
    // decValue = this.binToInt(num);
    // }

    public void multiply(int num) {

    }

    public void multiply(String num) {

    }

    public String intToBin(int num, int places) {
        String result = "";
        int temp = num;
        if (temp < 0) {
            temp = temp * -1;
        }
        while (temp > 0) {
            int b = temp % 2;
            result = b + result;
            temp = temp / 2;
        }
        int i = result.length();
        while (i < places) {
            result = "0" + result;
            i++;
        }
        if (num < 0) {
            return this.twosCompliment(result);
        } else {
            return result;
        }
    }

    public int binToInt(String num) {
        int result = 0;
        for (int i = num.length() - 1; i >= 0; i--) {
            if (num.charAt(i) == 49) {
                result += pow(2, (num.length() - i - 1));
            }
        }
        return result;
    }
}