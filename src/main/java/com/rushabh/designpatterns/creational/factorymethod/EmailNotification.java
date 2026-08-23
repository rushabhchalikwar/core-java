package com.rushabh.designpatterns.creational.factorymethod;

// Concrete Product class for the Factory Method pattern
public class EmailNotification implements Notification{
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending an Email notification with message: " + message);
    }
}
