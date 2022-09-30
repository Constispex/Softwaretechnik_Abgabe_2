package de.swt.ui;

import de.swt.events.MainWindowHandler;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;


public class MainWindow extends Frame{

        public MainWindow(){
            setSize(500,300);
            setTitle("AWT DEMO");


        }

    @Override
    public void paint(Graphics g) {
        Ellipse2D ellipse2D;
        ellipse2D = new Ellipse2D.Float(
                10.0F, 10.0F,
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
