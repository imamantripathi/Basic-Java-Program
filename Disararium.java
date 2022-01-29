// Disarium number is the number is which sum is the digit(by increasing power) is equal to the num.
// package com.company;
import java.util.*;
class Disarium {
    static int num, size;

    Disarium(int nn) {
        num = nn;
        size = 0;
    }

    void countDigits() {
        int n = num;
        while (n != 0) {
            n /= 10;
            size++;
        }
    }

    int sumOfDigits(int n, int p) {
        if (n == 0)
            return 0;
        return (int) Math.pow(n % 10, p) + sumOfDigits(n / 10, p - 1);
    }

    void check() {
        int s = sumOfDigits(num, size);

        if (num == s)
            System.out.println("Disarium number");
        else
            System.out.println("not disarium");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no");
        int n = sc.nextInt();
        Disarium obj = new Disarium(n);
        obj.countDigits();
        obj.check();

    }
}
