package com.company.PepCoding.Recursion;

public class A6PrintZigZag {
    public static void main(String[] args) {
        pzz(3);
    }
    public static void pzz(int n){
        if(n==0){
            return;
        }
        System.out.println("pre  "+n);
        pzz(n-1);
        System.out.println("In   "+n);
        pzz(n-1);
        System.out.println("Post "+n);
    }
}
