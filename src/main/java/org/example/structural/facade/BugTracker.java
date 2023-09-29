package org.example.structural.facade;

public class BugTracker {
    private Boolean activeSprint;

    public boolean isActiveSpring() {
        return activeSprint;
    }

    public void startSpring() {
        System.out.println("Start spring");
        activeSprint = true;
    }

    public void finishSpring() {
        System.out.println("Finish spring");
        activeSprint = false;
    }
}
