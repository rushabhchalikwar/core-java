package com.rushabh.oops;

import java.time.LocalDateTime;

// ---------------------------------------------------------
// 4. POLYMORPHISM & LISKOV SUBSTITUTION (Concrete Classes)
// ---------------------------------------------------------
class GymBooking extends Booking {

    public GymBooking(String id, User user, LocalDateTime startTime) {
        super(id, user, startTime);
    }

    // [Dynamic Polymorphism / Overriding]: Specific logic for Gym
    @Override
    public void cancel() {
        this.isActive = false;
        System.out.println("[Gym] Cancelled. Full refund initiated.");
    }
}
