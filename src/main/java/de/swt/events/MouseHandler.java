package de.swt.events;

import de.swt.ui.DrawArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseHandler extends MouseAdapter {

    private static int count=0;
    public int x;
    public int y;
    @Override
    public void mouseClicked(MouseEvent e) {

            if (e.getClickCount() == 2) {
                this.x = e.getX();
                this.y = e.getY();
                count++;
            }

            DrawArea da = (DrawArea) e.getSource();
            da.paint(da.getGraphics());
        }

}
