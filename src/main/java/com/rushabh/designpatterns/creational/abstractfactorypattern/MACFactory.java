package com.rushabh.designpatterns.creational.abstractfactorypattern;

// Concrete Factory for creating Mac UI components
public class MACFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MACCheckBox();
    }
}
