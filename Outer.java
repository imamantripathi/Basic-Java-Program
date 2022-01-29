// package com.company;

import java.util.Scanner;

public class Outer {
    int  prime (int x ,int i)
    {
        if (x==2)
            return 1;
        else if (x%i==0)
            return 0;
        else {
            i++;
            prime(x, i);
            return 1;
        }

    }

    public static void main(String[] args) {
        Outer obj = new Outer();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number the check ");
        int n = sc.nextInt();
       int a= obj.prime(n,2);
        if(a==1)
            System.out.println("yes prime ");
else
            System.out.println("not prime ");
    }
}
