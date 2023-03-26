package com.company.PepCoding.Recursion;

public class A10Occurence {
    static int count=0;
    public static void main(String[] args) {
        int[] arr={2,4,6,8,76,9,55,5,6,9,34,5,7,8,9,7,9};
        System.out.println(firstOcc(arr,9,0));
        System.out.println(lastOcc(arr,9,0));
        int[] out=allocc(arr,9,0);
        for(int i=0;i<out.length;i++){
            System.out.print(out[i]+"  d ");
        }
    }
    public static int firstOcc(int[] arr,int data,int ind){
        if(ind>=arr.length){
            return -1;
        }
        if(data==arr[ind]){
            return ind;
        }
        return firstOcc(arr,data,ind+1);
    }
    public static int lastOcc(int[] arr,int data,int ind){
        if(ind>=arr.length){
            return -1;
        }
        int ou=lastOcc(arr,data,ind+1);
        if(ou==-1){
            if(arr[ind]==data){
                return ind;
            }
            return -1;
        }
        else{
            return ou;
        }
    }
    public static int[] allocc(int[] arr,int data,int ind){
        if(ind>=arr.length){
            return new int[count];
        }
        if(arr[ind]==data){
            count++;
        }
        int[] output=allocc(arr,data,ind+1);
        if(arr[ind]==data){
            output[count-1]=ind;
            count--;
        }

        return output;
    }
}
