package com.rushabh.designpatterns.creational.abstractfactorypattern;

// Concrete Factory for the Abstract Factory pattern
public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
