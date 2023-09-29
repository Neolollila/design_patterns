package org.example.creational.abstractfactory.website;

import org.example.creational.abstractfactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("website PM");
    }
}
