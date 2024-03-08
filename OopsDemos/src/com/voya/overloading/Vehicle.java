package com.voya.overloading;

public class Vehicle {
    String brand;
    double price;
    String model;

    public Vehicle() {
        super();
        System.out.println("one");
    }

    public Vehicle(String brand) {
        this();
        System.out.println("two");
        this.brand = brand;
    }

    public Vehicle(String brand, String model) {
        this(brand);
        System.out.println("three");
        this.model = model;
    }

    public Vehicle(String brand, double price, String model) {
        this(brand, model);
        System.out.println("four");
        this.price = price;

    }

    void getDetails() {
        if(brand != null)
        System.out.println("Brand: " + brand);
        if(model != null)
        System.out.println("Model: " + model);
        if(price > 0)
        System.out.println("Price: " + price);
    }
}
