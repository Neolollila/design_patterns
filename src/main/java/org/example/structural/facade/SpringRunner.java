package org.example.structural.facade;

public class SpringRunner {
    public static void main(String[] args) {
        Workflow workflow = new Workflow();

        workflow.solveProblems();
        System.out.println("-------------------");
        workflow.afterSpring();
    }
}
