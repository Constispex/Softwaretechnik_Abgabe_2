package de.swt.app;

import de.swt.events.MainWindowHandler;
import de.swt.events.MouseHandler;
import de.swt.ui.MainWindow;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Softwaretechnik | Abgabe 2
 * @Author: Johannes Fritzsch
 *
 *
 */
public class Program {

    private static MainWindow mainWindow;
    private static MainWindowHandler mainWindowHandler;

    private static MouseHandler mouseHandler;

    public static void main(String[] args){
            mainWindowHandler = new MainWindowHandler();

            mainWindow = new MainWindow();
            mainWindow.setHandler(mainWindowHandler);
            mainWindow.showFrame();
    }

}
