// package com.company;
import java.util.ArrayList;

public class ArrayListToString {
    public static void main(String args[])
    {
        ArrayList<String> arrlist = new ArrayList<String>();
        arrlist.add(" aman ");
        arrlist.add(" manu ");
        arrlist.add("ram");
        arrlist.add(" Gagan ");
        arrlist.add(" Ram");
        String arr[] = new String[arrlist.size()];
        for(int i =0;i<arrlist.size();i++)
        {
            arr[i]=arrlist.get(i);
        }
        for (String a:arr)
              {
                  System.out.println(a);
        }


    }
}
