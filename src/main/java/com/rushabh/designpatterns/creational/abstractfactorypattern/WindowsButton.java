package com.rushabh.designpatterns.creational.abstractfactorypattern;

// Concrete Product for the Abstract Factory pattern
public class WindowsButton implements  Button{
    @Override
    public void paint() {
        System.out.println("Rendering a Windows button.");
    }

    @Override
    public void onClick() {
        System.out.println("Windows button clicked!");
    }
}
