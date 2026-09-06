package com.rushabh.designpatterns.structural.facade;

// Facade class that simplifies the interaction with the home theater subsystems
public class HomeTheatreApp {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        DvdPlayer dvd = new DvdPlayer();
        Projector projector = new Projector();
        SmartLights lights = new SmartLights();
        StreamingService streaming = new StreamingService();

        // Create the facade
        HomeTheaterFacade theater = new HomeTheaterFacade(amp, dvd, projector, lights, streaming);

        theater.watchMovie("Interstellar");
        theater.endMovie();
    }
}

// --- Subsystems ---

class Amplifier {
    public void on() { System.out.println("Amplifier: Powering on."); }
    public void off() { System.out.println("Amplifier: Shutting down."); }
    public void setVolume(int level) { System.out.println("Amplifier: Volume set to " + level + "."); }
}

class DvdPlayer {
    public void on() { System.out.println("DVD Player: Powering on."); }
    public void off() { System.out.println("DVD Player: Shutting down."); }
    public void play(String movie) { System.out.println("DVD Player: Playing '" + movie + "'."); }
    public void stop() { System.out.println("DVD Player: Stopped."); }
}

class Projector {
    public void on() { System.out.println("Projector: Warming up."); }
    public void off() { System.out.println("Projector: Cooling down."); }
    public void wideScreenMode() { System.out.println("Projector: Widescreen mode enabled."); }
}

class SmartLights {
    public void dim(int level) { System.out.println("Lights: Dimmed to " + level + "%."); }
    public void on() { System.out.println("Lights: Full brightness."); }
}

class StreamingService {
    public void connect() { System.out.println("Streaming: Connected to service."); }
    public void disconnect() { System.out.println("Streaming: Disconnected."); }
    public void stream(String movie) { System.out.println("Streaming: Now streaming '" + movie + "'."); }
}
