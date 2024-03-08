package com.util.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1,"Java");
        hashMap.put(10,"Spring");
        hashMap.put(8,"Node");
        hashMap.put(null,"CSS");
        hashMap.put(null,"CSS Library");
        hashMap.put(5,"HTML");
        hashMap.put(1,"React");
        hashMap.put(100,null);
        hashMap.put(101,null);

        System.out.println(hashMap);
        System.out.println(hashMap.get(102));
        System.out.println(hashMap.getOrDefault(102, "Jenkins"));

        Set<Integer> keySet = hashMap.keySet();
        for (Integer key : keySet ) {
            System.out.println("{" + key + ", " + hashMap.get(key) + "}");
        }
        System.out.println();
        System.out.println("Using entry set");
        Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();
        for (Map.Entry<Integer, String> entry : entries ) {
            System.out.println("{"+entry.getKey() + ", " + entry.getValue() + "}");
        }
    }
}
