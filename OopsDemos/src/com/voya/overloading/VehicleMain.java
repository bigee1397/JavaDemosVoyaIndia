package com.voya.overloading;

public class VehicleMain {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle vehicle1 = new Vehicle("Audi");
        Vehicle vehicle2 = new Vehicle("BMW", "XM");
        Vehicle vehicle3 = new Vehicle("Tata",1_50_000.0,"Nano");

        vehicle.getDetails();
        System.out.println();

        vehicle1.getDetails();
        System.out.println();

        vehicle2.getDetails();
        System.out.println();

        vehicle3.getDetails();

    }

}
