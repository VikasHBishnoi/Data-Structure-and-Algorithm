package com.company.PepCoding.Recursion;

public class A2PrintIncreasing {
    public static void main(String[] args) {
        System.out.println("Ram Ram Sa");
        increase(10);
    }
    public static void increase(int n){
        if(n==0){
            return;
        }
        increase(n-1);

        System.out.println(n);
    }
}
