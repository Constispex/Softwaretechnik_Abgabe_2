package de.swt.ui;

import de.swt.events.MouseHandler;

import java.awt.*;

public class DrawArea extends Canvas {
    private final int WIDTH = 200;
    private final int HEIGHT = 200;
    private MouseHandler mouse = new MouseHandler();

    public DrawArea(){
        this.addMouseListener(mouse);
        this.setSize(WIDTH, HEIGHT);
        this.setBackground(Color.LIGHT_GRAY);
        this.setVisible(true);
        System.out.printf("Draw Area:%nX:%s Y:%s%n", getX(), getY());
    }
    @Override
    public void paint(Graphics g) {

        int rectWidth = 20;
        int rectHeight = 20;


        Graphics2D g2d = (Graphics2D) g;
        if (mouse.x == 0 && mouse.y == 0) return;

        Rectangle rectangle = new Rectangle(mouse.x - rectWidth/2, mouse.y - rectHeight/2, rectWidth, rectHeight);

        System.out.printf(" X:%s Y:%s%n", mouse.x, mouse.y);
        g2d.draw(rectangle);

    }

    public void clearComponents(){
        getGraphics().clearRect(0, 0, getWidth(), getHeight());
    }
}
