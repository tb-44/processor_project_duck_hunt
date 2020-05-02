/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlyphMaker;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import javax.swing.JComponent;

public class DrawArea extends JComponent {
    private static final long serialVersionUID = 1L;
    private boolean erase = false;
    private int x, y, xmod, ymod;
    Color c;
    RecWrap[] pix;
    XYPosition pos;
    int len = 32;
    int index = 0;
    public int absX, absY, pixelSize;

    public DrawArea() {
        setDoubleBuffered(false);
    }

    public void AddListeners() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                if (x > 0 && y > 0 && x < absX * pixelSize && y < absY * pixelSize) {
                    xmod = x / pixelSize;
                    ymod = y / pixelSize;
                    index = (xmod) + (ymod) * absX;
                    if (index < absX * absY) {
                        if (erase) {
                            pix[index] = new RecWrap(
                                    new Rectangle(x - x % pixelSize, y - y % pixelSize, pixelSize, pixelSize),
                                    Color.WHITE, true);
                        } else {
                            pix[index] = new RecWrap(
                                    new Rectangle(x - x % pixelSize, y - y % pixelSize, pixelSize, pixelSize), c,
                                    false);
                        }
                    }
                    repaint();
                }
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {

                x = e.getX();
                y = e.getY();
                if (x > 0 && y > 0 && x < absX * pixelSize && y < absY * pixelSize) {
                    xmod = x / pixelSize;
                    ymod = y / pixelSize;
                    index = (xmod) + (ymod) * absX;
                    if (index < absX * absY) {
                        if (erase) {
                            pix[index] = new RecWrap(
                                    new Rectangle(x - x % pixelSize, y - y % pixelSize, pixelSize, pixelSize),
                                    Color.WHITE, true);
                        } else {
                            pix[index] = new RecWrap(
                                    new Rectangle(x - x % pixelSize, y - y % pixelSize, pixelSize, pixelSize), c,
                                    false);
                        }
                    }
                    repaint();
                }
            }
        });
    }

    public void setColor(Color col) {
        c = col;
    }

    public void setErase(Boolean b) {
        erase = b;
    }

    public void parameters(int xSize, int ySize, int _pixelSize) {
        absX = xSize;
        absY = ySize;
        this.pixelSize = _pixelSize;
        pix = new RecWrap[absX * absY];
        for (int i = 0; i < absX; i++) {
            for (int j = 0; j < absY; j++) {
                pix[(i) + (j) * xSize] = new RecWrap(new Rectangle(i * pixelSize, j * pixelSize, pixelSize, pixelSize),
                        Color.WHITE, true);
            }
        }
        AddListeners();
    }

    public void load(ArrayList<ColorExt> data) {
        ColorExt col;
        for (int i = 0; i < absX; i++) {
            for (int j = 0; j < absY; j++) {
                col = data.get(i + j * absX);
                pix[(i) + (j) * absX] = new RecWrap(new Rectangle(i * pixelSize, j * pixelSize, pixelSize, pixelSize),
                        col.c, col.transparent);
            }
        }
        repaint();
    }

    public void clear() {
        for (int i = 0; i < absX; i++) {
            for (int j = 0; j < absY; j++) {
                pix[(i) + (j) * absX] = new RecWrap(new Rectangle(i * pixelSize, j * pixelSize, pixelSize, pixelSize),
                        Color.WHITE, true);
            }
        }
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (RecWrap r : pix) {
            g.drawRect(r.r.x, r.r.y, r.r.width, r.r.height);
            if (r.transparent) {
                g.setColor(Color.WHITE);
                g.fillRect(r.r.x, r.r.y, r.r.width / 2, r.r.height / 2);
                g.fillRect(r.r.x + r.r.width, r.r.y + r.r.height / 2, r.r.width / 2, r.r.height / 2);
                g.setColor(Color.GRAY);
                g.fillRect(r.r.x, r.r.y + r.r.width / 2, r.r.width / 2, r.r.height / 2);
                g.fillRect(r.r.x + r.r.width / 2, r.r.y, r.r.width / 2, r.r.height / 2);
            } else {
                g.setColor(r.c);
                g.fillRect(r.r.x, r.r.y, r.r.width, r.r.height);
            }
        }
    }
}