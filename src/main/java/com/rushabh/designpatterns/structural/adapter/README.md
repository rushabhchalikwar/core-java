Adapter Pattern
===============

Overview
--------
This package demonstrates the Adapter (Wrapper) design pattern. The Adapter lets incompatible interfaces work together by converting the interface of an existing class (adaptee) into the interface the client expects (target).

Package contents
----------------
- PaymentProcessor (interface): Target interface used by the application.
- PaymentApp (class): Demo application showing adapters in action.
- Paypal (class): Adaptee representing a PayPal gateway (method: sendPayment).
- PaypalAdapter (class): Adapter that implements PaymentProcessor and delegates to Paypal.
- Razorpay (class): Adaptee representing a Razorpay gateway (method: charge).
- RazorpayAdapter (class): Adapter that implements PaymentProcessor and delegates to Razorpay.

How it works
------------
Clients depend on PaymentProcessor. When using an existing payment library (Paypal or Razorpay) whose APIs differ, an Adapter implements PaymentProcessor and translates calls to the adaptee's API.

Usage
-----
Run PaymentApp.main(). It creates adapters for Paypal and Razorpay and processes a sample amount. Expected output:

Processing payment of $100.0 through PayPal.
Processing payment of $100.0 through Razorpay.

When to use
-----------
- Integrating third-party libraries with an existing codebase without modifying clients.
- Supporting multiple implementations behind a common interface.

Benefits
--------
- Promotes single responsibility and separation of concerns.
- Allows reuse of existing classes with incompatible interfaces.

Notes
-----
This example is intentionally minimal to show the core pattern; real adapters often map more complex data and error handling between systems.
