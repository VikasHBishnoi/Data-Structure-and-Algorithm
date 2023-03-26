package com.company.PepCoding.Recursion;

public class A9MaxinArray {
    public static void main(String[] args) {
        int[] arr={3,5,6,7,444,56,7,8};
        System.out.println(max(arr,0));
    }
    public static int max(int[] arr,int ind){
        if(ind>=arr.length){
            return Integer.MIN_VALUE;
        }
        int maxe=max(arr,ind+1);
        if(arr[ind]>maxe){
            maxe=arr[ind];
        }
        return maxe;
    }
}
