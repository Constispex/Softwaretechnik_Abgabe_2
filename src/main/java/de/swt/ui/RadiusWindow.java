package de.swt.ui;

import java.awt.*;
import java.util.function.IntConsumer;

public class RadiusWindow extends Dialog {
    IntConsumer intConsumer;
    TextField inputField;
    Button submit;
    public RadiusWindow(Frame owner, IntConsumer intConsumer) {
        super(owner);
        this.intConsumer = intConsumer;
        this.setSize(300, 100);
        FlowLayout flowLayout = new FlowLayout();

        Label lRadius = new Label("Radius: ");
        this.add(lRadius);

        // Text Input
        inputField = new TextField();
        inputField.setEditable(true);
        inputField.setLocation(0, 50);
        this.add(inputField);

        // Submit Button
        submit = new Button();
        submit.setLabel("Submit");
        submit.addActionListener((Event)->{
            intConsumer.accept(Integer.parseInt(inputField.getText()));
            this.dispose();
        });
        this.add(submit);

        this.setLayout(flowLayout);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {

        super.paint(g);
    }
}
