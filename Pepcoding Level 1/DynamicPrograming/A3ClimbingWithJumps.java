package com.company.PepCoding.DynamicPrograming;

public class A3ClimbingWithJumps {
    public static void main(String[] args) {
        int n=6;
        int[] arr={10,10,10,12,12,13};
        System.out.println(climbingjump(arr,6));
    }
    public static int climbingjump(int[] arr,int n){
        int[] dp=new int[n+1];
        dp[n]=1;
        for(int i=n-1;i>=0;i--){
            int dis=arr[i];
            for(int j=1;j<=dis && i+j<=n;j++){
                dp[i]+=dp[i+j];
            }
            System.out.println(dp[i]+" "+i);
        }
        return dp[0];
    }
}
