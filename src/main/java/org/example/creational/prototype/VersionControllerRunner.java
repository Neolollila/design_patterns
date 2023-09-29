package org.example.creational.prototype;

public class VersionControllerRunner {
    public static void main(String[] args) {
        Project project = new Project(1, "Project", "Source code");

        System.out.println(project);

        ProjectFactory projectFactory = new ProjectFactory(project);
        Project project1 = projectFactory.cloneProject();
        System.out.println(project1);
    }
}
