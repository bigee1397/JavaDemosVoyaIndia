package com.inter.lamb;

public class Waiter{

    public void availableItems(IMenu menu) {
        System.out.println("Welcome to my hotel");
        menu.showMenus();
        System.out.println("Ordered Now!!!!!!!");
    }
}
