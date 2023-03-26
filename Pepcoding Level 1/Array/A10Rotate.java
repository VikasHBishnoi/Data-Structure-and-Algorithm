package com.company.PepCoding.Array;

public class A10Rotate {
    public static void main(String[] args) {
        int[] arr={3,7,8,0,24,5,57};
        rotate(arr,-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void rotate(int[] arr,int k){
        k=((k%arr.length)+arr.length)%arr.length;
        reverse(arr,0,arr.length-k-1);
        reverse(arr,arr.length-k,arr.length-1);
        reverse(arr,0,arr.length-1);
    }
    public static void reverse(int[] arr,int i,int j){
        while (i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
