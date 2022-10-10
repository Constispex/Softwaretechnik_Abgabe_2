package de.swt.events;

import de.swt.ui.DrawArea;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseHandler extends MouseAdapter {

    private static int count = 1;
    public Point[] points = new Point[2];
    @Override
    public void mouseClicked(MouseEvent e) {
        DrawArea da = (DrawArea) e.getSource();

        if (e.getClickCount() == 2 && count < 3) { //Speicherung beider Punkte
            points[count-1] = new Point(e.getX(), e.getY());

            da.paint(da.getGraphics());
            System.out.printf("count if:%s", count);
            count++;

        } else if (e.getClickCount() == 2){ //reset
            da.clearComponents();
            System.out.printf("count else:%s", count);
            points[0] = null;
            points[1] = null;
            count = 1;
        }
    }
}
