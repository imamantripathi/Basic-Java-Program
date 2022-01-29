// package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Loopexam2 {
    public static void main(String args[])
    {
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        arrlist.add(45);
        arrlist.add(65);
        arrlist.add(54);
        arrlist.add(89);
        System.out.println(" Adavanxed loop ");
        for(int ama : arrlist)
        {
            System.out.println(ama);

        }
        // looping array list using Iterator
        System.out.println(" Iterator loop ");
        Iterator<Integer> ar=arrlist.iterator();
        while(ar.hasNext())
        {
            System.out.println(ar.next());
        }

    }
}
