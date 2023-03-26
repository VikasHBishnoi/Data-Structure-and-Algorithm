package com.company.PepCoding.DynamicPrograming;

public class A15CountSubSequence {
    public static void main(String[] args) {
        System.out.println(countsub("abcabc"));
    }
    public static int countsub(String str){
        int a=0;
        int ab=0;
        int abc=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'){
                a=(a*2)+1;
            }
            else if(ch=='b'){
                ab=(ab*2)+a;
            }
            else if(ch=='c'){
                abc=2*(abc)+ab;
            }
        }
        return abc;
    }
}
