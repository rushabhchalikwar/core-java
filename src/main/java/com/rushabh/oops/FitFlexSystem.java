package com.rushabh.oops;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// ---------------------------------------------------------
// 5. THE SYSTEM (Putting it together)
// ---------------------------------------------------------
public class FitFlexSystem {

    // [Static Polymorphism / Overloading]: Same method name, different parameters
    public void processBooking(GymBooking b) {
        double price = b.user.getDiscountedPrice(10.0); // Base Gym Price
        b.printReceipt(price);
    }

    public void processBooking(BadmintonBooking b) {
        double price = b.user.getDiscountedPrice(20.0); // Base Badminton Price
        b.printReceipt(price);
    }

    public static void main(String[] args) {
        // Setup Users
        User alice = new User("Alice", new SilverMembership());
        User bob = new User("Bob", new GoldMembership());

        // Setup Bookings (Upcasting)
        // [Polymorphism]: Using the Base Class type 'Booking' to hold concrete objects
        List<Booking> todaysBookings = new ArrayList<>();

        Booking b1 = new GymBooking("G-101", alice, LocalDateTime.now().plusHours(2));
        Booking b2 = new BadmintonBooking("B-205", bob, LocalDateTime.now().plusHours(2), 3);

        todaysBookings.add(b1);
        todaysBookings.add(b2);

        System.out.println("--- Processing Cancellations ---");

        // [Runtime Polymorphism]: The JVM decides which cancel() to call at runtime
        for (Booking b : todaysBookings) {
            b.cancel();
        }
    }
}