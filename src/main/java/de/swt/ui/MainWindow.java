package de.swt.ui;

import de.swt.events.MainWindowHandler;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.EventListener;


public class MainWindow extends Frame implements EventListener {

    private int x;
    private int y;

    @Override
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public MainWindow(){
            setSize(500,300);
            setTitle("AWT DEMO");

        }

    @Override
    public void paint(Graphics g) {
        Ellipse2D ellipse2D;
        ellipse2D = new Ellipse2D.Float(
                (float) x, (float) y,
                5.0F, 5.0F);
        Graphics2D gd2 = (Graphics2D) g;
        gd2.draw(ellipse2D);
        this.repaint();
    }


    public void showFrame(){
            this.setVisible(true);
        }

        public void setHandler(MainWindowHandler mainWindowHandler) {
            addWindowListener(mainWindowHandler);
         }


}
