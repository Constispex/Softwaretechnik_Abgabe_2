package de.swt.events;

import de.swt.ui.DrawArea;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseHandler extends MouseAdapter {
    private static int count = 1;
    public int x;
    public int y;
    public int moveX;
    public int moveY;
    @Override
    public void mouseClicked(MouseEvent e) {
        DrawArea da = (DrawArea) e.getSource();

        if (e.getClickCount() == 2 && count < 3) {
            this.x = e.getX();
            this.y = e.getY();

            da.paint(da.getGraphics());
            count++;
        } else if (e.getClickCount() == 2){
            da.clearComponents();
            count = 1;
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        DrawArea da = (DrawArea) e.getSource();
        this.moveX = e.getX();
        this.moveY = e.getY();
        System.out.printf("moveX: %s, moveY:%s%n", moveX, moveY);
        da.paint(da.getGraphics());
    }
}
