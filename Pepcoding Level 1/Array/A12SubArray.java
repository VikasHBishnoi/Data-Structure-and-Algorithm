package com.company.PepCoding.Array;

public class A12SubArray {
    public static void main(String[] args) {
        int[] arr={2,4,5,7,8,9};
        printSubarray(arr);
    }
    public static void printSubarray(int[] arr){
        for(int i=0;i<arr.length;i++){
            String str="";
            for(int j=i;j<arr.length;j++){
                str=str+arr[j]+" ";
                System.out.println(str);
            }
            System.out.println();
        }
    }
}
