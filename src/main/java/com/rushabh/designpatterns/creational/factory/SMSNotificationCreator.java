package com.rushabh.designpatterns.creational.factory;

// Concrete Creator class for the Factory Method pattern
public class SMSNotificationCreator extends NotificationCreator {
    @Override
    public Notification createNotification() {
        return new SmsNotification();
    }
}
