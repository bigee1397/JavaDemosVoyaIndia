package com.voya.abstraction;

abstract class Bank {
    abstract void carLoan();
    abstract void educationLoan();
    abstract void houseLoan();

    void admin() {
        System.out.println("Admin details with bank.");
    }
}
