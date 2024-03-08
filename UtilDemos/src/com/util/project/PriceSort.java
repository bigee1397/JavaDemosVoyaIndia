package com.util.project;

import java.util.Comparator;

public class PriceSort implements Comparator<Vehicle> {
    @Override
    public int compare(Vehicle vehicle1, Vehicle vehicle2) {

        return ((Double)vehicle1.getPrice()).compareTo(vehicle2.getPrice());
    }
}
