package de.swt.ui;

import java.awt.*;
import java.util.function.IntConsumer;

/**
 * This class handels the Dialog window where you can change the radius
 */
public class RadiusWindow extends Dialog {
    IntConsumer intConsumer;
    TextField inputField;
    Button submit;

    /**
     * Constructor
     * @param owner -> Main Frame
     * @param intConsumer -> serves as radius input
     */
    public RadiusWindow(Frame owner, IntConsumer intConsumer) {
        super(owner);
        this.intConsumer = intConsumer;
        this.setSize(300, 100);
        FlowLayout flowLayout = new FlowLayout();

        Label lRadius = new Label("Radius: ");
        this.add(lRadius);

        // Text Input MAC NOT SUPPORTED
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
}
