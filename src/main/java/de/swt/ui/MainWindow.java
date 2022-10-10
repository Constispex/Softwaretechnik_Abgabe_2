package de.swt.ui;

import de.swt.events.MainWindowHandler;
import javax.swing.*;
import java.awt.*;

/**
 * creates the Main Window for the DrawArea
 */
public class MainWindow extends JFrame {
    /**
     * Constructor creates Window with specific Attributes.
     */
    public MainWindow(){
        setSize(500,300);
        setTitle("Softwaretechnik Abgabe 2");
        this.setBackground(Color.LIGHT_GRAY);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) { // Brauchen wir die?

        this.repaint();
    }

    /**
     * set Frame to Visible
     */
    public void showFrame(){
        this.setVisible(true);
    }

    public void setHandler(MainWindowHandler mainWindowHandler) {
        addWindowListener(mainWindowHandler);
    }
}
