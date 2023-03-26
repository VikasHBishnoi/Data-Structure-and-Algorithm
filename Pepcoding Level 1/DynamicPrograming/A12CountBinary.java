package com.company.PepCoding.DynamicPrograming;

public class A12CountBinary {
    public static void main(String[] args) {
        System.out.println(countbinary(900));

        System.out.println(countbinaryoptmize(900));
    }
    public static int countbinaryoptmize(int n){
        int pr0=1;
        int pr1=1;
        for(int i=2;i<=n;i++){
            int cu0=pr1;
            int cu1=pr1+pr0;

            pr0=cu0;
            pr1=cu1;
        }
        return pr0+pr1;
    }
    public static int countbinary(int n){
        // doing with array
        int[][] arr=new int[2][n+1];
        arr[0][1]=1;
        arr[1][1]=1;
        for(int i=2;i<=n;i++){
            arr[0][i]=arr[1][i-1];
            arr[1][i]=arr[0][i-1]+arr[1][i-1];
        }

        return arr[0][n]+arr[1][n];
    }
}
