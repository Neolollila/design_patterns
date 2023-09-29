package org.example.structural.decorator;

public class TeamLeadDeveloper extends DeveloperDecorator{
    public TeamLeadDeveloper(Developer developer) {
        super(developer);
    }

    public String makeReport() {
        return "Send report to customer...";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeReport();
    }
}
