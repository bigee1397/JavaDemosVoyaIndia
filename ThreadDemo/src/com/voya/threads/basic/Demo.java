package com.voya.threads.basic;

public class Demo {
    public static void main(String[] args) {
//        Thread thread = new Thread();
//        Runnable task1 = () -> System.out.println("this is thread one");
//        task1.run();
        Thread thread = new Thread(() -> System.out.println("This is the thread one execution"), "thread-one");
        thread.start();
        System.out.println(thread.getName());
    }
}
