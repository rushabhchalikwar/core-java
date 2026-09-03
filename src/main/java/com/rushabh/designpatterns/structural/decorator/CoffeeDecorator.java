package com.rushabh.designpatterns.structural.decorator;

// Abstract decorator class that implements the Coffee interface and holds a reference to a Coffee object
abstract class CoffeeDecorator implements Coffee{
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }
}
