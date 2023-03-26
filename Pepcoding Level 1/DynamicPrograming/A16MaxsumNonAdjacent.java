package com.company.PepCoding.DynamicPrograming;

import com.company.PepCoding.BinaryTree.A2SizeMaxSumHeigth;

public class A16MaxsumNonAdjacent {
    public static void main(String[] args) {
        int[] arr={5,10,10,100,5,6,101,90,1};
        System.out.println(max(arr));
    }
    public static int max(int[] arr){

        int inc=0;
        int excl=0;
        for(int i=0;i<arr.length;i++){
            int cuinc=excl+arr[i];
            int cuexc=Math.max(inc,excl);

            inc=cuinc;
            excl=cuexc;
        }
        return Math.max(inc,excl);
    }
}
