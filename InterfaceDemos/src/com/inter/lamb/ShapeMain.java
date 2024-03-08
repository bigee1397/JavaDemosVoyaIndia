package com.inter.lamb;

public class ShapeMain {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        IShape shape = new Reactangle();
        shapeFactory.printArea(shape, 10, 20);

        System.out.println();
//        using anonymous inner class

        shapeFactory.printArea(new IShape() {
            @Override
            public void area(int x, int y) {
                System.out.println("Printing area from anonymous inner class: " + (x * y));
            }
        }, 10, 20);

        System.out.println();

        shapeFactory.printArea((x, y) -> System.out.println("From a lambda expression: " + (x * y)), 10, 20);
    }
}
