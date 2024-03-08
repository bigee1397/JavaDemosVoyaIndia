package com.voya.abstraction;

public class AbsMain {

    public static void main(String[] args) {

        Bank bank = new Branch1();
        bank.admin();
        bank.carLoan();
        bank.educationLoan();
        bank.houseLoan();


        System.out.println();



    }

}
