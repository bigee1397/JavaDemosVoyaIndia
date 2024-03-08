package com.voya.stat;

public class Demo {

    public static void main(String[] args) {
        try {
            Class.forName("com.voya.stat.Demo");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Trial.getMessage();
    }

}
