package com.company.PepCoding.Recursion;

import java.util.ArrayList;

public class A13GetSrairPath {
    public static void main(String[] args) {
        ArrayList<String> st=getStair(4);
        for(int i=0;i<st.size();i++){
            System.out.println(st.get(i));
        }
    }
    public static ArrayList<String>  getStair(int n){
        ArrayList<String> out=new ArrayList<>();
        if(n<0){
            return out;
        }
        if(n==0){
            out.add("");
            return out;
        }

        ArrayList<String> path1=getStair(n-1);
        ArrayList<String> path2=getStair(n-2);
        ArrayList<String> path3=getStair(n-3);
        for(int i=0;i<path1.size();i++){
            out.add("1"+path1.get(i));
        }
        for(int i=0;i<path2.size();i++){
            out.add("2"+path2.get(i));
        }
        for(int i=0;i<path3.size();i++){
            out.add("3"+path3.get(i));
        }

        return out;
    }
}
