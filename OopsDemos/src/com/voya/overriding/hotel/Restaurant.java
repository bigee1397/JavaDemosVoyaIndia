package com.voya.overriding.hotel;

import javax.naming.InitialContext;
import java.util.Scanner;

public class Restaurant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter which cuisine you want to eat: (Chinese, Indian) ");
        String choice = sc.nextLine();
        Menu menu = null;
        if(choice.equalsIgnoreCase("indian")) {
            menu = new Indian();
            System.out.println("Breakfast, Lunch, Dinner, Dessert");
            String foodChoice = sc.nextLine();
            menu.showItems(foodChoice);
        }
        else if(choice.equalsIgnoreCase("chinese")) {
            menu = new Chinese();
            System.out.println("Fast food, Lunch, Dessert");
            String foodChoice = sc.nextLine();
            menu.showItems(foodChoice);
            menu = new Indian();

            Chinese chinese = (Chinese) menu;
            chinese.printGames();
//            Chinese chinese = (Chinese) menu;
//            chinese.printGames();
        }
    }

}
