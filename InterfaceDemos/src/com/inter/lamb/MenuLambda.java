package com.inter.lamb;

public class MenuLambda {
    public static void main(String[] args) {
        IMenu menu = () ->{
            System.out.println("Indian Food");
            System.out.println("Dosa, Idli, Vada, RiceBath");
        };
        menu.showMenus();
        System.out.println();
        menu = () -> {
            System.out.println("Chinese Food");
            System.out.println("Manchurian, Noodles, Chow Mein");
        };
        menu.showMenus();
        System.out.println();
        menu = () -> {
            System.out.println("Italian Food");
            System.out.println("Pasta, Pizza, Truffle Pasta");
        };
        menu.showMenus();
    }
}
