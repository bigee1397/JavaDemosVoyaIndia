package com.inter.extend;

public class CalcMain {
    public static void main(String[] args) {
        ICalculator calculator = new BasicCalculator();
        calculator.add(2,3);
        calculator.product(2,3);
        calculator.diff(5,3);

        System.out.println();

        IScientific sciCalculator = new ScientificCalculator();
        sciCalculator.square(3);
        sciCalculator.cube(2);
        sciCalculator.add(4,5);
        sciCalculator.product(4,5);
        sciCalculator.diff(5,2);
    }
}
