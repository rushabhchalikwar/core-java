package com.rushabh.designpatterns.creational.abstractfactorypattern;

// Client code that uses the Abstract Factory pattern
public class Application {
    private final Button button;
    private final CheckBox checkbox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckBox();
    }

    public void renderUI() {
        button.paint();
        checkbox.paint();
    }
}
