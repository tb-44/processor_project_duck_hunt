/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlyphMaker;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileReadAndWrite {
    RecWrap[] rwdata;
    ArrayList<String> data;
    ArrayList<String> bin8bit;
    ArrayList<String> bin15bit;
    int x, y;

    public FileReadAndWrite(RecWrap[] _data) {
        rwdata = _data;
    }

    public void resize(int _x, int _y) {
        x = _x;
        y = _y;
    }

    public ArrayList<Color> get8by8glyph() {
        ArrayList<Color> temp = new ArrayList<Color>();
        for (String s : data) {
            temp.add(new Color((Integer.parseInt(s.substring(1, 3)) * 64), (Integer.parseInt(s.substring(3, 5)) * 64),
                    (Integer.parseInt(s.substring(5, 8)) * 32)));
        }
        return temp;
    }

    public LoadData load(File f) {
        ArrayList<ColorExt> loadData = new ArrayList<ColorExt>();
        int width = 0;
        int height = 0;
        boolean transparent;
        Binary red;
        Binary green;
        Binary blue;

        try {
            Scanner s = new Scanner(f);
            width = Integer.parseInt(s.next());
            height = Integer.parseInt(s.next());
            while (s.hasNext()) {
                String temp = s.next();
                transparent = Integer.parseInt(temp.substring(0, 1)) == 1;
                red = new Binary(temp.substring(1, 3));
                green = new Binary(temp.substring(3, 5));
                blue = new Binary(temp.substring(5, 8));

                loadData.add(new ColorExt(new Color(((red.getDecimalValue() + 1) * 64) - 1,
                        ((green.getDecimalValue() + 1) * 64) - 1, ((blue.getDecimalValue() + 1) * 32) - 1),
                        transparent));
            }
            s.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileReadAndWrite.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new LoadData(width, height, loadData);
    }

    public void createBin8Bit(File f) {
        try {
            FileWriter fw = new FileWriter(f);
            fw.write(x + "\r\n");
            fw.write(y + "\r\n");
            for (int i = 0; i < rwdata.length; i++) {
                if (rwdata[i].transparent) {
                    fw.write("10000000\r\n");
                } else {
                    Color temp = rwdata[i].c;
                    Binary red = new Binary(temp.getRed(), 8);
                    Binary green = new Binary(temp.getGreen(), 8);
                    Binary blue = new Binary(temp.getBlue(), 8);
                    fw.write("0" + red.getValue().substring(0, 2) + green.getValue().substring(0, 2)
                            + blue.getValue().substring(0, 3) + "\r\n");

                }
            }
            fw.close();

        } catch (IOException ex) {
            Logger.getLogger(FileReadAndWrite.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void createBin8Bit8by8Glyph(File f) {
        int glyphx = x / 8;
        int glyphy = y / 8;
        try {
            FileWriter fw = new FileWriter(f);
            for (int i = 0; i < glyphy; i++) {
                for (int j = 0; j < glyphx; j++) {
                    for (int k = 0; k < 8; k++) {
                        for (int l = 0; l < 8; l++) {
                            if (rwdata[((i * 8) + k) * x + l].transparent) {
                                fw.write("10000000");
                            } else {
                                Color temp = rwdata[((i * 8) + k) * x + l].c;
                                Binary red = new Binary(temp.getRed(), 8);
                                Binary green = new Binary(temp.getGreen(), 8);
                                Binary blue = new Binary(temp.getGreen(), 8);
                                fw.write("1" + red.getValue().substring(0, 2) + green.getValue().substring(0, 2)
                                        + blue.getValue().substring(0, 3));

                            }
                        }
                        fw.write("\r\n");
                    }

                }
            }
            fw.close();

        } catch (IOException ex) {
            Logger.getLogger(FileReadAndWrite.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}