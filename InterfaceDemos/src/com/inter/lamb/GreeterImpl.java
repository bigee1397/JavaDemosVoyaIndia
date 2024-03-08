package com.inter.lamb;

public class GreeterImpl implements IGreeter{


    @Override
    public void greetMessage(String message) {
        System.out.println(message + " User!!!!!");
    }
}
