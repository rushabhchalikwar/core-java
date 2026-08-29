package com.rushabh.designpatterns.structural.adapter;

// Adapter class that adapts the Paypal class to the PaymentProcessor interface
public class PaypalAdapter implements PaymentProcessor {
    public Paypal paypalGateway;

    public PaypalAdapter(Paypal paypalGateway) {
        this.paypalGateway = paypalGateway;
    }

    @Override
    public void processPayment(double amount) {
        paypalGateway.sendPayment(amount);
    }
}