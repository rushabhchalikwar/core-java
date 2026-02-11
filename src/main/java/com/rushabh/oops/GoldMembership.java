package com.rushabh.oops;

class GoldMembership implements PricingStrategy {
    public double calculateFinalPrice(double basePrice) { return basePrice * 0.8; } // 20% off
}
