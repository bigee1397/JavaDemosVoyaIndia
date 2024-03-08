package com.voya.abstraction;

abstract  class Branch2 extends Bank{
    @Override
    void educationLoan() {
        System.out.println("Education Loan from Branch2");
    }

    @Override
    void houseLoan() {
        System.out.println("House Loan from Branch2");
    }

    void staffDetails() {
        System.out.println("Staff details from Branch2");
    }
}
