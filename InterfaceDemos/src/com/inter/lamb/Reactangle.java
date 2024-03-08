package com.inter.lamb;

public class Reactangle implements IShape {
    @Override
    public void area(int x, int y) {
        System.out.println("Rectangle: " + (x*y));
    }
}
