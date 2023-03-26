package com.company.PepCoding.Recursion;

import java.util.ArrayList;

public class A12GetKepad {
    public static void main(String[] args) {
        ArrayList<String> st=getkpc("3455");
        System.out.println(st.size());
        for(int i=0;i<st.size();i++){
          //  System.out.println(st.get(i));
        }
    }
    static String  code[]={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getkpc(String str){
        ArrayList<String> out=new ArrayList<>();
        if(str.length()==0){
            out.add("");
            return out;
        }
        char ch= str.charAt(0);
        str=str.substring(1);
        ArrayList<String> re=getkpc(str);
        int el=ch-'0';
        String temp=code[el];
        for(int i=0;i<temp.length();i++){
            char t=temp.charAt(i);
            for(int j=0;j< re.size();j++){
                String tz=t+re.get(j);
                out.add(tz);
            }
        }
        return out;
    }
}
