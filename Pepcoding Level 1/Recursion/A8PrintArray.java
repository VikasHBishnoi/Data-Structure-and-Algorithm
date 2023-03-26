package com.company.PepCoding.Recursion;

public class A8PrintArray {
    public static void main(String[] args) {
        int[] arr={3,5,7,8,5,7,8,9,6,5};
        printrevers(arr,0);
    }
    public static void print(int[] arr,int ind){
        if(ind>arr.length-1){
            return;
        }
        System.out.println(arr[ind]);
        print(arr,ind+1);
    }
    public static void printrevers(int[] arr,int ind){
        if(ind>arr.length-1){
            return;
        }
        printrevers(arr,ind+1);
        System.out.println(arr[ind]);
    }
}
