package com.objects.inheritance;

public class FinMain {

    public static void main(String[] args) {
        String[] tools = {"Junit", "Git", "HTML"};
        TeamTwo tt = new TeamTwo("VI", 6, "Financial", "Rekha", tools);
        TeamOne to = new TeamOne("Voya india", 7, "FinTech", "Suma", "JavaFullStack");
        Project project = new Project("CC", 8, "IIM", "Swaroop");
        String[] tsArray = to.showTechStack();
        System.out.println("From Team One: " );
        to.showProjectDetails();
        for (String tool : tsArray) {
            System.out.print(tool + " ");
        }
        System.out.println();
        System.out.println();

        tt.showSupportTools();
        tt.showProjectDetails();

        System.out.println();

        project.showProjectDetails();
    }

}
