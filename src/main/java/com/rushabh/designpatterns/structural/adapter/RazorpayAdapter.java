package com.rushabh.designpatterns.structural.adapter;

public class RazorpayAdapter implements PaymentProcessor {
    public Razorpay razorpayGateway;

    public RazorpayAdapter(Razorpay razorpay) {
        this.razorpayGateway = razorpay;
    }

    @Override
    public void processPayment(double amount) {
        razorpayGateway.charge(amount);
    }
}