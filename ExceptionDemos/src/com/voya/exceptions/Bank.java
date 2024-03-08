package com.voya.exceptions;

public class Bank {
    double balance;
    void withdraw(double amount) throws Exception {
        System.out.println("Bank");
        try {
            if (amount>1000)
                throw new Exception("amount is greater than 1000........");
            balance = 8000 - amount;
            System.out.println(balance);
        } catch (Exception e) {
            System.out.println("Error ............");
            throw e;
        }
        finally {
            System.out.println("Close db");
        }
        System.out.println("Completed");
    }
}
