package com.rushabh.designpatterns.structural.adapter;

// Adaptee class that represents the PayPal payment gateway
public class Paypal {
    public void sendPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through PayPal.");
    }
}
