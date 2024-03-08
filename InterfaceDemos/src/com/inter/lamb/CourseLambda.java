package com.inter.lamb;

public class CourseLambda {
    public static void main(String[] args) {
        ICourses courses = () -> new String[]{"HTML", "CSS", "Bootstrap"};
        System.out.print("Web Courses: ");
        for (String webCourse : courses.showCourses()) System.out.print(webCourse + " ");
        System.out.println();
        courses = () -> new String[]{"AWS", "GCP", "Heroku"};
        System.out.print("Cloud Courses: ");
        for (String cloudCourse : courses.showCourses()) System.out.print(cloudCourse + " ");
        System.out.println();
        courses = () -> new String[]{"Java", "Spring", "JUnit"};
        System.out.print("Java Full Stack Courses: ");
        for (String jFSDCourse : courses.showCourses()) System.out.print(jFSDCourse + " ");

    }
}
