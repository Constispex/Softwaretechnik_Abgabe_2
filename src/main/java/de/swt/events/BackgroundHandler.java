package de.swt.events;

import de.swt.ui.DrawArea;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BackgroundHandler implements ActionListener {

    private Frame _frame;
    private DrawArea _da;
    private static int count;
    private final Color[] COLORS = {
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

    public BackgroundHandler(Frame _frame, DrawArea drawArea){
        this._frame = _frame;
        this._da = drawArea;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(++count >= COLORS.length) count = 0;
        //_window.setBackground(_colors[_count]);
        //_window.paint(_window.getGraphics());
        _da.setBackground(COLORS[count]);
        _da.paint(_da.getGraphics()); //meh
    }
}