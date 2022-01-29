// package com.company;

public class Occurrence {

    static void countEachChar(String str) {
        // ASCII values ranges upto 256
        int counter[] = new int[256];
        // String length
        int len = str.length();

        /*
        This array holds thr occurrence of each char, for example
        ASCII value of A is 65 so if found twice then
        counter[65] would have the value 2, here 65 is the ASCII value of A

         */
        for (int i = 0; i < len; i++)
            counter[str.charAt(i)]++;
            // we are creating another array with size of String
            char[] array = new char[str.length()];
            for (int i = 0; i < len; i++) {
                array[i] = str.charAt(i);
                int flag = 0;
                for (int j = 0; j <= i; j++) {
                    /*
                    If a char is found in String then set the flag
                    so that we can print the Occurrence
                     */
                    if (str.charAt(i) == array[j])
                        flag++;
                }
                if (flag == 1)
                    System.out.println("Occurrence of char " + str.charAt(i) + " in the String is :" + counter[str.charAt(i)]);
            }
        }

    public static void main(String args[])
    {
        String str = "Mymessagez";
        countEachChar(str);
    }
}
