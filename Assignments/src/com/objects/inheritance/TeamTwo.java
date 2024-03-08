package com.objects.inheritance;

class TeamTwo extends Project {
    String[] tools;

    public TeamTwo(String projectName, int durationInMonths, String domain, String projectManager, String[] tools) {
        super(projectName, durationInMonths, domain, projectManager);
        this.tools = tools;
    }

    void showSupportTools() {
        for (String tool: tools) {
            System.out.println(tool + " ");
        }
    }

}