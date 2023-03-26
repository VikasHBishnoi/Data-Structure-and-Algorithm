package com.company.PepCoding.Recursion;

public class A18printkeypad {
    public static void main(String[] args) {
        printkey("678","");
    }
    static String  code[]={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printkey(String str,String Ans){
        if(str.length()==0){
            System.out.println(Ans);
            return;
        }
        String sub=str.substring(1);
        int el=str.charAt(0)-'0';
        String chose=code[el];
        for(int i=0;i<chose.length();i++){
            String inAns=Ans+chose.charAt(i);
            printkey(sub,inAns);
        }
    }
}
