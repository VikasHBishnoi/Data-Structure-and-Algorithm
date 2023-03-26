package com.company.PepCoding.Start;
import java.lang.Math;

import java.util.Scanner;

public class A9DigitValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();

        int temp=n;
        int dig=0;
        while(n !=0){
            n=n/10;
            dig++;
        }
//        System.out.println(dig);



        int i=(int)Math.pow(10,dig-1);
//        System.out.println(i);
//        System.out.println(temp);
        while (i>0){
            int k=temp/i;
            System.out.println(k);
            temp=temp%i;
            i=i/10;
        }
    }
}
