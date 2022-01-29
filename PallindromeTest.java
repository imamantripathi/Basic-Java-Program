// package com.company;
import java.util.Stack;
import java.util.Scanner;

public class PallindromeTest {
    public static void main(String args[]){
        System.out.println("Enter any String ");
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        Stack stack = new Stack();
        for(int i = 0;i<inputString.length();i++){
            stack.push(inputString.charAt(i));

        }
        String reverseString = "";
        while(!stack.isEmpty())
        {
            reverseString= reverseString+stack.pop();
        }
        if(inputString.equals(reverseString))
        {
            System.out.println(" The input String is a pallindrome ");

        }
        else
            System.out.println("The input String is not a pallindrome ");

    }
}
