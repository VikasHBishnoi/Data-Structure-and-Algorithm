package com.company.PepCoding.Recursion;

public class A22PrintPermutation {
    public static void main(String[] args) {
        printpermu("123456789","");
    }
    public static void printpermu(String str,String Ans){
        if(str.length()==0){
            System.out.println(Ans);
            return;
        }
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String leftsub=str.substring(0,i);
            String rigthsun=str.substring(i+1);
            String stri=leftsub+rigthsun;
            printpermu(stri,Ans+ch);
        }
    }
}
