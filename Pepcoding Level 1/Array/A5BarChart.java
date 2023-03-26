package com.company.PepCoding.Array;

import java.util.Scanner;

public class A5BarChart {
    public static int[] inputarray(int n){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static int max(int[] array){
        int max=array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]>max){
                max=array[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Size of array");
        int n=sc.nextInt();
        int[] arr=inputarray(n);
        int max=max(arr);

        for (int floor=max;floor>=1;floor--){
            for (int k=0;k<arr.length;k++){
                if (arr[k]<floor){
                    System.out.print("\t");
                }
                else {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }
}
