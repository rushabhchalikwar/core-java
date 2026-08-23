package com.rushabh.designpatterns.creational.abstractfactorypattern;

// Concrete Product for the Abstract Factory pattern
public class MacButton implements  Button{
    @Override
    public void paint() {
        System.out.println("Rendering a MAC button.");
    }

    @Override
    public void onClick() {
        System.out.println("MAC button clicked!");
    }
}
