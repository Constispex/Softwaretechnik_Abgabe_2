package de.swt.ui;

import de.swt.events.MouseHandler;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class DrawArea extends Canvas {

    private MouseHandler mouse = new MouseHandler();

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Ellipse2D ellipse = new Ellipse2D.Float(
                (float) mouse.getX(), (float) mouse.getY(),
                5.0F, 5.0F
        );
        g2d.draw(ellipse);
    }
}
