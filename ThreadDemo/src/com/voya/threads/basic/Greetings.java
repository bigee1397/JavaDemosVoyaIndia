package com.voya.threads.basic;

public class Greetings {
    public String sayHello(String name) {
        String res = null;
        try {
            System.out.println("Hi " + name);
//            Thread.sleep(1000);
            res = "Great Day " + name;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
}