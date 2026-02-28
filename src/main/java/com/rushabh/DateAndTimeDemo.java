package com.rushabh;

import java.time.*;

public class DateAndTimeDemo {
  public static void main(String[] args) {

    // LocalDate - just the date
    LocalDate date = LocalDate.now();
    LocalDate date2 = LocalDate.of(2024, 12, 25);
    System.out.println("Current date: " + date);
    System.out.println("Christmas 2024: " + date2);

    // LocalTime - just the time
    LocalTime time = LocalTime.now();
    LocalTime time2 = LocalTime.of(14, 30, 0);
    System.out.println("Current time: " + time);
    System.out.println("2:30 PM: " + time2);

    // LocalDateTime - date and time combined
    LocalDateTime dateTime = LocalDateTime.now();
    LocalDateTime dateTime2 = LocalDateTime.of(2024, 12, 25, 14, 30);
    System.out.println("Current date and time: " + dateTime);
    System.out.println("Christmas 2024 at 2:30 PM: " + dateTime2);

    ZonedDateTime zonedDateTime = ZonedDateTime.now();
    ZonedDateTime tokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
    System.out.println("System timezone: " + zonedDateTime);
    System.out.println("Tokyo timezone: " + tokyo);

    // Convert between timezones
    ZonedDateTime converted = tokyo.withZoneSameInstant(ZoneId.of("America/New_York"));
    System.out.println("Tokyo time converted to New York: " + converted);

    Instant now = Instant.now();
    Instant epoch = Instant.EPOCH;
    long seconds = now.getEpochSecond();
    System.out.println("Current instant: " + now);
  }
}
