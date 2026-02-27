package com.rushabh.stream;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Custom functional interface for demonstrating lambda expressions. This interface takes a String
 * parameter and performs an operation.
 */
@FunctionalInterface
interface A {
  /**
   * Displays a message based on the provided name.
   *
   * @param name the name to be displayed
   */
  void show(String name);
}

/**
 * Demonstration class showcasing built-in functional interfaces from java.util.function package.
 *
 * <p>This class provides practical examples of the four main functional interfaces:
 *
 * <ul>
 *   <li>{@link Predicate} - Tests a condition and returns a boolean
 *   <li>{@link Function} - Transforms input to output
 *   <li>{@link Consumer} - Performs an action on input without returning a value
 *   <li>{@link Supplier} - Provides/generates a value
 * </ul>
 *
 * @author Rushabh
 * @version 1.0
 */
public class FunctionalInterfaceDemo {
  /**
   * Main method demonstrating the usage of various functional interfaces.
   *
   * <p>Examples included:
   *
   * <ol>
   *   <li>Custom functional interface A - demonstrates lambda with String parameter
   *   <li>Predicate - tests if a string is empty
   *   <li>Function - returns the length of a string
   *   <li>Consumer - prints a string to console
   *   <li>Supplier - generates a random double value
   * </ol>
   *
   * @param args command line arguments (not used)
   */
  public static void main(String[] args) {
    A a = (name) -> System.out.println("Hello from functional interface! " + name);
    a.show("Rushabh");

    Predicate<String> isEmpty = s -> s.isEmpty();
    isEmpty.test(""); // true

    Function<String, Integer> length = s -> s.length();
    length.apply("hello"); // 5

    Consumer<String> print = s -> System.out.println(s);
    print.accept("Hi!"); // Hi!

    Supplier<Double> random = () -> Math.random();
    random.get(); // 0.735...
  }
}
