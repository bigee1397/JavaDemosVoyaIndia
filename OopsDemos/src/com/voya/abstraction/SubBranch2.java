package com.voya.abstraction;

public class SubBranch2 extends Branch2 {

    @Override
    void carLoan() {
        System.out.println("Car Loan from SubBranch2");
    }

    @Override
    void educationLoan() {
        System.out.println("Education Load overridden from Branch 2, this is from SubBranch2");
    }

    void subPay() {
        System.out.println("Sub pay from SubBranch2");
    }
}
