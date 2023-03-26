package com.company.PepCoding.Recursion;

public class A5Log {
    public static void main(String[] args) {
        System.out.println(pow(10,8));
    }
    public static int pow(int x,int n){
        if(n==0){
            return 1;
        }
        int fn2=pow(x,n/2);
        int out=fn2*fn2;
        if(n%2==1){
            out=out*x;
        }
        return out;
    }
}
