package com.voya.exceptions;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Welcome");
            String value = "10";
            System.out.println("Value " + value);
            int num = Integer.parseInt(value);
            System.out.println("Number " + num);
            int res = 100 / num;
            System.out.println(res);
//            int marks[] = null;
//            System.out.println(marks[0]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("close connection");
        }
        System.out.println("Completed");
    }
}

