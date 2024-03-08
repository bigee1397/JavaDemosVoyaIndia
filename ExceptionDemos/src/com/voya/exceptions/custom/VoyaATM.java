package com.voya.exceptions.custom;

public class VoyaATM {
    public static void main(String[] args) {
        VoyaBank voyaBank = new VoyaBank(44000);

        try {
            voyaBank.withdraw(3550);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("End of Program..........");

    }
}