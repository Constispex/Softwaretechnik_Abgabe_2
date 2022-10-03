package de.swt.ui;

import de.swt.events.MouseHandler;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class DrawArea extends Canvas {
    private final int WIDTH = 200;
    private final int HEIGHT = 200;
    private MouseHandler mouse = new MouseHandler();
    private String coordinates="";


    public DrawArea(){
        this.addMouseListener(mouse);
        this.setSize(WIDTH, HEIGHT);
        this.setBackground(Color.LIGHT_GRAY);

        this.setVisible(true);
    }
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        int x = mouse.x;
        int y = mouse.y;
        StringBuilder coordinates = new StringBuilder();

        if (x == 0 && y == 0) return; // Erstes Element wird nicht erstellt
        // create ellipse
        Ellipse2D ellipse = new Ellipse2D.Float(
                (float) x, (float) y,
                5.0F, 5.0F
        );
        g2d.draw(ellipse);
        System.out.printf(" X:%s Y:%s%n", x, y);

        this.coordinates = coordinates.append("X: ").append(x).append("Y: ").append(y).toString();


        g2d.clearRect((int) (getWidth() * 0.8), (int) (getHeight() * 0.95d), getWidth(), getHeight());
        g2d.drawRect((int) (getWidth() * 0.8), (int) (getHeight() * 0.95d), getWidth(), getHeight());
        g2d.drawString(this.coordinates, (int) (getWidth() * 0.8), (int) (getHeight() * 0.99d));

    }

    public void clearComponents(){
        getGraphics().clearRect(0, 0, getWidth(), getHeight());
    }
}
