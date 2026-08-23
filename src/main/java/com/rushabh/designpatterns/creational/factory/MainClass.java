package com.rushabh.designpatterns.creational.factory;

public class MainClass {
    public static void main(String[] args) {
        NotificationCreator emailCreator = new EmailNotificationCreator();
        emailCreator.sendNotification("Hello via Email!");

        NotificationCreator smsCreator = new SMSNotificationCreator();
        smsCreator.sendNotification("Hello via SMS!");
    }
}
