package com.voya.exceptions;

public class BasicEx {
    public static void main(String[] args) {
        try {
            System.out.println("Welcome");
            String value = args[0];
            System.out.println("Value "+ value);
            int num = Integer.parseInt(value);
            System.out.println("Number " + num);
            int res = 100/num;
            System.out.println(res);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
