package com.util.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashDemo {
    public static void main(String[] args) {
//        HashSet<String> hashSet = new HashSet<>();
//        LinkedHashSet<String> hashSet = new LinkedHashSet<>();
        TreeSet<String> hashSet = new TreeSet<>();

        hashSet.add("Hello");
        hashSet.add("Hello");
        hashSet.add("Welcome");
        hashSet.add("Welcome");
        hashSet.add("Welcome");
//        hashSet.add(null);
        hashSet.add("To");
        hashSet.add("To");
        hashSet.add("To");
        hashSet.add("Voya");
//        hashSet.add(null);
        hashSet.add("India");
        hashSet.add("India");
        hashSet.add("Java");
        hashSet.add("Java");
        hashSet.add("Java");
//        hashSet.add(null);
        hashSet.add("Java");
        hashSet.add("Training");
        hashSet.add("Batch");
        hashSet.add("Batch");
        hashSet.add("2024");
        hashSet.add("2024");
        System.out.println(hashSet);
    }
}
