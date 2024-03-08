package com.voya.threads.basic;

class Child extends Thread {
    public Child(String name, int priority) {
        super(name);
        System.out.println(this);
//        start();
    }
    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
//            System.out.println(Thread.currentThread().getName());
            System.out.println("5 x " + i + " = " + (5*i) + " " + Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ExThread {
    public static void main(String[] args) {
//        Thread thread = new Thread();
//        Child child = new Child("child-one",10);
//        child.setName("child-one");
//        System.out.println(child);
//        child.start();

        Child child1 = new Child("child-two", 6);
//        System.out.println("child-two");
//        System.out.println(child1);
//        child1.start();
        child1.setDaemon(true);
        child1.start();

            System.out.println();
        for (int i = 1; i < 11; i++) {
            System.out.println("10 x " + i + " = " + (10*i) + " " + Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

//        try {
////            child.join();
//            child1.join();
//        }catch (Exception e) {
//            e.printStackTrace();
//        }
        System.out.println("main is completed");
    }
}
