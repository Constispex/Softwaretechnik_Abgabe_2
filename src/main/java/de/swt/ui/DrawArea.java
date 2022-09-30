package de.swt.ui;

import de.swt.events.MouseHandler;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class DrawArea extends Canvas {

    private MouseHandler mouse = new MouseHandler();

    public DrawArea(){
        this.setSize(200, 200);
        this.setBackground(Color.RED);
        this.setVisible(true);
    }
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Ellipse2D ellipse = new Ellipse2D.Float(
                (float) mouse.getX(), (float) mouse.getY(),
                5.0F, 5.0F
        );
        System.out.println(getX() + getY());
        g2d.draw(ellipse);
        this.repaint();
    }
}
