package com.rushabh.designpatterns.creational.singleton;

public class DoubleCheckedSingleton {
    public static volatile DoubleCheckedSingleton instance;

    private DoubleCheckedSingleton() {
    }

    public static synchronized DoubleCheckedSingleton getInstance() {
        // Fast path: first check without locking
        if (instance == null) {
            // Lock only when the instance might need to be created
            synchronized (DoubleCheckedSingleton.class) {
                // Second check inside the lock (prevents double creation)
                if (instance == null) {
                    instance = new DoubleCheckedSingleton();
                }
            }
        }
        return instance;
    }
}
