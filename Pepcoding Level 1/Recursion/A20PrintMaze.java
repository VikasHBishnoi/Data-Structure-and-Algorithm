package com.company.PepCoding.Recursion;

public class A20PrintMaze {
    public static void main(String[] args) {
        printmaze(1,1,2,8,"");
    }
    public static void printmaze(int r, int c , int n, int m, String path){
        if(r==n && c==m){
            System.out.println(path);
        }
        if(r>n || c>m){
            return;
        }
        printmaze(r,c+1,n,m,path+" 1H ");
        printmaze(r+1,c,n,m,path+" 1V ");

    }
}
