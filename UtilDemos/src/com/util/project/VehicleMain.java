package com.util.project;

import java.util.*;

public class VehicleMain {
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
        System.out.println();
        System.out.println("Sorted by Brand");
        Collections.sort(vehicleList, new BrandSort());
        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle);
        }System.out.println();
        System.out.println("Sorted by Model");
        Collections.sort(vehicleList, new ModelSort());
        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle);
        }
        System.out.println();
        System.out.println("Sorted by Price");
        Collections.sort(vehicleList, new PriceSort());
        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle);
        }
    }
}
