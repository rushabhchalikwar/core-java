package com.rushabh.designpatterns.creational.abstractfactorypattern;

// Concrete product for the Abstract Factory pattern
public class MACCheckBox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("Rendering a MAC checkbox.");
    }

    @Override
    public void onClick() {
        System.out.println("Windows MAC clicked!");
    }
}
