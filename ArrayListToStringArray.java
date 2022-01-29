// package com.company;/

import java.util.ArrayList;

public class ArrayListToStringArray {
    public static void main(String args[])
    {
        ArrayList<String> arrlist = new ArrayList<String>();
        arrlist.add(" Streo heart ");
        arrlist.add(" Let mew love you ");
        arrlist.add(" Into my arms");
        arrlist.add(" darkside ");
        String ar[]=arrlist.toArray(new String[arrlist.size()]);
        for (String aa:ar
             ) {
            System.out.println(aa);
        }
    }
}
