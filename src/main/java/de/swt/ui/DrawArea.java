package de.swt.ui;

import de.swt.events.MouseHandler;

import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * Die Klasse erstellt ein Fenster zum Zeichnen.
 */
public class DrawArea extends Canvas {
    private final MouseHandler MOUSE = new MouseHandler();

    /**
     * Constructor to initialize variables.
     */
    public DrawArea(){
        this.addMouseListener(MOUSE);
        this.setBackground(Color.LIGHT_GRAY);
        this.setVisible(true);
        System.out.printf("Draw Area:%nX:%s Y:%s%n", getX(), getY());
    }


    /**
     * Overwrites method paint and creates the DrawArea
     * @param g   the specified Graphics context
     */
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        clearComponents();
        System.out.println("DA repainted");

        int dsplyCooX = getWidth() - 80;
        int dsplyCooY = getHeight() - 10;
        for (Point point : MOUSE.points) { //Abfrage gespeicherter Punkte (Punkte bei 00 werden nicht gezeichnet)
            if(point == null) continue;
            g2d.draw(new Ellipse2D.Float(
                    (float) point.x, (float) point.y,
                    5.0F, 5.0F
                    )
            );
            StringBuilder coordinates = new StringBuilder();
            String coordinatesStr = coordinates.append("X: ").append(point.x).append(" Y: ").append(point.y).toString();


            g2d.clearRect((int) (getWidth() * 0.8), (int) (getHeight() * 0.95d), getWidth(), getHeight());
            g2d.drawRect(dsplyCooX,dsplyCooY - 10, getWidth(), getHeight());
            g2d.drawString(coordinatesStr,dsplyCooX, dsplyCooY);



        }

//        if (MOUSE.x == 0 && MOUSE.y == 0) return;
//        Ellipse2D ellipse = new Ellipse2D.Float(
//                (float) MOUSE.x, (float) MOUSE.y,
//                5.0F, 5.0F
//        );
//        //System.out.printf(" X:%s Y:%s%n", mouse.x, mouse.y);
//        g2d.draw(ellipse);
    }

    /**
     * clears every component
     */
    public void clearComponents(){
        getGraphics().clearRect(0, 0, getWidth(), getHeight());
    }
}
