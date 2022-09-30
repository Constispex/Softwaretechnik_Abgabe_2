package de.swt.ui;

import de.swt.events.MainWindowHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;


public class MainWindow extends JFrame {
    public MainWindow(){
        setSize(500,300);
        setTitle("Softwaretechnik Abgabe 2");
        this.setBackground(Color.LIGHT_GRAY);
        this.setVisible(true);

    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Ellipse2D ellipse2D;
        int x = 100;
        int y = 100;
        ellipse2D = new Ellipse2D.Float(
                (float) x, (float) y,
                5.0F, 5.0F);
        g2d.setColor(Color.BLACK);
        g2d.draw(ellipse2D);
        this.repaint();
    }


    public void showFrame(){
            this.setVisible(true);
        }

        public void setHandler(MainWindowHandler mainWindowHandler) {
            addWindowListener(mainWindowHandler);
         }
}
