// package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import java.util.StringTokenizer;

public class Question3_2020practical {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toUpperCase();
        int i, j;
        if (".?!".indexOf(s.charAt(s.length() - 1)) != -1) {
            System.out.println(s);
            s = s.substring(0, s.length() - 1);
            StringTokenizer str = new StringTokenizer(s);

            int l = str.countTokens();
            String[] ss = new String[l];
            for (i = 0; i < l; i++)
                ss[i] = str.nextToken();
            // now sorting the array
            for (i = 0; i < l - 1; i++) {
                for (j = 0; j < i - 1; j++) {
                    if (ss[j].length() > ss[j + 1].length()) {
                        String t = ss[j];
                        ss[j] = ss[j + 1];
                        ss[j + 1] = t;

                    }
                    if (ss[j].length() == ss[j + 1].length() && (ss[j].compareTo(ss[j + 1]) > 0)) {
                        String temp = ss[j];
                        ss[j] = ss[j + 1];
                        ss[j + 1] = temp;

                    }
                }
            }
            for (i = 0; i < l; i++)
                System.out.print(ss[i] + " ");


        } else
            System.out.println(" INVALID INPUT");
    }
}

