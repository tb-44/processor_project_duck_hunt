/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlyphMaker;

import java.awt.Color;
import java.awt.Rectangle;

public class RecWrap {
    public Rectangle r;
    public Color c;
    public boolean transparent;

    public RecWrap(Rectangle rec, Color col, boolean trans) {
        r = rec;
        c = col;
        transparent = trans;
    }

    public void setTransparency(boolean flag) {
        transparent = flag;
    }

    public Rectangle getRectange() {
        return r;
    }

    public void setRectangle(Rectangle rec) {
        r = rec;
    }

    public void setColor(Color col) {
        c = col;
    }

    public Color getColor() {
        return c;
    }
}