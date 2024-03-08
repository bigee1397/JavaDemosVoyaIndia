package com.inter.lamb;

public class CalcLambda {
    public static void main(String[] args) {
        IMyCalculator calc = (x, y) -> x + y;
        System.out.println("Sum: " + calc.calculate(4, 5));

        calc = (x, y) -> x - y;
        System.out.println("Difference: " + calc.calculate(4, 5));

        calc = (x, y) -> x * y;
        System.out.println("Product: " + calc.calculate(4, 5));

        calc = (x, y) -> y / x;
        System.out.println("Division: " + calc.calculate(4, 20));

        calc = (x, y) -> x * x;
        System.out.println("Square lambda function: " + calc.calculate(4, 5));
    }
}
