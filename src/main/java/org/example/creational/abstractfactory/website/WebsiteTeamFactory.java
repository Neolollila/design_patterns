package org.example.creational.abstractfactory.website;

import org.example.creational.abstractfactory.Developer;
import org.example.creational.abstractfactory.ProjectManager;
import org.example.creational.abstractfactory.ProjectTeamFactory;
import org.example.creational.abstractfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }
}
