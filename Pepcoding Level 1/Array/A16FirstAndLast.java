package com.company.PepCoding.Array;

public class A16FirstAndLast {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,4,5,5,5,5,5,5,7,8,9,10};
        int las=lastind(arr,5);
        int fi=firstind(arr,5);
        System.out.println(fi+"  "+las);
    }
    public static int firstind(int[] arr,int data){
        int lo=0;
        int hi=arr.length-1;
        int po=-1;
        while (lo<=hi){
            int mid=(lo+hi)/2;
            if(data<arr[mid]){
                hi=mid-1;
            }
            else if(data>arr[mid]){
                lo=mid+1;
            }
            else{
                po=mid;
                hi=mid-1;
            }
        }
        return po;
    }
    public static int lastind(int[] arr,int data){
        int lo=0;
        int hi=arr.length-1;
        int po=-1;
        while (lo<=hi){
            int mid=(lo+hi)/2;
            if(data<arr[mid]){
                hi=mid-1;
            }
            else if(data>arr[mid]){
                lo=mid+1;
            }
            else{
                po=mid;
                lo=mid+1;
            }
        }
        return po;
    }
}
