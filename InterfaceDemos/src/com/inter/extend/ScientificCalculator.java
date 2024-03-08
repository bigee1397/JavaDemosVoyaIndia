package com.inter.extend;

public class ScientificCalculator  extends BasicCalculator implements IScientific {
    @Override
    public void square(int x) {
        System.out.println("Square of " + x + " is " + (x*x));
    }

    @Override
    public void cube(int y) {
        System.out.println("Cube of " + y + " is " + (y*y*y));
    }
}
