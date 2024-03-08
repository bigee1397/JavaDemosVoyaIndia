package com.util.project;

import java.util.*;

public class EvenDemo {
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(11,12,39,20,60,23);
        List<Integer> evenNumbersList = new ArrayList<>();
        for (int number : numbersList) {
            if (number % 2 == 0)
                evenNumbersList.add(number);
        }
        Iterator iterator = evenNumbersList.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
