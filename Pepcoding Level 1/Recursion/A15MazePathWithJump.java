package com.company.PepCoding.Recursion;

import java.util.ArrayList;

public class A15MazePathWithJump {
    public static void main(String[] args) {
        ArrayList<String> out=mazewithjump(0,0,3,3);
        // this code when only 1,2,3 moves are terer
        for(int i=0;i<out.size();i++){
            System.out.println(out.get(i));
        }
    }
    public static ArrayList<String> mazewithjump(int i, int j, int n, int m){
        ArrayList<String> out=new ArrayList<>();
        if(i>=n||j>=m){
            return out;
        }
        if(i==n-1&&j==m-1){
            out.add("");
            return out;
        }

        ArrayList<String> h3=mazewithjump(i,j+3,n,m);
        out=addString(out,h3,"h3");
        ArrayList<String> h2=mazewithjump(i,j+2,n,m);
        out=addString(out,h2,"h2");
        ArrayList<String> h1=mazewithjump(i,j+1,n,m);
        out=addString(out,h1,"h1");
        ArrayList<String> v3=mazewithjump(i+3,j,n,m);
        out=addString(out,v3,"v3");
        ArrayList<String> v2=mazewithjump(i+2,j,n,m);
        out=addString(out,v2,"v2");
        ArrayList<String> v1=mazewithjump(i+1,j,n,m);
        out=addString(out,v1,"v1");
        ArrayList<String> d3=mazewithjump(i+3,j+3,n,m);
        out=addString(out,d3,"d3");
        ArrayList<String> d2=mazewithjump(i+2,j+2,n,m);
        out=addString(out,d2,"d2");
        ArrayList<String> d1=mazewithjump(i+1,j+1,n,m);
        out=addString(out,d1,"d1");
        return out;
    }
    public static ArrayList<String> addString(ArrayList<String> out,ArrayList<String> till,String str){
        for(int i=0;i<till.size();i++){
            out.add(str+till.get(i));
        }
        return out;
    }
}
