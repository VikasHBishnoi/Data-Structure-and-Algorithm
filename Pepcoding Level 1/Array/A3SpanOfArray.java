package com.company.PepCoding.Array;

import java.util.Scanner;

public class A3SpanOfArray {
    public static int[] inputarray(int n){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static void print(int[] array){
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static int rangeofarray(int[] array){
        int max=array[0];
        int min=array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]>max){
                max=array[i];
            }
            if (array[i]<min){
                min=array[i];
            }
        }
        int diff=max-min;
        return diff;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Size of array");
        int n=sc.nextInt();
        int[] arr=inputarray(n);
        System.out.println("ok");
        print(arr);
        int dif=rangeofarray(arr);
        System.out.println();
        System.out.println(dif);
        System.out.println();
        print(arr);



    }
}
