package com.voya.threads.concurrency;

import com.voya.threads.basic.Booking;
import com.voya.threads.basic.Greetings;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteDemo1 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute( () -> {
            System.out.println("Doing polling");
            Greetings greetings = new Greetings();
            greetings.sayHello("Bhargav");
        });
        executorService.execute( () -> {
            System.out.println("Extracting name from url");
            Booking booking = new Booking();
            System.out.println(booking.bookTickets("Bhargav", 5));
        });
        executorService.execute( () -> System.out.println("Reading from DB"));
        executorService.shutdown();
    }
}
