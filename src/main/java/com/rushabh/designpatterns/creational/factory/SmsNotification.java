package com.rushabh.designpatterns.creational.factory;

//Concrete Product class for the Factory Method pattern
public class SmsNotification implements Notification{
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS notification with message: " + message);
    }
}
