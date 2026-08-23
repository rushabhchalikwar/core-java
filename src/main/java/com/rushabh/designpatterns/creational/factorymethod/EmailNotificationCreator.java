package com.rushabh.designpatterns.creational.factorymethod;

// Concrete Creator class for the Factory Method pattern
public class EmailNotificationCreator extends NotificationCreator {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
