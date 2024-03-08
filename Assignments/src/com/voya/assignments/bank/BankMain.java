package com.voya.assignments.bank;

import java.util.Scanner;

public class BankMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the inital deposit amount: ");
        int initialDeposit = sc.nextInt();
        Bank bank = new Bank(initialDeposit);

        System.out.println("Congratulations!! Your account is created.");

        while (true) {
            System.out.println("Enter your choice: ");
            System.out.println("1.Withdraw\n2.Deposit\n3.Display Balance\n4.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the amount you want to Withdraw: ");
                    double withdrawAmount = sc.nextInt();
                    bank.withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.println("Enter the amount you want to Deposit: ");
                    double depositAmount = sc.nextInt();
                    bank.deposit(depositAmount);
                    break;
                case 3:
                    System.out.println("Your account's balance is: " + bank.getBalance());
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid Input!!!!!!");
            }
        }

    }

}
