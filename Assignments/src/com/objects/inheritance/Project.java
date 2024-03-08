package com.objects.inheritance;

public class Project {

    String projectName;
    int durationInMonths;
    String domain;
    String projectManager;

    public Project(String projectName, int durationInMonths, String domain, String projectManager) {
        this.projectName = projectName;
        this.durationInMonths = durationInMonths;
        this.domain = domain;
        this.projectManager = projectManager;
    }

    void showProjectDetails() {
        System.out.println("Project Name " + projectName);
        System.out.println("Duration in Months " + durationInMonths);
        System.out.println("Project Domain " + domain);
        System.out.println("Project Manager " + projectManager);
    }
}

