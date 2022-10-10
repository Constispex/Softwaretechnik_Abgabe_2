package de.swt.events;

import de.swt.ui.DrawArea;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * This Class interprets all mouse inputs.
 * It recognises double clicks and saves 2 points in an Array
 */
public class MouseHandler extends MouseAdapter {

    private static int count = 1;
    public Point[] points = new Point[2];

    /**
     * checks if input is double click.
     * Either saves the points or resets Drawarea and clears Array and set count = 1
     * @param e the event to be processed
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        DrawArea da = (DrawArea) e.getSource();

        if (e.getClickCount() == 2 && count < 3) { // save both points
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
