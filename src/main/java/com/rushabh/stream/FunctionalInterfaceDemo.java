package com.rushabh.stream;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface A {
    void show(String name);
}


public class FunctionalInterfaceDemo{
    public static void main(String[] args) {
        A a = (name) -> System.out.println("Hello from functional interface! " + name);
        a.show("Rushabh");

        Predicate<String> isEmpty = s -> s.isEmpty();
        isEmpty.test("");        // true

        Function<String, Integer> length = s -> s.length();
        length.apply("hello");   // 5

        Consumer<String> print = s -> System.out.println(s);
        print.accept("Hi!");     // Hi!

        Supplier<Double> random = () -> Math.random();
        random.get();            // 0.735...

        List
    }
}
