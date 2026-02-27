package com.rushabh.oops;

// ---------------------------------------------------------
// 2. ENCAPSULATION & ASSOCIATION (The User)
// ---------------------------------------------------------
class User {
  private String name;

  // [Aggregation]: User "has a" Membership, but they can exist independently.
  // We code to the Interface 'PricingStrategy', not the class (Dependency Inversion).
  private PricingStrategy membership;

  public User(String name, PricingStrategy membership) {
    this.name = name;
    this.membership = membership;
  }

  // [Encapsulation]: We expose behavior, not data.
  public double getDiscountedPrice(double price) {
    return membership.calculateFinalPrice(price);
  }

  public String getName() {
    return name;
  }
}
