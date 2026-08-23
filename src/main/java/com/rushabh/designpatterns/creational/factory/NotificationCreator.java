package com.rushabh.designpatterns.creational.factory;

// Creator class for the Factory Method pattern
public abstract class NotificationCreator {
    // Factory Method - subclasses decide what to create
    public abstract Notification createNotification();

    // Method that uses the factory method to send a notification
    public void sendNotification(String message) {
        Notification notification = createNotification();
        notification.sendNotification(message);
    }
}
