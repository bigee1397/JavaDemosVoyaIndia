package com.voya.threads.basic;

public class Booking {
    public double bookTickets(String name, int noOfTickets) {
        System.out.println("Booked for " + name);
        try {
//            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Total price " + (noOfTickets * 200));
        return noOfTickets * 200;
    }
}