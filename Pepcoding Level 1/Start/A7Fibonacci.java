package com.company.PepCoding.Start;

import java.util.Scanner;

public class A7Fibonacci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. which u want to till fibonaci");
        int n =sc.nextInt();

        System.out.println("fb no is "+a+" and is position is 1");
        System.out.println("fb no is "+b+" and is position is 2");
        for(int i=3;i<=n;i++){
            int c=a+b;
            System.out.println("fb no is "+c+" and is position is "+ i);
            a=b;
            b=c;
        }
    }
}
