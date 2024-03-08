package com.util.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Java");
        linkedList.add("S Spring");
        linkedList.add("Node");
        linkedList.add("Angular");
        linkedList.add("Maven");
        System.out.println(linkedList);
        linkedList.addFirst("HTML");
        linkedList.addLast("CSS");
        linkedList.set(1,"React");
        System.out.println(linkedList);
        System.out.println(linkedList.size());
        System.out.println(linkedList.get(0));

        System.out.println();

        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

    }
}
