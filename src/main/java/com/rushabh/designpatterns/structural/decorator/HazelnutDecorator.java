package com.rushabh.designpatterns.structural.decorator;

// Concrete decorator class that adds hazelnut flavor to the coffee
public class HazelnutDecorator extends CoffeeDecorator {
    public HazelnutDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.3; // Adding cost of hazelnut
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Hazelnut";
    }
}
