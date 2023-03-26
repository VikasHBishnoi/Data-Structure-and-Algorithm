package com.company.PepCoding.Array;

public class A2Memmory {
    public static void swap(int[] array,int i,int j){

        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
    public static void print(int[] array){
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr =new int[5];
        arr[0]=33;
        arr[1]=47;
        arr[2]=59;
        arr[3]=67;
        arr[4]=98;
        swap(arr,0,4);
        print(arr);
    }
}
