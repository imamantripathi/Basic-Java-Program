// package com.company;

import java.util.Scanner;

public class Prime_Adam {

    int rev = 0;int sq = 0;int M,N;int temp;int per;int c=0;//int [] arr;

    public boolean prime(int x, int a) {
        if (x == a)
            return true;
        else if (x % a == 0)
            return false;
        else {
            a++;

            prime(x, a);
            return true;
        }
    }

   public  int reverse(int n) {
        while (n > 0) {
            int d = n % 10;
            rev = rev * 10 + d;
            n /= 10;
        }
        return rev;
    }
    int squ(int x)
    {
        sq = (int) Math.pow(x,2);
        return sq;

    }
    void input ()
    {
        Scanner sc = new Scanner (System.in) ;
        System.out.print("enter the number{M,N} for check in program");
        M  = sc.nextInt();
        N = sc.nextInt();
//arr = new int[N];
    }
    void calc ()
    {
        if(M>N)
        {
            System.out.println(" invalid input, try again ! ");
        }
        else
        {
            while(M<N)
            {
                if(prime(M ,2))
                {
                    temp = squ(M);
                    if(prime( reverse(M),2))
                    {
                        per = squ(reverse(M));
                        per=reverse(per);
                        if(temp==per)
                        {c++;
                            System.out.println("THE PRIME - ADAM INTEGER ARE: "+M);
                        }


                    }



                }

                M++;
            }
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        Prime_Adam obj = new Prime_Adam();
        obj.input();
        obj.calc();
    }
    }
