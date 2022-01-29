// package com.company;
// Java program to find all prime
// adam numbers in the given range

import java.util.Scanner;

class GFG {

    public static int reverse(int a)
    {
        int rev = 0;
        while (a != 0) {
            int r = a % 10;

            // reversing a number by taking
            // remainder at a time
            rev = rev * 10 + r;
            a = a / 10;
        }
        return (rev);
    }

    // Function to check if a number
    // is a prime or not
    public static int prime(int a)
    {
        int k = 0;

        // Iterating till the number
        for (int i = 2; i < a; i++) {

            // Checking for factors
            if (a % i == 0) {
                k = 1;
                break;
            }
        }

        // Returning 1 if the there are no factors
        // of the number other than 1 or itself
        if (k == 1) {
            return (0);
        }
        else {
            return (1);
        }
    }

    // Function to check whether a number
    // is an adam number or not
    public static int adam(int a)
    {
        // Reversing given number
        int r1 = reverse(a);

        // Squaring given number
        int s1 = a * a;

        // Squaring reversed number
        int s2 = r1 * r1;

        // Reversing the square of the
        // reversed number
        int r2 = reverse(s2);

        // Checking if the square of the number
        // and the square of its reverse
        // are equal or not
        if (s1 == r2) {
            return (1);
        }
        else {
            return (0);
        }
    }
    // Function to find all the prime
    // adam numbers in the given range
    public static void find(int m, int n)
    {

        // If the first number is greater
        // than the second number,
        // print invalid
        if (m > n) {
            System.out.println(" INVALID INPUT ");
        }
        else {

        //    int c = 0;

            // Iterating through all the numbers
            // in the given range
            for (int i = m; i <= n; i++) {

                // Checking for prime number
                int l = prime(i);

                // Checking for Adam number
                int k = adam(i);
                if ((l == 1) && (k == 1)) {
                    System.out.print(i + "\t");
                }
            }
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the staring range value ");
        int L = sc.nextInt();
        System.out.println("enter the ending range value ");
        int R =sc.nextInt();



        find(L, R);
    }
}
