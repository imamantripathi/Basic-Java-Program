// package com.company;
import java.io.FileInputStream;
import java.io.*;
public class CopyBytes {
    public static void main(String[] args) throws IOException {
        try (FileInputStream in = new FileInputStream("aman.txt"); FileOutputStream out = new FileOutputStream("namdu.txt")) {
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);

            }

        }
    }

}
