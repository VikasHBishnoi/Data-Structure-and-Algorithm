package com.company.PepCoding.Array;

public class A14BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println(Binarysearch(arr,1));
    }
    public static int Binarysearch(int[]  m,int val){
        int ind=-1;
        int lo=0;
        int hi=m.length-1;
        while (lo<=hi){
            int mid=(lo+hi)/2;
            if(m[mid]==val){
                ind=mid;
                return mid;
            }
            else if(m[mid]>val){
                hi=mid-1;
            }
            else if(m[mid]<val){
                lo=mid+1;
            }
        }


        return ind;
    }
}
