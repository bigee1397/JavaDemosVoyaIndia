package com.util.project;

import java.util.Comparator;

public class BrandSort implements Comparator<Vehicle> {

    @Override
    public int compare(Vehicle vehicle1, Vehicle vehicle2) {
        return vehicle1.getBrand().compareTo(vehicle2.getBrand());
    }
}
