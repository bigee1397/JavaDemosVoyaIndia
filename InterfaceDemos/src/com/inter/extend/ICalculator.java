package com.inter.extend;

public interface ICalculator {

    void add(int x, int y);
    void product(int x, int y);

    default void diff(int x, int y) {
        System.out.println("Difference of " + x + " and "+ y + " is " + (x-y));
    }

}
