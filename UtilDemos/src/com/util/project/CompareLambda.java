package com.util.project;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareLambda {
    public static void main(String[] args) {
        List<Vehicle> vehicleList = Arrays.asList(
                new Vehicle("Honda", "City", 2390000),
                new Vehicle("Tata", "Hexa", 1290000),
                new Vehicle("Hyundai", "Santro", 4390000),
                new Vehicle("Audi", "A100", 4590000),
                new Vehicle("Maruthi", "X10", 1190000)
        );

        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle);
        }
        System.out.println("Sorted via Model");
        Collections.sort(vehicleList, (Vehicle vehicle1, Vehicle vehicle2) -> vehicle1.getModel().compareTo(vehicle2.getModel()));
        System.out.println();
        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle);
        }
        System.out.println();
        System.out.println("Sorted via Price");
        Collections.sort(vehicleList, (Vehicle vehicle1, Vehicle vehicle2) -> ((Double)vehicle1.getPrice()).compareTo(vehicle2.getPrice()));
        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle);
        }

        System.out.println();
        System.out.println("Sorted via Brand");
        Collections.sort(vehicleList, (Vehicle vehicle1, Vehicle vehicle2) -> vehicle1.getBrand().compareTo(vehicle2.getBrand()));
        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle);
        }
    }
}
