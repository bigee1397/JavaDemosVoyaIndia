package com.voya.assignments;

public class Employee {

    String empName;
    String empDesignation;

    public Employee(String empName, String empDesignation) {
        this.empName = empName;
        this.empDesignation = empDesignation;
    }

    double calcBonus(double basicAllowance) {
        return basicAllowance;
    }
    double calcBonus(double basicAllowance,double houseAllowance, String gift) {
        System.out.println("Your gift is a " + gift);
        return basicAllowance + houseAllowance;
    }
    double calcBonus(double basicAllowance, double houseAllowance, double carAllowance, String gift) {
        System.out.println("Your gift is a " + gift);
        return basicAllowance + houseAllowance + carAllowance;
    }
}
