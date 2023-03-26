package com.company.PepCoding.Array;

public class A15CielAndFloor {
    public static void main(String[] args) {
        int[] arr={1,2,4};
        int[] out=candf(arr,6);
        System.out.println(out[0]+" "+out[1]);
    }
    public static int[] candf(int[] m,int data){
        int[] out=new int[2];
        int floor=Integer.MIN_VALUE;
        int ciel=Integer.MAX_VALUE;
        int lo=0;
        int hi=m.length-1;
        while (lo<=hi){
            int mid=(lo+hi)/2;
            if(m[mid]>data){
                ciel=m[mid];
                hi=mid-1;
            }
            else if(m[mid]<data){
                floor=m[mid];
                lo=mid+1;
            }
            else{
                floor=m[mid];
                ciel=m[mid];
                break;
            }
        }
        out[0]=floor;
        out[1]=ciel;
        return  out;
    }
}
