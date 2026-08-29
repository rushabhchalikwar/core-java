package com.rushabh.designpatterns.structural.adapter;

// Payment application demonstrating the Adapter pattern
public class PaymentApp {
    public static void main(String[] args) {
        PaymentProcessor paypalGateway = new PaypalAdapter(new Paypal());
        PaymentProcessor razorpayGateway = new RazorpayAdapter(new Razorpay());

        double amount = 100.0;

        // Process payments using different payment gateways
        paypalGateway.processPayment(amount);
        razorpayGateway.processPayment(amount);
    }
}
