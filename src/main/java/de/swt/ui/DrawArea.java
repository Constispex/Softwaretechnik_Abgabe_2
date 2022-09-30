package de.swt.ui;

import de.swt.events.MouseHandler;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class DrawArea extends Canvas {
    private MouseHandler mouse = new MouseHandler();

    public DrawArea(){
        this.addMouseListener(mouse);
        this.setBackground(Color.LIGHT_GRAY);
        this.setVisible(true);
        System.out.printf("Draw Area:%nX:%s Y:%s%n", getX(), getY());
    }
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        if (mouse.x == 0 && mouse.y == 0) return;
        Ellipse2D ellipse = new Ellipse2D.Float(
                (float) mouse.x, (float) mouse.y,
                5.0F, 5.0F
        );

        System.out.printf(" X:%s Y:%s%n", mouse.x, mouse.y);
        g2d.draw(ellipse);

    }

    public void clearComponents(){
        getGraphics().clearRect(0, 0, getWidth(), getHeight());
    }
}
