package com.rushabh.designpatterns.structural.decorator;

// Concrete decorator class that adds milk to the coffee
public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.2; // Adding cost of sugar
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Sugar";
    }
}
