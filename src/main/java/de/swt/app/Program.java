package de.swt.app;

import de.swt.events.MainWindowHandler;
import de.swt.ui.DrawArea;
import de.swt.ui.MainWindow;
import de.swt.ui.WindowMenuBar;

/**
 * Softwaretechnik | Abgabe 2
 * @author Johannes Fritzsch m30113
 * @author Cody Radom m30118
 *
 * @version 1.1.0
 */
public class Program {

    public static void main(String[] args){
        MainWindowHandler mainWindowHandler = new MainWindowHandler();
        DrawArea da = new DrawArea();
        MainWindow mainWindow = new MainWindow();
        WindowMenuBar menuBar = new WindowMenuBar(mainWindow, da); //drawArea uebergeben = meh

        mainWindow.add(da);
        mainWindow.setHandler(mainWindowHandler);
        menuBar.showMenu();
        mainWindow.showFrame();
    }

}
