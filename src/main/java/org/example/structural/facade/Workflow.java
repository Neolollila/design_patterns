package org.example.structural.facade;

public class Workflow {
    private Job job = new Job();
    private BugTracker bugTracker = new BugTracker();
    private Developer developer = new Developer();

    public void solveProblems() {
        job.doJob();
        bugTracker.startSpring();
        developer.doJobBeforeDeadline(bugTracker);
    }

    public void afterSpring() {
        bugTracker.finishSpring();
        developer.doJobBeforeDeadline(bugTracker);
    }
}
