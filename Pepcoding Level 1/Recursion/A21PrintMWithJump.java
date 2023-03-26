package com.company.PepCoding.Recursion;

public class A21PrintMWithJump {
    static int count=0;
    public static void main(String[] args) {
        printWithJump(1,1,8,8,"");
        System.out.println(count);
    }
    public static void printWithJump(int r,int c,int n,int m,String path){
        if(r==n && c==m){
            System.out.println(path);
            count++;
        }
        for(int i=1;i<=m-c;i++){
            printWithJump(r,c+i,n,m,path+i+"H");
        }
        for(int i=1;i<=n-r;i++){
            printWithJump(r+i,c,n,m,path+i+"V");
        }
        for(int i=1;i<=n-r && i<=m-c;i++){
            printWithJump(r+i,c+i,n,m,path+i+"D");
        }


    }
}
