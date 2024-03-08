package com.voya.assignments.bank;

public class Bank {

    double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        this.balance = balance + amount;
    }

    void withdraw(double amount) {
        this.balance = balance - amount;
    }

    double getBalance(){
        return balance;
    }
}
