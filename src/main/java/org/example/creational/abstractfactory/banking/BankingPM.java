package org.example.creational.abstractfactory.banking;

import org.example.creational.abstractfactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("manage Project");
    }
}
