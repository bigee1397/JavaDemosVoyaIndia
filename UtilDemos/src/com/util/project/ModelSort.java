package com.util.project;

import java.util.Comparator;

public class ModelSort implements Comparator<Vehicle> {
    @Override
    public int compare(Vehicle vehicle1, Vehicle vehicle2) {
        return vehicle1.getModel().compareTo(vehicle2.getModel());
    }
}
