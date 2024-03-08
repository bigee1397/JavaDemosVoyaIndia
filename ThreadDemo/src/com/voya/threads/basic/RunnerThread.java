package com.voya.threads.basic;

import java.util.concurrent.ExecutionException;



class Runner implements Runnable {
    String name;
    Greetings greetings;

    Runner(String name, Greetings greetings) {
        Thread thread = new Thread(this, name);
        this.name = name;
        this.greetings = greetings;
        thread.start();
    }

    @Override
    public void run() {
        synchronized (greetings) {
            System.out.println(greetings.sayHello(name));
            System.out.println("done");
        }

//        System.out.println(Thread.currentThread().getName());
//        try {
//            Thread.sleep(2000);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println("Done");
    }
}

public class RunnerThread {
    public static void main(String[] args) {
//        Runner runner = new Runner();
//        Thread thread = new Thread(runner, "thread-one");
//        Thread thread1 = new Thread(runner, "thread-two");
        Greetings greetings = new Greetings();
        Runner runner1 = new Runner("user1",greetings);
        Runner runner2 = new Runner("user2",greetings);
        Runner runner3 = new Runner("user3",greetings);
        Runner runner4 = new Runner("user4",greetings);

//        thread.start();
//        thread1.start();
    }
}
