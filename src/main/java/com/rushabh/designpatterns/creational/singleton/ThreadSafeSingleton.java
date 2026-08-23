package com.rushabh.designpatterns.creational.singleton;

public class ThreadSafeSingleton {
    public volatile static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}
