package de.swt.ui;

import de.swt.events.BackgroundHandler;
import de.swt.events.RadiusDialogHandler;

import java.awt.*;

/**
 * creates MenuBar
 */
public class WindowMenuBar {

    private final Frame _thisWindow;
    private DrawArea _drawArea; //meh

    public WindowMenuBar(Frame window, DrawArea drawArea){
        _thisWindow = window;
        this._drawArea = drawArea;
    }

    /**
     * display the Menubar
     */
    public void showMenu() {
        //create a menu bar
        final MenuBar menuBar = new MenuBar();

        Menu settingsMenu = new Menu("Settings");
        MenuItem menuColorCycle = new MenuItem("Cycle Background Color");
        MenuItem changeRadius = new MenuItem("Change Radius");

        menuColorCycle.addActionListener(new BackgroundHandler(_thisWindow, _drawArea)); //drawArea uebergeben = meh
        changeRadius.addActionListener(new RadiusDialogHandler(_thisWindow, _drawArea));

        settingsMenu.add(menuColorCycle);
        settingsMenu.add(changeRadius);

        menuBar.add(settingsMenu);

        _thisWindow.setMenuBar(menuBar);
        _thisWindow.setVisible(true);
    }


}
