package org.example.creational.abstractfactory.banking;

import org.example.creational.abstractfactory.Developer;
import org.example.creational.abstractfactory.ProjectManager;
import org.example.creational.abstractfactory.ProjectTeamFactory;
import org.example.creational.abstractfactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }
}
