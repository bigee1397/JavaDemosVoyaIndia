package com.voya.exceptions;

public class Atm {
    public static void main(String[] args) {
        System.out.println("In ATM");
        try {
            Bank bank = new Bank();
            bank.withdraw(3000);
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("Close atm");
    }
}
