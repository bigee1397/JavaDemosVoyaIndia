package com.api.lang;

public class HashDemo {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("X100","Audi","Black");
        Vehicle vehicle2 = new Vehicle("X100","Audi","White");
        Vehicle vehicle3 = new Vehicle("Q5","Audi","White");
        Vehicle vehicle4 = new Vehicle("X100","Audi","Black");

        System.out.println(vehicle1.equals(vehicle2));
        System.out.println(vehicle1.equals(vehicle3));
        System.out.println(vehicle1.equals(vehicle4));
        System.out.println(vehicle1.hashCode());
        System.out.println(vehicle2.hashCode());
        System.out.println(vehicle3.hashCode());
        System.out.println(vehicle4.hashCode());
    }
}
