package org.example.structural.decorator;

public class Task {
    public static void main(String[] args) {
        Developer developer = new TeamLeadDeveloper(new SeniorJavaDeveloper(new JavaDeveloper()));

        System.out.println(developer.makeJob());
    }
}
