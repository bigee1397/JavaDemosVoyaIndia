package com.inter.basics;

public class VehicleMain {
    public static void main(String[] args) {
        Car car = new Car("BMW", "XM", 3500000, "Sports");
        car.getDetails();
        car.getMileage();
        car.showAcc();
        car.insuranceDetails();
        car.interiors();
        car.exterior();


        Bike bike = new Bike("BMW", "XM", 3500000, 350);
        bike.getDetails();
        bike.getMileage();
        bike.showAcc();
        bike.insuranceDetails();
        bike.exterior();
        bike.checkCapacity(bike.capacity);
    }
}
