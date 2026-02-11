package com.rushabh.oops;

public class SilverMembership implements PricingStrategy {
    @Override
    public double calculateFinalPrice(double basePrice) {
        return basePrice;
    }
}
