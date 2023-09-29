package org.example.creational.abstractfactory;

import org.example.creational.abstractfactory.banking.BankingTeamFactory;
import org.example.creational.abstractfactory.website.WebsiteTeamFactory;

public class BankingSiteFabric {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();
        Tester tester = projectTeamFactory.getTester();

        developer.writeCode();
        tester.testt();
        projectManager.manageProject();
    }
}
