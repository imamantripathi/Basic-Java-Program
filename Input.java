// package com.company;
import java.util.Scanner;// we have to import util package from java class to taking input

public class Input {
public static void main (String args[]){
    Scanner sc = new Scanner(System.in);// create an object of Scanner class i.e sc
    System.out.println("enter your name ");// message to the user
    String name = sc.nextLine();// nextLine() is a function of scanner class to take string type input
    System.out.println("enter your marks ");
    int marks = sc.nextInt();
    // now we print the detail
    System.out.println("Name is  "+name);
    System.out.println("marks are "+marks);
}
}
