package de.swt.events;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuHandler implements ActionListener{

    private final MenuEvent _eventPath;
    private final Frame _window;
    private final Canvas _da; //meh
    private final Color[] _colors = {Color.LIGHT_GRAY, Color.WHITE, Color.BLUE, Color.CYAN,
            Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED, Color.PINK, Color.MAGENTA};
    private static short _count = 0;

    public MenuHandler(MenuEvent menuEvent, Frame window, Canvas drawArea){
        _eventPath = menuEvent;
        this._window = window;
        this._da = drawArea;
    }

    public enum MenuEvent{
        BG_COLOR,

    }

    public void switchBackgroundColor() { //background aktualisiert nur, wenn drawArea gecleart wird
        if(++_count >= _colors.length) _count = 0;
        _window.setBackground(_colors[_count]);
        _window.paint(_window.getGraphics());
        _da.paint(_da.getGraphics()); //meh
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Action recieved!");
        switch(_eventPath){ //Vorbereitung fuer weitere MenuItems
            case BG_COLOR -> switchBackgroundColor();
            case default -> System.out.println("The provided MenuEvent has not yet been implemented.");
        }
    }

}
