package com.util.maps;

import java.lang.reflect.Array;
import java.util.*;

public class MapStateDemo {
    public static void main(String[] args) {
        Map<String, List<String>> hashMap = new HashMap<>();
        hashMap.put("Karnataka", Arrays.asList("Bangalore","Hampi","Kalburgi","Tumkur"));
        hashMap.put("Andhra Pradesh", Arrays.asList("Ananthpur","Cuddapa","Hyderabad"));
        hashMap.put("Kerala", Arrays.asList("Munnar", "Kollam","Kochi","Kozhikode"));
        hashMap.put("Tamil Nadu", Arrays.asList("Melmaruvathur", "Vellore","Tiruvanamalai","Coimbatore"));

        Set<String> stateSet = hashMap.keySet();
        for (String state : stateSet) {
            System.out.println(state + " followed by list of cities: ");
            for(String listItem : hashMap.get(state)) {
                System.out.println(listItem);
            }
            System.out.println();
        }

    }
}
//            System.out.println("[ " + state + " : " + hashMap.get(state) + " ]" );
