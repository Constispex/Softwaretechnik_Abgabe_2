package de.swt.ui;

import de.swt.events.MouseHandler;

import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * Die Klasse erstellt ein Fenster zum Zeichnen.
 */
public class DrawArea extends Canvas {
    private MouseHandler mouse = new MouseHandler();

    /**
     * Constructor to initialize variables.
     */
    public DrawArea(){
        this.addMouseListener(mouse);
        int WIDTH = 200;
        int HEIGHT = 200;
        this.setSize(WIDTH, HEIGHT);
        this.setBackground(Color.LIGHT_GRAY);

        this.setVisible(true);
    }

    /**
     * Overwrites method paint and creates the DrawArea
     * @param g   the specified Graphics context
     */
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

        String coordinates1 = coordinates.append("X: ").append(x).append(" Y: ").append(y).toString();

        int dsplyCooX = getWidth() - 80;
        int dsplyCooY = getHeight() - 10;
        g2d.clearRect(dsplyCooX, dsplyCooY, getWidth(), getHeight());

        g2d.drawString(coordinates1,dsplyCooX, dsplyCooY);

    }

    /**
     * clears every component
     */
    public void clearComponents(){
        getGraphics().clearRect(0, 0, getWidth(), getHeight());
    }
}
