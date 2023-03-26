package com.company.PepCoding.Recursion;

public class A19PrintStairPaths {
    public static void main(String[] args) {
        printstair(4,"");
    }
    public static  void printstair(int n,String path){
        if(n==0){
            System.out.println(path);
        }
        if(n<0){
            return;
        }
        printstair(n-1,path+"1");
        printstair(n-2,path+"2");
        printstair(n-3,path+"3");
    }
}
