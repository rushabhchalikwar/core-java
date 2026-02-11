package com.rushabh.oops;

import java.time.LocalDateTime;

// ---------------------------------------------------------
// 3. INHERITANCE (The Base Class)
// ---------------------------------------------------------
// [Abstract Class]: Captures shared state (ID, Date, User) to avoid code duplication.
abstract class Booking {
    // [Encapsulation]: 'protected' allows subclasses to access, but hides from the world.
    protected String bookingId;
    protected LocalDateTime startTime;
    protected User user; // [Association]: Weak link, Booking knows about User.
    protected boolean isActive;

    public Booking(String id, User user, LocalDateTime startTime) {
        this.bookingId = id;
        this.user = user;
        this.startTime = startTime;
        this.isActive = true;
    }

    // [Abstraction]: We force subclasses to define their specific cancellation logic.
    public abstract void cancel();

    // [Polymorphism]: A concrete method shared by all children.
    public void printReceipt(double price) {
        System.out.println("Booking " + bookingId + " for " + user.getName() + ": $" + price);
    }
}
