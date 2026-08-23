package com.rushabh.designpatterns.creational.singleton;

public class LazySingleton {
    public volatile static LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
