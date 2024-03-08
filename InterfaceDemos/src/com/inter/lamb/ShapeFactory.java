package com.inter.lamb;

public class ShapeFactory {
    void printArea(IShape shape, int x, int y) {
        System.out.println("Printing area: ");
        shape.area(x,y);
        System.out.println("Completed...........");
    }
}
