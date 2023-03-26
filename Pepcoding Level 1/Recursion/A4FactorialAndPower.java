package com.company.PepCoding.Recursion;

public class A4FactorialAndPower {
    public static void main(String[] args) {
        System.out.println(fact(10));
        System.out.println(power(17,3));
    }
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int out=x*power(x,n-1);
        return out;
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fa=fact(n-1)*n;
        return fa;
    }
}
