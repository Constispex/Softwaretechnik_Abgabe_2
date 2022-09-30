package de.swt.ui;

import java.awt.*;

public class WindowMenuBar {

    Frame _thisWindow;

    public WindowMenuBar(Frame window){
        _thisWindow = window;
    }
    public void showMenu() {
        //create a menu bar
        final MenuBar menuBar = new MenuBar();

        //create menus
        Menu colorMenu = new Menu("Color");

        //create menu items
        MenuItem menuItem1 = new MenuItem("RED");

        MenuItem menuItem2 = new MenuItem("BLUE");

        MenuItem menuItem3 = new MenuItem("GREY");

        colorMenu.add(menuItem1);
        colorMenu.add(menuItem2);
        colorMenu.add(menuItem3);


        //add menu to menubar
        menuBar.add(colorMenu);

        //add menubar to the frame
        _thisWindow.setMenuBar(menuBar);
        _thisWindow.setVisible(true);
    }


}
