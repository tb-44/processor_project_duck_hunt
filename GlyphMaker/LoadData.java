/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlyphMaker;

import java.util.ArrayList;

public class LoadData {
    public ArrayList<ColorExt> c;
    public int width;
    public int height;

    public LoadData(int _width, int _height, ArrayList<ColorExt> _c) {
        c = _c;
        width = _width;
        height = _height;
    }
}