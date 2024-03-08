package com.voya.assignments;

import java.util.Scanner;

public class EmpMain {

    public static void main(String[] args) {

        Employee[] empList = new Employee[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < empList.length; i++) {
            System.out.println("Enter name of the employee: ");
            String name = sc.nextLine();
            System.out.println("Enter designation of the employee: (Programmer, Manager, Director)");
            String designation = sc.nextLine();
            empList[i] = new Employee(name, designation);
        }
        System.out.println("Enter you designation (Programmer, Manager, Director): ");
        String choice = sc.nextLine();
        for (Employee emp : empList) {
            if(choice.equalsIgnoreCase("programmer")) {
                System.out.println(emp.calcBonus(33090));
                break;
            }
            else if(choice.equalsIgnoreCase("manager")) {
                System.out.println(emp.calcBonus(3000,2000,"Laptop"));
                break;
            }
            else{
                System.out.println(emp.calcBonus(3000,2000, 4000,"Car"));
                break;
            }

        }



//        Employee employee = new Employee("Bhargav","Programmer");
    }

}
