package com.company.PepCoding.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

public class A11Subsequence {
    public static void main(String[] args) {
        ArrayList<String > st=getsub("ABC");
        for(int i=0;i<st.size();i++){
            System.out.println(st.get(i));
        }
        int [] arr={3,5,6};
    }
    public static ArrayList<String> getsub(String str){
        ArrayList<String> out=new ArrayList<>();
        if(str.length()==0){
            out.add(" ");
            return out;
        }
        String le=str.substring(1);
        out=getsub(le);
        int len=out.size();
        for(int i=0;i<len;i++){
            String temp=str.charAt(0)+out.get(i);
            out.add(temp);
        }
        return out;
    }
}
