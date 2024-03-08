package com.voya.bean;

public class VehicleMain {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.setBrand("BMW");
        vehicle.setModel("XM");
        vehicle.setPrice(35000000);

        System.out.println(vehicle.toString());
    }

}
