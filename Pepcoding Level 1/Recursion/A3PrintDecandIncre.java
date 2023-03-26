package com.company.PepCoding.Recursion;

public class A3PrintDecandIncre {
    public static void main(String[] args) {
        pdi(5);
    }
    public static void pdi(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        pdi(n-1);
        System.out.print(n+" ");
    }
}
