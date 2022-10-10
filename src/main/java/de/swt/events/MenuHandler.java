package de.swt.events;

import de.swt.ui.DrawArea;
import de.swt.ui.RadiusWindow;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 */
public class MenuHandler implements ActionListener{

    private final MenuEvent _eventPath;
    private final DrawArea _da; //meh
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
    private Frame _frame;

    /**
     *
     * @param menuEvent
     * @param drawArea
     */
    public MenuHandler(Frame _frame, MenuEvent menuEvent, DrawArea drawArea){
        this._frame = _frame;
        _eventPath = menuEvent;
        this._da = drawArea;
    }

    /**
     *
     */
    public enum MenuEvent{
        BG_COLOR,
        RADIUS,
    }

    /**
     *
     */
    public void switchBackgroundColor() { //background aktualisiert nur, wenn drawArea gecleart wird
        if(++_count >= _colors.length) _count = 0;
        //_window.setBackground(_colors[_count]);
        //_window.paint(_window.getGraphics());
        _da.setBackground(_colors[_count]);
        _da.paint(_da.getGraphics()); //meh
    }

    public void showRadiusDialogue(){
        RadiusWindow radiusWindow = new RadiusWindow(this._frame, _da::setRadius);

    }

    /**
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Action recieved!");
//        switch(_eventPath){ //Vorbereitung fuer weitere MenuItems
//            case BG_COLOR:
//                switchBackgroundColor();
//                break;
//            case RADIUS:
//                showRadiusDialogue();
//                break;
//            case default:
//                System.out.println("The provided MenuEvent has not yet been implemented.");
//                break;
//        }

        if (_eventPath == MenuEvent.BG_COLOR) switchBackgroundColor();
        else if (_eventPath == MenuEvent.RADIUS) showRadiusDialogue();
    }
}
