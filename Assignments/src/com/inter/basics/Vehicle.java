package com.inter.basics;

abstract class Vehicle implements IInsurance {

    String brand;
    String model;
    double price;

    public Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    abstract void getMileage();

    @Override
    public void insuranceDetails() {
        System.out.println("This is the Insurance Details of the vehicle");
    }

    void getDetails(){
        System.out.println("Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}');
    }
}
