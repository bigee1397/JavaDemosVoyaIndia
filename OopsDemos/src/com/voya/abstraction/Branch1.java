package com.voya.abstraction;

public class Branch1 extends Bank{

    @Override
    void carLoan() {
        System.out.println("Car Loan from Branch1");
    }

    @Override
    void educationLoan() {
        System.out.println("Education Loan from Branch1");
    }

    @Override
    void houseLoan() {
        System.out.println("House Loan from Branch1");
    }

    void payInterest() {
        System.out.println("Interest from Branch 1");
    }
}
