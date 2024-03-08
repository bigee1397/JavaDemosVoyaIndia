package com.objects.inheritance;

class TeamOne extends  Project {
    String techStack; // Value for this is "Java FullStack"

    public TeamOne(String projectName, int durationInMonths, String domain, String projectManager, String techStack) {
        super(projectName, durationInMonths, domain, projectManager);
        this.techStack = techStack;
    }

    String[] showTechStack() {
        String[] techStackArray = {"Java", "GitHub"};
        return techStackArray;
    }
}
