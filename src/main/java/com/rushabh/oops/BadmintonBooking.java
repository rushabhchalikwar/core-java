package com.rushabh.oops;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

class BadmintonBooking extends Booking {
    // [Composition]: A Booking strictly "owns" the CourtReservation details.
    // If Booking dies, this reservation logic is irrelevant.
    private CourtDetails courtDetails;

    public BadmintonBooking(String id, User user, LocalDateTime startTime, int courtNumber) {
        super(id, user, startTime);
        this.courtDetails = new CourtDetails(courtNumber);
    }

    // [Dynamic Polymorphism]: Specific logic for Badminton (4-hour rule)
    @Override
    public void cancel() {
        long hoursUntilStart = ChronoUnit.HOURS.between(LocalDateTime.now(), this.startTime);

        if (hoursUntilStart < 4) {
            System.out.println("[Badminton] Cancellation Failed: Must be 4 hours prior.");
        } else {
            this.isActive = false;
            System.out.println("[Badminton] Cancelled. Refund initiated.");
        }
    }

    // Internal Helper Class for Composition
    private static class CourtDetails {
        int courtNumber;
        CourtDetails(int n) { this.courtNumber = n; }
    }
}
