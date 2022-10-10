package de.swt.ui;

import de.swt.events.MenuHandler;

import java.awt.*;

public class WindowMenuBar {

    private final Frame _thisWindow;
    private Canvas _drawArea; //meh

    public WindowMenuBar(Frame window, Canvas drawArea){
        _thisWindow = window;
        this._drawArea = drawArea;
    }

    public void showMenu() {
        //create a menu bar
        final MenuBar menuBar = new MenuBar();

        Menu colorMenu = new Menu("Color");
        MenuItem menuColorCicle = new MenuItem("Cicle Background Color");
        menuColorCicle.addActionListener(new MenuHandler(MenuHandler.MenuEvent.BG_COLOR, _drawArea)); //drawArea uebergeben = meh

        colorMenu.add(menuColorCicle);

        menuBar.add(colorMenu);

        _thisWindow.setMenuBar(menuBar);
        _thisWindow.setVisible(true);
    }


}
