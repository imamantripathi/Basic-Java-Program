// package com.company;

import java.util.Scanner;

public class javaExampleforarray {
    public static void main(String args[])
    {
        System.out.println(" How many numbers you want to enter??");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        /*
        Declaring array of n number elementd ,the value of
        n is provided by the user
         */
        double[] arr = new double[n];
        double total = 0;
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(" enter Element No."+(i+1)+": ");
            arr[i]=sc.nextDouble();

        }
        sc.close();
        for(int i=0;i<arr.length;i++)
        {
            total = total+arr[i];

        }
        double average = total /arr.length;
        System.out.println(" The average is : "+average);
    }
}
