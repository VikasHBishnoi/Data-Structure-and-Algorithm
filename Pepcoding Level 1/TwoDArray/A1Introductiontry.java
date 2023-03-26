package com.company.PepCoding.TwoDArray;

import java.util.Scanner;

public class A1Introductiontry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Give n and m");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println("Give Data");
                arr[i][j]=sc.nextInt();
            }
        }
        print(arr);
    }
    public static void print(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
