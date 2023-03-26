package com.company.PepCoding.DynamicPrograming;

public class A19Tilling {
    public static void main(String[] args) {
        System.out.println(dominotile(10));
        System.out.println(tile_M_N(8,4));
    }
    public static int tile_M_N(int n,int m){
        int[] dp=new int[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
            if(i-m>=0){
                dp[i]+=dp[i-m];
            }
        }
        return dp[n];
    }
    public static int dominotile(int n){
        if(n==1 || n==2){
            return n;
        }
        int[] dp=new int[n+1];
        dp[1]=1;
        dp[2]=2;

        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }

        return dp[n];
    }
}