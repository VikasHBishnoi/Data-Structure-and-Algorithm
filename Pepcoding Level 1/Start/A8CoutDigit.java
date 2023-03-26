package com.company.PepCoding.Start;

import java.util.Scanner;

public class A8CoutDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int dig=0;
        while(n !=0){
            n=n/10;
            dig++;
        }
        System.out.println(dig);
    }
}
