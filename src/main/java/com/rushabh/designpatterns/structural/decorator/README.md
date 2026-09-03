Decorator Pattern
=================

Overview
--------
This package demonstrates the Decorator design pattern. The Decorator lets behavior be added to individual objects dynamically without affecting other objects from the same class. It promotes flexible and extensible code through composition rather than inheritance.

Package contents
----------------
- Coffee (interface): Component that defines getCost() and getDescription().
- SimpleCoffee (class): Concrete component with base cost and description.
- CoffeeDecorator (abstract class): Base decorator holding a reference to a Coffee instance.
- MilkDecorator (class): Concrete decorator that adds milk (cost +0.5).
- SugarDecorator (class): Concrete decorator that adds sugar (cost +0.2).
- HazelnutDecorator (class): Concrete decorator that adds hazelnut flavor (cost +0.3).
- CoffeeShop (class): Demo application that composes decorators at runtime.

How it works
------------
Start with a SimpleCoffee instance. Wrap it with one or more decorators to add features and cost. Each decorator forwards calls to the wrapped Coffee instance and modifies the return values.

Usage
-----
Run CoffeeShop.main() to see examples of composing decorators. Sample output:

Simple Coffee $2.0
Simple Coffee, Milk $2.5
Simple Coffee, Milk, Sugar $2.7
Simple Coffee, Milk, Sugar, Hazelnut $3.0
Simple Coffee, Sugar, Hazelnut $2.5

When to use
-----------
- Adding responsibilities to objects at runtime without creating an explosion of subclasses.
- When you need different combinations of features for objects.

Benefits
--------
- Greater flexibility than static inheritance.
- Keeps classes small and focused; responsibilities are composed rather than inherited.

Notes
-----
Decorators can be stacked in any order; the order affects aggregated description and cost. Real-world decorators often handle edge cases like rounding costs, validating inputs, or implementing removal of decorators.
