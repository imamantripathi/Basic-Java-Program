// package com.company;

import java.util.*;

public class JavaExampleForliklist {
    public static void main(String args[])
    {
        LinkedList<String> linklist = new LinkedList<String>();
        linklist.add("Steve");
        linklist.add("Aman");
        linklist.add("WareHouse");
        // Adding an Element to the first position
        linklist.addFirst("first");
        // Adding an Element to the last position
        linklist.addLast("LastElement");
        linklist.add(2,"third");
        Iterator<String> iterator = linklist.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
