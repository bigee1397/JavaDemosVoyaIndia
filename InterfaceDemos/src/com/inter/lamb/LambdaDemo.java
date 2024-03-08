package com.inter.lamb;

public class LambdaDemo {

    public static void main(String[] args) {
        IGreeter greet = (message) -> System.out.println(message + " User!!!");
        greet.greetMessage("Heyyy");
        greet = (message) -> System.out.println(message + " User1!!!!");
        greet.greetMessage("Hello");
    }
}
