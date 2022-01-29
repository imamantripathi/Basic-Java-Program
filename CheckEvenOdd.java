// package com.company;
import java.util.Scanner;
public class CheckEvenOdd {
    public static void main (String args[]){
        // the input provided by user is stored in num
        int num;
        System.out.println("Enter an Integer number ");
        Scanner sc = new Scanner(System.in);
num=sc.nextInt();
// if number is divisible by 2 then it is an even number else odd number
        if(num%2==0)
        {
            System.out.println("Entered Number is even ");
        }
        else
            System.out.println("Entered number is odd");
    }
}
