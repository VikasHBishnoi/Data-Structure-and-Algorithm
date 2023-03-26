package com.company.PepCoding.DynamicPrograming;

public class A21Parition {
    public static void main(String[] args) {
        System.out.println(partion_into_subset(5,3));
    }
    public static int partion_into_subset(int n,int k){
        int[][] dp=new int[k+1][n+1];
        for(int t=1;t<=k;t++){
            for(int p=1;p<=n;p++){
                if(t==1){
                    dp[t][p]=1;
                }
                else if(t==p){
                    dp[t][p]=1;
                }
                else if(p>=t){
                    dp[t][p]=((t*(dp[t][p-1]))+dp[t-1][p-1]);
                }
                System.out.print(dp[t][p]+" ");
            }
            System.out.println();
        }
        return dp[k][n];
    }
}
