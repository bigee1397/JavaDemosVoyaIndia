package com.inter.basics;

public class Car extends Vehicle implements IInsurance,IExternal,IInternal{

    String type;

    public Car(String brand, String model, double price, String type) {
        super(brand, model, price);
        this.type = type;
    }

    @Override
    public void showAcc() {
        System.out.println("This is the Overall Accessories of the car");
    }

    @Override
    public void exterior() {
        System.out.println("This is the Exterior Accessories of the car");
    }

    @Override
    public void interiors() {
        System.out.println("This is the Interior Accessories of the car");
    }

    @Override
    void getMileage() {
        System.out.println("Mileage of the car is 15km/L");
    }

}
