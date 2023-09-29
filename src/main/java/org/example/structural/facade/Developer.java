package org.example.structural.facade;

public class Developer {
    public void doJobBeforeDeadline(BugTracker bugTracker) {
        if (bugTracker.isActiveSpring()) {
            System.out.println("Developer is do Job...");
        } else {
            System.out.println("Developer is reading habr...");
        }
    }
}
