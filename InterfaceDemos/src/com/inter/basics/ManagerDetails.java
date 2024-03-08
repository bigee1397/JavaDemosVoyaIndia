package com.inter.basics;

public class ManagerDetails implements IEntertainment{
    @Override
    public void showGames(String type) {
        if(type.equalsIgnoreCase("indoor"))
            System.out.println("Chess and Table tennis are available");
        else
            System.out.println("Football");
    }

    @Override
    public void showActivity() {
        System.out.println("Monthly trip with developers");
    }
}
