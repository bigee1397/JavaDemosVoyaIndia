package com.voya.overloading;

public class VarArgsDemo {

    void calcSum(String name, int... marks) {
        System.out.println("Welcome " + name);
        int sum = 0;
        for(int mark: marks) sum+=mark;
        System.out.println("Sum: " + sum);
    }

    void calcSum(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        VarArgsDemo demo = new VarArgsDemo();
        demo.calcSum("Sri");
        demo.calcSum("nidhi",40,50,20);
        demo.calcSum("bhargav",12,20,30,40);
    }

}
