package com.util.project;

import java.util.*;

public class CheckDemo {
    public static void main(String[] args) {
        List<String> fruitsList = new ArrayList<>();
        fruitsList.add("Blueberry");
        fruitsList.add("Apple");
        fruitsList.add("Raspberry");
        fruitsList.add("Cranberry");
        fruitsList.add("Custard Apple");
        fruitsList.add("Apple");
        fruitsList.add("Ooty Apple");
        fruitsList.add("Green Apple");
        fruitsList.add("Kashmir Apple");
        fruitsList.add("Custard Apple");
        fruitsList.add("Cranberry");
        fruitsList.add("Pineapple");
        fruitsList.add("Red Apple");

        List<String> appleList = new ArrayList<>();
        List<String> berryList = new ArrayList<>();

        for (String fruit : fruitsList ) {
            if((fruit.toLowerCase()).contains("apple")) {
                appleList.add(fruit);
            } else if((fruit.toLowerCase()).contains("berry")) {
                berryList.add(fruit);
            }
        }

        Iterator iterator = appleList.iterator();
        System.out.println("-------------Apple List-------------");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
        iterator = berryList.iterator();
        System.out.println("-------------Berry List-------------");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Set<String> setFruits = new HashSet<>(fruitsList);
        System.out.println(setFruits);
    }
}
