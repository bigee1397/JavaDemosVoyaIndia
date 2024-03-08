package com.voya.threads.basic;



class Counter implements Runnable {

    String name;
    int noOfTickets;
    Booking booking;

    Counter(String name, int noOfTickets, Booking booking) {
        Thread thread = new Thread(this, name);
        this.booking = booking;
        this.noOfTickets = noOfTickets;
        this.name = name;
        thread.start();
    }

    @Override
    public void run() {
        synchronized (booking) {
            System.out.println(booking.bookTickets(name, noOfTickets));
            System.out.println("Enjoy the movie, end of run method");
        }
    }
}

public class Dashboard {
    public static void main(String[] args) {
        Booking booking = new Booking();

        Counter counter1 = new Counter("Bhargav", 2, booking);
        Counter counter2 = new Counter("Swaroopa", 1, booking);
        Counter counter3 = new Counter("Girish", 5, booking);
        Counter counter4 = new Counter("Nidhi", 4, booking);
    }
}
