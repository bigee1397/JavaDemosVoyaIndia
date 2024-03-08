package com.inter.lamb;

public class AnonymousInnerClass {

    public static void main(String[] args) {
//        Using a class that implements the interface
        IGreeter iGreeter = new GreeterImpl();
        iGreeter.greetMessage("Hey");


        IGreeter greeter1 = new IGreeter(){

            @Override
            public void greetMessage(String message) {
                System.out.println(message + " User1111!!!!!!!!!!!");
            }
        };

        greeter1.greetMessage("Heyy,");

    }

}
