package com.company.PepCoding.Recursion;

public class A25TargetSubset {
    public static void main(String[] args) {
//        System.out.println(toString(234));
        int[] arr={10,20,30,40,50,60};
        tragetSum(60,arr,"{",0,0);
    }
    public static void tragetSum(int target,int[] arr,String subset ,int ind,int sum){
        if(ind==arr.length){
            if(target==sum){
                System.out.println(subset+"} ");
            }
            return;
        }
//        String in=toString(arr[ind]);
        tragetSum(target,arr,subset,ind+1,sum);
        sum=sum+arr[ind];
        tragetSum(target,arr,subset+arr[ind]+"  ",ind+1,sum);
    }
//    public static String toString(int n){
//        String out="";
//        while (n>0){
//            int rem=n%10;
//            out=rem+out;
//            n=n/10;
//        }
//        return out;
//    }
}
