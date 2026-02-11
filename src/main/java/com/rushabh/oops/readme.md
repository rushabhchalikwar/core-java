# FitFlex: Gym & Badminton Booking System (OOP Design Showcase)

## 📌 Project Overview
FitFlex is a backend system design prototype for a sports center that manages **Gym** and **Badminton** bookings. 

This project was built specifically to demonstrate **Advanced Object-Oriented Programming (OOP)** concepts, **SOLID Principles**, and **Design Patterns** in a real-world scenario. It moves beyond basic "Cat extends Animal" examples to solve actual business problems like polymorphic pricing, cancellation policies, and membership tiers.

## 🚀 Key Features & Concepts Applied

### 1. The 4 Pillars of OOP
* **Encapsulation:** All booking data is protected. Access is controlled via business-logic methods (e.g., `cancel()`) rather than direct field access, adhering to the "Tell, Don't Ask" principle.
* **Abstraction:** The `Booking` class hides the complexity of shared state (ID, Time, User), forcing subclasses to define their own specific behaviors.
* **Inheritance:** Common attributes are shared through the `Booking` abstract class, reducing code duplication.
* **Polymorphism:** The system treats `GymBooking` and `BadmintonBooking` uniformly as `Booking` objects, allowing for scalable list processing and runtime method dispatch.

### 2. SOLID Principles
* **Single Responsibility Principle (SRP):** Pricing logic is separated from Booking logic. The `User` class delegates cost calculation to a strategy, rather than doing the math itself.
* **Open/Closed Principle (OCP):** New membership tiers (e.g., Platinum) can be added by creating a new class implementing `PricingStrategy`, without modifying existing code.
* **Liskov Substitution Principle (LSP):** Any subclass of `Booking` can be used interchangeably without breaking the application logic.
* **Dependency Inversion Principle (DIP):** High-level modules depend on the `PricingStrategy` interface, not on concrete membership classes.

### 3. Design Patterns
* **Strategy Pattern:** Used to handle dynamic pricing based on membership levels (`Silver`, `Gold`). This avoids complex `if-else` chains.

### 4. Object Relationships
* **Association:** `Booking` -> `User` (Weak link; User exists without Booking).
* **Aggregation:** `User` -> `Membership` (User "has a" membership).
* **Composition:** `BadmintonBooking` -> `CourtDetails` (Strong link; Court details cannot exist without the booking).

---

## 📂 Class Structure

```text
src/
├── Booking.java            # Abstract Base Class
├── GymBooking.java         # Concrete Implementation (Polymorphic behavior)
├── BadmintonBooking.java   # Concrete Implementation (Composition example)
├── User.java               # Core Domain Object
├── PricingStrategy.java    # Interface (Strategy Pattern)
├── Memberships.java        # Concrete Strategies (Silver, Gold)
└── FitFlexSystem.java      # Main Driver Class