package de.swt.events;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuHandler implements ActionListener{

    private final MenuEvent _eventPath;
    private final Canvas _da; //meh
    private final Color[] _colors = {
            Color.LIGHT_GRAY,
            Color.WHITE,
            new Color(100,100,255),
            Color.CYAN,
            new Color(100,255,200),
            Color.YELLOW,
            new Color(250,200,100),
            new Color(255,100,100),
            Color.PINK,
            Color.MAGENTA
    };
    private static short _count = 0;

    public MenuHandler(MenuEvent menuEvent, Canvas drawArea){
        _eventPath = menuEvent;
        this._da = drawArea;
    }

    public enum MenuEvent{
        BG_COLOR,

    }

    public void switchBackgroundColor() { //background aktualisiert nur, wenn drawArea gecleart wird
        if(++_count >= _colors.length) _count = 0;
        //_window.setBackground(_colors[_count]);
        //_window.paint(_window.getGraphics());
        _da.setBackground(_colors[_count]);
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
