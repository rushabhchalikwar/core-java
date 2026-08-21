package com.rushabh.designpatterns.creational;

// Bill Pugh's Singleton Design Pattern (also known as the Initialization-on-demand holder idiom)
// is a thread-safe way to implement the Singleton pattern in Java. It leverages the Java class
// loading mechanism to ensure that the Singleton instance is created only when it is first accessed,
// and it does so in a thread-safe manner without requiring synchronized blocks or methods.
public class DemandHolder {
    // Private constructor prevents creating objects from outside the class
    private DemandHolder() {}

    // Static inner class responsible for holding the Singleton instance
    private static class Holder {
        // The Singleton instance is created when the Holder class is loaded
        private static final DemandHolder INSTANCE = new DemandHolder();
    }

    // Global access point to get the Singleton instance
    public static DemandHolder getInstance() {
        // Return the instance held by the inner class
        return Holder.INSTANCE;
    }
}
