package de.swt.events;

import de.swt.ui.DrawArea;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseHandler extends MouseAdapter {

    private static int count = 1;
    public int x;
    public int y;
    @Override
    public void mouseClicked(MouseEvent e) {
        DrawArea da = (DrawArea) e.getSource();

        if (e.getClickCount() == 2 && count < 3) {
            this.x = e.getX();
            this.y = e.getY();

            da.paint(da.getGraphics());
            System.out.printf("count if:%s", count);
            count++;
        } else if (e.getClickCount() == 2){
            da.clearComponents();
            System.out.printf("count else:%s", count);
            count = 1;
        }
    }

}
