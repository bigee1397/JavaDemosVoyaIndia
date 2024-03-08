package com.voya.training;

class Employee {
    int employeeId;
    String employeeName;
    float salary;

    void getDetails() {
        System.out.println("Name: " + employeeName);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Salary: " + salary);
    }

    public Employee(int employeeId, String employeeName, float salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    String greet(String message) {
        return "welcome " + message;
    }

}
