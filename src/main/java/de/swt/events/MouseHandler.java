package de.swt.events;

import de.swt.ui.MainWindow;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseHandler extends MouseAdapter {
    private int x;
    private int y;
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() == 2) {
            this.x = e.getX();
            this.y = e.getY();
        }
        System.out.println("*Klick*");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
