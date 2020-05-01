/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlyphMaker;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import static java.lang.Math.pow;
import java.util.ArrayList;
import javax.swing.JComponent;

public class ColorPalette extends JComponent {
    private static final long serialVersionUID = 1L;
    ArrayList<RecWrap> pix;
    int x, y, pixelSize, xmod, ymod, index, absX, absY;
    Color c;

    public ColorPalette() {
        setDoubleBuffered(false);
        pix = new ArrayList<RecWrap>();
    }

    public Color getColor(int i) {
        return pix.get(i).c;
    }

    public void setPalette(int red, int green, int blue) {
        int index = 0;
        int redBase = (int) pow(2, (8 - red));
        int greenBase = (int) pow(2, (8 - green));
        int blueBase = (int) pow(2, (8 - blue));
        int redMax = (int) pow(2, red);
        int greenMax = (int) pow(2, green);
        int blueMax = (int) pow(2, blue);
        for (int i = 0; i < redMax; i++) {
            for (int j = 0; j < greenMax; j++) {
                for (int k = 0; k < blueMax; k++) {
                    pix.add(new RecWrap(new Rectangle((index * 20) % 480, (index / (480 / 20) * 20), 20, 20),
                            new Color(((i + 1) * redBase) - 1, ((j + 1) * greenBase) - 1, ((k + 1) * blueBase) - 1),
                            false));
                    index++;

                }
            }
        }
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // g.setColor(c);
        // if(pix.length > 0){
        for (RecWrap r : pix) {
            // if(!r.equals(null)){
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