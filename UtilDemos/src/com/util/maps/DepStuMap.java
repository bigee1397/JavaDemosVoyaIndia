package com.util.maps;

import java.util.*;

public class DepStuMap {
    public static void main(String[] args) {
        Map<Department, List<Student>> map = new HashMap<>();
        map.put(new Department("AM","AM01","Karthik"),
                Arrays.asList(
                        new Student("David","Bangalore"),
                        new Student("Patrick","Pune"),
                        new Student("Joe","Kozhikode")));
        map.put(new Department("Data","DA03","Sandra"),
                Arrays.asList(
                        new Student("Q","Ananthapur"),
                        new Student("Sal","Delhi"),
                        new Student("Murr","Coimbatore")));
        map.put(new Department("Digital","DI07","John"),
                Arrays.asList(
                        new Student("Hema","Hampi"),
                        new Student("Suhas","Kochi"),
                        new Student("Sarvesh","Vizag")));
        Set<Department> departmentSet = map.keySet();
        for ( Department department : departmentSet ) {
            System.out.println("Department Head: " + department.getDepHead());
            System.out.println("Department Name: " + department.getDepName());
            for( Student student : map.get(department)) {
                System.out.print(student.getStudentName() + " ");
            }
            System.out.println();
        }
    }
}
