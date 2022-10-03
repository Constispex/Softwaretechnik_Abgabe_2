package de.swt.events;

import de.swt.ui.DrawArea;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseHandler extends MouseAdapter {

    private static int count = 1;
    public int [][] points = new int[2][2]; //Speicherung der Punkte
//    public int x;
//    public int y;
    @Override
    public void mouseClicked(MouseEvent e) {
        DrawArea da = (DrawArea) e.getSource();

        if (e.getClickCount() == 2 && count < 3) { //Speicherung beider Punkte
            points[count-1][0] = e.getX();
            points[count-1][1] = e.getY();
//            this.x = e.getX();
//            this.y = e.getY();

            da.paint(da.getGraphics());
            System.out.printf("count if:%s", count);
            count++;

        } else if (e.getClickCount() == 2){ //reset
            da.clearComponents();
            System.out.printf("count else:%s", count);
            points[0][0] = 0;
            points[0][1] = 0;
            points[1][0] = 0;
            points[1][1] = 0;
            count = 1;
        }
    }

}
