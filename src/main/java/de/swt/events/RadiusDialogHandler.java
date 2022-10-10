package de.swt.events;

import de.swt.ui.DrawArea;
import de.swt.ui.RadiusWindow;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadiusDialogHandler implements ActionListener {

    Frame _thisWindow;
    DrawArea _da;


    public RadiusDialogHandler(Frame frame, DrawArea drawArea){
        _thisWindow = frame;
        _da = drawArea;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        RadiusWindow radiusWindow = new RadiusWindow(this._thisWindow, _da::setRadius);
    }
}
