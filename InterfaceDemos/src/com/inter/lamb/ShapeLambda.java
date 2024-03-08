package com.inter.lamb;

public class ShapeLambda {
    public static void main(String[] args) {
        IShape square = (side, side1) -> System.out.println("Area of Square: " + side*side);
        square.area(5,6);

        square = (length, breadth) -> System.out.println("Area of Rectangle: " + (length*breadth));
        square.area(5,6);

        square = (base, height) -> System.out.println("Area of Triangle: " + (0.5*base*height));
        square.area(5,6);

        square = (radius, diameter) -> System.out.println("Area of rectangle: " + (Math.PI*Math.pow(radius,2)));
        square.area(5,6);

    }
}
