package com.rushabh.designpatterns.structural.adapter;

// Adaptee class that represents the Razorpay payment gateway
public class Razorpay {
    public void charge(double amount) {
        System.out.println("Processing payment of $" + amount + " through Razorpay.");
    }
}
