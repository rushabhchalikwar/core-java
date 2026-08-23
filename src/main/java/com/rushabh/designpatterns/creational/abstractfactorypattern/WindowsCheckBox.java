package com.rushabh.designpatterns.creational.abstractfactorypattern;

// Concrete product for the Abstract Factory pattern
public class WindowsCheckBox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("Rendering a Windows checkbox.");
    }

    @Override
    public void onClick() {
        System.out.println("Windows checkbox clicked!");
    }
}
