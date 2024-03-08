package com.voya.inheritance;

public class InManager extends InEmployee{

    double salary;

    InManager(String empName, int empId, int salary) {
        super(empName, empId);
        this.salary = salary;
    }

    void printBonus(double amount) {
        System.out.println("Bonus: " + (amount+salary));
    }

}
