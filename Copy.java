// package com.company;

public class Copy {
    public static void main(String[] args) {
        char copyForm[] = {'d','e','c','a','f','f','e','i','n','a','t','e','d'};
        char[]copyTo = new char[7];
        System.arraycopy(copyForm,2,copyTo,0,7);
        System.out.println(copyTo);
    }
}
