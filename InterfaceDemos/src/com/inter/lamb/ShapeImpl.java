package com.inter.lamb;

public class ShapeImpl {
    public static void main(String[] args) {
        IShape rectangle = new IShape() {
            @Override
            public void area(int x, int y) {
                System.out.println("Area of rectangle is: " + (x*y));
            }
        };

        rectangle.area(4,5);

        IShape triangle  = new IShape() {
            @Override
            public void area(int x, int y) {
                System.out.println("Area of Triangle is: " + (x*y*0.5));
            }
        };

        triangle.area(4,5);


    }
}
