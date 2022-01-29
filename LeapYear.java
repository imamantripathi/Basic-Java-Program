// package com.company;

import java.util.Scanner;

public class LeapYear {
    public static void main(String args[] ){
        int year = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any year :");
        year = sc.nextInt();
        sc.close();
        boolean leapyear=false;
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                    leapyear=true;
                else
                    leapyear=false;

            }
            else
                leapyear=true;

        }
        else
        {
            leapyear=false;
        }
if(leapyear==true)
    System.out.println(year+" is a Leap year.");
else
    System.out.println(year+" is not a Leap year");
    }
}
