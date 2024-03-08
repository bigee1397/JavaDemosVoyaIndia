package com.util.list;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Welcome");
        list.add("To");
        list.add("Voya");
        list.add("India");
        list.add("Java");
        list.add("Training");
        list.add("Batch");
        list.add("2024");

        Iterator iterator = list.iterator();
        int i = 1;
        while (iterator.hasNext()) {
            System.out.println(iterator.next()+" " + i);
            i++;
        }
        Collections.sort(list);
        System.out.println(list);

    }
}
