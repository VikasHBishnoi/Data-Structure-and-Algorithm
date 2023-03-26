package com.company.PepCoding.Recursion;

public class A17PrintSub {
    public static void main(String[] args) {
        print("ABC","");;
    }
    public static void print(String str,String Ans){
        if(str.length()==0){
            System.out.println(Ans);
            return;
        }
        String op1=Ans+str.charAt(0);
        String op2=Ans+"-";
        print(str.substring(1),op1);
        print(str.substring(1),op2);

    }
}
