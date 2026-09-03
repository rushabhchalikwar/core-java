package com.rushabh.designpatterns.structural.decorator;

// CoffeeShop class that demonstrates the usage of the decorator pattern
public class CoffeeShop {
    public static void main(String[] args) {
        // Create a simple coffee
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println(simpleCoffee.getDescription() + " $" + simpleCoffee.getCost());

        // Decorate the simple coffee with milk
        Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        System.out.println(milkCoffee.getDescription() + " $" + milkCoffee.getCost());

        // Decorate the milk coffee with sugar
        Coffee sugarMilkCoffee = new SugarDecorator(milkCoffee);
        System.out.println(sugarMilkCoffee.getDescription() + " $" + sugarMilkCoffee.getCost());

        // Decorate the sugar milk coffee with hazelnut
        Coffee hazelnutSugarMilkCoffee = new HazelnutDecorator(sugarMilkCoffee);
        System.out.println(hazelnutSugarMilkCoffee.getDescription() + " $" + hazelnutSugarMilkCoffee.getCost());


        // Decorate the simple coffee with hazelnut and sugar
        Coffee hazelnutSugarCoffee = new HazelnutDecorator(new SugarDecorator(simpleCoffee));
        System.out.println(hazelnutSugarCoffee.getDescription() + " $" + hazelnutSugarCoffee.getCost());
    }
}
