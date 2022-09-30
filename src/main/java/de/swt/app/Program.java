package de.swt.app;

import de.swt.events.MainWindowHandler;
import de.swt.events.MouseHandler;
import de.swt.ui.DrawArea;
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

    private static MouseHandler mouseHandler;

    public static void main(String[] args){
            mainWindowHandler = new MainWindowHandler();

            DrawArea da = new DrawArea();
            mainWindow = new MainWindow();
            mainWindow.add(da);
            da.addMouseListener(new MouseHandler());
            mainWindow.setHandler(mainWindowHandler);
            mainWindow.showFrame();
    }

}
