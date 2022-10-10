package de.swt.ui;

import de.swt.events.MouseHandler;

import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * Die Klasse erstellt ein Fenster zum Zeichnen.
 */
public class DrawArea extends Canvas {
    private final MouseHandler MOUSE = new MouseHandler();

    private float _radius;

    public void setRadius(float _radius) {
        this._radius = _radius;
    }

    /**
     * Constructor to initialize variables.
     */
    public DrawArea(){
        this.addMouseListener(MOUSE);
        this.setBackground(Color.LIGHT_GRAY);
        this.setVisible(true);
        System.out.printf("Draw Area:%nX:%s Y:%s%n", getX(), getY());
        _radius = 5.0f;
    }


    /**
     * Overwrites method paint and creates the DrawArea
     * @param g   the specified Graphics context
     */
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        clearComponents();

        int dsplyCooX = getWidth() - 80;
        int dsplyCooY = getHeight() - 10;

        for (Point point : MOUSE.points) { //Abfrage gespeicherter Punkte (Punkte bei 00 werden nicht gezeichnet)
            if(point == null) continue;
            g2d.draw(new Ellipse2D.Float(
                    (float) point.x - _radius, (float) point.y - _radius,
                    _radius * 2, _radius * 2
                    )
            );
            StringBuilder coordinates = new StringBuilder();
            String coordinatesStr = coordinates.append("X: ").append(point.x).append(" Y: ").append(point.y).toString();

            // Display coordinates and clear old ones
            g2d.drawRect(dsplyCooX,dsplyCooY - 10, getWidth(), getHeight());
            g2d.clearRect(dsplyCooX,dsplyCooY - 10, getWidth(), getHeight());
            g2d.drawString(coordinatesStr,dsplyCooX, dsplyCooY);
        }
    }

    /**
     * clears every component
     */
    public void clearComponents(){
        getGraphics().clearRect(0, 0, getWidth(), getHeight());
    }
}
