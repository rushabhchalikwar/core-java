package com.rushabh;

import java.util.Optional;

public class OptionalDemo {
  public static void main() {

    // 1. Creating Optional Instances
    creatingOptionalObjects();

    // 2. Checking If Value Is Present
    valueChecking();

    // 3. Getting Values: orElse() vs orElseGet() vs orElseThrow()
    defaults();
  }

  private static void defaults() {
    Optional<String> email = Optional.empty();

    // orElse() - provide default value (always evaluated)
    String email1 = email.orElse("default@example.com");
    System.out.println(email1); // default@example.com

    // orElseGet() - lazy evaluation (only if empty)
    String email2 =
        email.orElseGet(
            () -> {
              System.out.println("Computing default..."); // only prints if empty
              return "user@example.com";
            });

    // orElseThrow() - throw exception if empty
    Optional<String> email3 = Optional.empty();
    try {
      String value = email3.orElseThrow(() -> new IllegalArgumentException("Email is required!"));
    } catch (IllegalArgumentException e) {
      System.out.println("Error: " + e.getMessage());
    }

    // orElseThrow() with no args (throws NoSuchElementException)
    String value = email3.orElseThrow();
  }

  private static void valueChecking() {
    Optional<String> username = Optional.of("john_doe");

    // Old way - isPresent()
    if (username.isPresent()) {
      System.out.println("User: " + username.get());
    }

    // Modern way (Java 10+) - ifPresent()
    username.ifPresent(user -> System.out.println("User: " + user));

    // With else case - ifPresentOrElse()
    username.ifPresentOrElse(
        user -> System.out.println("Found: " + user), () -> System.out.println("User not found"));
  }

  private static void creatingOptionalObjects() {
    // Create Optional with a value
    Optional<String> name = Optional.of("Alice");

    // Create empty Optional
    Optional<String> emptyName = Optional.empty();

    // Create from nullable value (safe way to wrap nullable reference)
    String possiblyNull = null;
    Optional<String> safeName = Optional.ofNullable(possiblyNull);

    System.out.println(name); // Optional[Alice]
    System.out.println(emptyName); // Optional.empty
    System.out.println(safeName); // Optional.empty
  }
}
