// package com.company;/

import java.util.Scanner;

public class Binary {
public static void main(String[] args){
    // two varables to hold two input binary numbers
    long b1,b2;
    int i=0;
    int carry=0;
    // this is to hold the output binary numbers
    int [] sum =new int[10];
    // to read the input binary numbers entered by user
    Scanner scanner = new Scanner(System.in);
    // getting first binary number from user
    System.out.println(" Enter first binary number :");
    b1 = scanner.nextLong();
    // getting secinfd binary number from user
    System.out.println("Enter second binary number :");
    b2=scanner.nextLong();
    // cl0ose scanner after use to avoid memory leak
    scanner.close();
    while (b1 != 0|| b2!= 0)
    {
        sum[i++]= (int)((b1%10+b2%10+carry)%2);
        carry = (int) ((b1%10+b2%10+carry)/2);
        b1=b1/10;
        b2=b2/10;

    }
    if(carry !=0){
        sum[i++]=carry;

    }
    --i;
    System.out.print("Output: ");
    while(i>=0){
        System.out.print(sum[i--]);

    }
    System.out.print("\n");
}
}

