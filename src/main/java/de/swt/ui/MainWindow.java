package de.swt.ui;

import de.swt.events.MainWindowHandler;

import javax.swing.*;
import java.awt.*;

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

        this.repaint();
    }

    /**
     *
     */
    public void showFrame(){
        this.setVisible(true);
    }

    public void setHandler(MainWindowHandler mainWindowHandler) {
        addWindowListener(mainWindowHandler);
    }
}
