package com.rushabh.designpatterns.creational.abstractfactorypattern;

// Main class to launch the application
public class AppLauncher {
    public static void main(String[] args) {
        // Simulate platform detection
        String os = System.getProperty("os.name");
        GUIFactory factory;

        if (os.contains("Windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new MACFactory();
        }

        Application app = new Application(factory);
        app.renderUI();
    }
}
