package com.company.PepCoding.Recursion;

import java.util.ArrayList;

public class A14GetMazePaths {
    public static void main(String[] args) {
        ArrayList<String> pa=path(0,0,5,9);
        System.out.println(pa.size()+" "+pa.get(0).length());
        for(int i=0;i<pa.size();i++){
            System.out.println(pa.get(i));
        }
    }
    public static ArrayList<String> path(int i,int j,int n,int m){
        ArrayList<String> out=new ArrayList<>();
        if(i==n-1&&j==m-1){
            out.add("");
            return out;
        }
        if(j>=m){
            return out;
        }
        if(i>=n){
            return out;
        }
        ArrayList<String> ri=path(i,j+1,n,m);
        ArrayList<String> dow=path(i+1,j,n,m);
        for(int l=0;l<ri.size();l++){
            out.add("R"+ri.get(l));
        }
        for(int l=0;l<dow.size();l++){
            out.add("D"+dow.get(l));
        }


        return out;
    }
}
