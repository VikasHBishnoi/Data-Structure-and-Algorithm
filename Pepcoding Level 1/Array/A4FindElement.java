package com.company.PepCoding.Array;

public class A4FindElement {
    public static int elementPosition(int[] arr,int tofind){
        int temp=-1;
        // her we are finding first position
        for (int i=0;i<arr.length;i++){
            if (tofind==arr[i]){
                temp=i;
                // by this break when we get first match this
                // loops ends
                break;
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        //int[] arr=new int[5];
        int[] arr={2,3,3,3,5};
        int tosearch=6;
        int index=elementPosition(arr,tosearch);
        System.out.println(index);

    }
}
