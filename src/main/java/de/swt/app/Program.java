package de.swt.app;

import de.swt.events.MainWindowHandler;
import de.swt.ui.DrawArea;
import de.swt.ui.MainWindow;

/**
 * Softwaretechnik | Abgabe 2
 * @author Johannes Fritzsch m30113
 * @author Cody Radom m30118
 *
 */
public class Program {

    public static void main(String[] args){
        MainWindowHandler mainWindowHandler = new MainWindowHandler();

            DrawArea da = new DrawArea();
        MainWindow mainWindow = new MainWindow();
            mainWindow.add(da);

            mainWindow.setHandler(mainWindowHandler);
            mainWindow.showFrame();
    }

}
