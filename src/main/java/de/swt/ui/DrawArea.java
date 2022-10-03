package de.swt.ui;

import de.swt.events.MouseHandler;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class DrawArea extends Canvas {
    private final MouseHandler MOUSE = new MouseHandler();

    public DrawArea(){
        this.addMouseListener(MOUSE);
        //System.out.printf("Draw Area:%nX:%s Y:%s%n", getX(), getY());
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        clearComponents();
        System.out.println("DA repainted");
        for (int[] point : MOUSE.points) { //Abfrage gespeicherter Punkte (Punkte bei 00 werden nicht gezeichnet)
            if(point[0] == 0 && point[1] == 0) continue;
            g2d.draw(new Ellipse2D.Float(
                    (float) point[0], (float) point[1],
                    5.0F, 5.0F
                    )
            );
        }

//        if (MOUSE.x == 0 && MOUSE.y == 0) return;
//        Ellipse2D ellipse = new Ellipse2D.Float(
//                (float) MOUSE.x, (float) MOUSE.y,
//                5.0F, 5.0F
//        );
//        //System.out.printf(" X:%s Y:%s%n", mouse.x, mouse.y);
//        g2d.draw(ellipse);
    }

    public void clearComponents(){
        getGraphics().clearRect(0, 0, getWidth(), getHeight());
    }
}
