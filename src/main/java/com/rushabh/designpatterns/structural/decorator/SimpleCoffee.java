package com.rushabh.designpatterns.structural.decorator;

// Concrete component class that implements the Coffee interface
public class SimpleCoffee implements Coffee {
    @Override
    public double getCost() {
        return 2.0; // Base cost of simple coffee
    }

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
}
