package com.voya.threads.basic;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread);
        thread.setName("poppy");
        System.out.println(thread);
        thread.setPriority(Thread.MIN_PRIORITY + 6);
        System.out.println(thread);
        thread.setName("sam");
        int[] nums = null;
        System.out.println(nums[0]);
    }
}