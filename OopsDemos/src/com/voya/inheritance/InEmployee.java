package com.voya.inheritance;

public class InEmployee {
    String empName;
    int empId;

    InEmployee(String empName, int empId) {
        this.empName = empName;
        this.empId = empId;
    }

    void getDetails() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empId);
    }

}
