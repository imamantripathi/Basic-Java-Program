// package com.company;
import java.util.Scanner;
public class Multiply {
    public static void main(String[] args){
        // this reads the input provided by user
        // using keyboard
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number ");
        // this method reads the number provided by user
        int num1=sc.nextInt();
        System.out.println("Enter the second number ");
       int num2= sc.nextInt();
        // close the Scanner after use
        sc.close();
        // calculating product of two number
        int product = num1*num2;
        // display the multiplication result
        System.out.println("Output :"+product);
    }

}
