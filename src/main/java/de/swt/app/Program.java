package de.swt.app;

import de.swt.events.MainWindowHandler;
import de.swt.ui.MainWindow;

/**
 * Softwaretechnik | Abgabe 2
 * @Author: Johannes Fritzsch
 *
 *
 */
public class Program {

    private static MainWindow mainWindow;
    private static MainWindowHandler mainWindowHandler;

    public static void main(String[] args){
            mainWindowHandler = new MainWindowHandler();

            mainWindow = new MainWindow();
            mainWindow.setHandler(mainWindowHandler);
            mainWindow.showFrame();
    }

}
