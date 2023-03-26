package com.company.PepCoding.Array;

import java.util.Scanner;

public class A6SumOfArray {
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
            System.out.println(array[i]+" ");
        }
    }

    public static void sum(int arr1[],int arr2[],int maxsize,int n1,int n2){
        int[] finalarray=new int[maxsize];
        int carry=0;
        int sum;
        int i=1;
        int j=1;
        for (int k=maxsize-1;k>=0;k--){
            if (n1-i<0){
                sum=arr2[n2-j]+carry;
            }
            else if(n2-j<0){
                sum=arr1[n1-i]+carry;
            }
            else {
                sum=arr1[n1-i]+arr2[n2-j]+carry;
            }
            i++;
            j++;
            finalarray[k]=sum%10;
            carry=sum/10;
        }
        if (carry !=0){
            System.out.println(carry+" ");
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
        int max=n1;
        if (n1<n2){
            max=n2;
        }

        sum(arr1,arr2,max,n1,n2);


    }
}
