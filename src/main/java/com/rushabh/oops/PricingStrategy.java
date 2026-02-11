package com.rushabh.oops;

// ---------------------------------------------------------
// 1. ABSTRACTION & INTERFACES (The Contract)
// ---------------------------------------------------------
// [Interface Segregation Principle]: We separate pricing logic from the booking object.
interface PricingStrategy {
    double calculateFinalPrice(double basePrice);
}
