package com.company.PepCoding.Recursion;

public class A1PrintDecreasing {
    public static void main(String[] args) {
        System.out.println("Ram Ram Sa");
        dec(10);
    }
    public static void dec(int n){
        System.out.println(n);
        if(n==1){
            return;
        }
        dec(n-1);

    }
}
