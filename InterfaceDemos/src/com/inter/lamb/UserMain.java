package com.inter.lamb;

public class UserMain {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        waiter.availableItems(()-> System.out.println("List of Items......\nDosa\nIdli\nRiceBath\nBBB"));
    }
}
