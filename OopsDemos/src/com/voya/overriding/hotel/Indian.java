package com.voya.overriding.hotel;

public class Indian extends Menu{

    @Override
    void showItems(String types) {
        if(types.equalsIgnoreCase("breakfast")){
            System.out.println("Dosa, rice bath");
        }
        else if(types.equalsIgnoreCase("lunch")){
            System.out.println("half meals, full meals");
        }
        else if(types.equalsIgnoreCase("dinner")){
            System.out.println("North full meal, south full meal");
        }
        else  {
            System.out.println("Champakali, Kesari bath");
        }
    }
}


