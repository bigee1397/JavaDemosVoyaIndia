package com.inter.basics;

public class Bike extends Vehicle implements IInsurance,IExternal{

    double capacity;

    public Bike(String brand, String model, double price, double capacity) {
        super(brand, model, price);
        this.capacity = capacity;
    }

    @Override
    public void showAcc() {
        System.out.println("This is the Overall Accessories of the Bike");
    }

    @Override
    public void exterior() {
        System.out.println("This is the Exterior Accessories of the Bike");
    }


    @Override
    void getMileage() {
        System.out.println("Mileage of the bike is 35km/L");
    }

    void checkCapacity(double capacity) {
        if(capacity == 350) System.out.println("Amazing Bike");
    }

}
