// package com.company;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]){
        System.out.println("Enter any String ");
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        Queue queue = new LinkedList();
        for(int i = inputString.length()-1;i>=0;i--)
        {
            queue.add(inputString.charAt(i));
        }
        String reverseString= "";
        while(!queue.isEmpty())
        {
            reverseString= reverseString+queue.remove();

        }
        if(inputString.equals(reverseString))
            System.out.println("The Input String is Palindrome ");
        else
            System.out.println("The Input String is not Palindrome");

    }
}
