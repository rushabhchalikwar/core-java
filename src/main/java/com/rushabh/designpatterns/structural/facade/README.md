Facade Pattern
==============

Overview
--------
This package demonstrates the Facade design pattern. A Facade provides a simplified interface to a set of complex subsystems. It wraps the interactions between multiple components and exposes concise, high-level operations to clients.

Package contents
----------------
- HomeTheaterFacade (class): The facade that simplifies interactions with the home theater subsystems.
- HomeTheatreApp (class): Demo application showing how to use the facade.
- Subsystem classes included in HomeTheatreApp:
  - Amplifier
  - DvdPlayer
  - Projector
  - SmartLights
  - StreamingService

How it works
------------
The client creates subsystem instances and injects them into HomeTheaterFacade. The facade exposes high-level operations like watchMovie() and endMovie() which internally control multiple subsystems in the correct order.

Usage
-----
Run HomeTheatreApp.main() to see the facade in action. Sample output:

Amplifier: Powering on.
Streaming: Connected to service.
Streaming: Now streaming 'Interstellar'.
--- Enjoy the movie! ---

--- Shutting down home theater ---
Streaming: Disconnected.
Amplifier: Shutting down.

When to use
-----------
- Simplifying a complex subsystem for clients.
- Providing a stable API when underlying subsystems change.
- Grouping frequently used sequences of operations.

Benefits
--------
- Reduces coupling between clients and subsystems.
- Improves code readability and usability by providing a single entry point.

Notes
-----
This example demonstrates how a facade can coordinate multiple components; real-world facades often validate inputs, handle exceptions across subsystems, and manage lifecycle concerns.
