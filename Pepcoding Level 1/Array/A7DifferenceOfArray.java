package com.company.PepCoding.Array;

import java.util.Scanner;

public class A7DifferenceOfArray {
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

    public static void Difference(int n2,int[] arr2,int n1, int[] arr1){
        // arr2-arr1
        int i=n2-1;
        int j=n1-1;
        int borrow=0;
        int dif=0;
        int[] finalarray=new int[n2];
        for (int k=n2-1;k>=0;k--){
            //System.out.println("The loop is "+k);
            if (borrow !=0){
                arr2[i]=arr2[i]-borrow;
            }
            else {
                arr2[i]=arr2[i];
            }
            if (j>=0){
                if (arr2[i]<arr1[j]){
                    borrow=1;
                    arr2[i]=arr2[i]+10;
                }
                else {
                    borrow=0;
                }
                dif=arr2[i]-arr1[j];
            }
            else {
                if (arr2[i]<0){
                    borrow=1;
                    arr2[i]=arr2[i]+10;
                }
                else {
                    borrow=0;
                }
                dif=arr2[i];
            }
           // System.out.println(dif+" "+k);
            finalarray[k]=dif;
            i--;
            j--;
        }

        print(finalarray);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Size of array 1");
        int n1=sc.nextInt();
        int[] arr1=inputarray(n1);
        System.out.println("Great now 2nd start");
        int n2=sc.nextInt();
        int[] arr2=inputarray(n2);
        //n2-n1;
        // by above max would always n2

        Difference(n2,arr2,n1,arr1);

    }
}
