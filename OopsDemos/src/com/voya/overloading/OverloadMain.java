package com.voya.overloading;

public class OverloadMain {

    public static void main(String[] args) {

        Shape shape = new Shape();

        shape.calcArea(10);
        shape.calcArea(2.0);
        System.out.println("Reactangle: " +shape.calcArea(4,5));
        System.out.println("Triangle: " +shape.calcArea(3.0,5));

    }

}
