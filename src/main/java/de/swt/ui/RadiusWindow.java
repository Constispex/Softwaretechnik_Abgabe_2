package de.swt.ui;

import java.awt.*;
import java.util.function.IntConsumer;

public class RadiusWindow extends Dialog {
    IntConsumer intConsumer;
    public RadiusWindow(Frame owner, IntConsumer intConsumer) {
        super(owner);
        this.intConsumer = intConsumer;
        this.setSize(200, 100);
        this.setVisible(true);

    }
}
