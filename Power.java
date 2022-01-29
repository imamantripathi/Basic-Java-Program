// package com.company;

import java.util.Scanner;

public class Power {
    public static void main(String[] args){
        // Here number is the base and p is the exponent
        int number =0;
        int p=0;
        long result=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of number ");
        number = sc.nextInt();
        System.out.println("Enter the value of P");
        p=sc.nextInt();
        // copying the exponent value to the loop counter
        int i = p;
        for (;i!=0;--i)
        {
            result*=number;

        }
        // Displaying the output
        System.out.println(number+"^"+p+" = "+result);

    }
}
