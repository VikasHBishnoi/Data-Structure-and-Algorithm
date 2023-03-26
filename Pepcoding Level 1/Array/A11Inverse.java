package com.company.PepCoding.Array;

public class A11Inverse {
    public static void main(String[] args) {
        int[] arr={3,4,1,5,7,6,2,0};
        arr=invere(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] invere(int[] arr){
        int[] out=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int el=arr[i];
            out[el]=i;
        }
        return out;
    }
}
