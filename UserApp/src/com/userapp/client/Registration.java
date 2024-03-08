package com.userapp.client;

import com.userapp.service.IValidationService;
import com.userapp.service.ValidationServiceImpl;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        IValidationService validationService = new ValidationServiceImpl();
        System.out.println("Enter username: ");
        String uName = sc.nextLine();
        try{
            if(validationService.validateUsername(uName)) {
                System.out.println("Welcome user, " + uName);
                System.out.println("Enter password: ");
                String passWord = sc.nextLine();
                if(validationService.validatePassword(passWord)) {
                    System.out.println("You have entered a correct password, Access Granted!!!!!");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}