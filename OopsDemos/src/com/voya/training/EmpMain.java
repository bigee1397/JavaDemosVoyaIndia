package com.voya.training;

public class EmpMain {
    public static void main(String[] args) {
        System.out.println("Heyyy!!!");

        Employee employee = new Employee(303099,"Bhargav",23000);
        employee.getDetails();

        String welcomeMsg = employee.greet("back ");
        System.out.println(welcomeMsg);
    }
}
