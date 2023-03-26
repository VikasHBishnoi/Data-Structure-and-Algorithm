package com.company.PepCoding.DynamicPrograming;

import static com.company.PepCoding.TwoDArray.A1Introductiontry.print;

public class A10Knapsack01 {
    public static void main(String[] args) {
        int cap=7;
        int[][] weig={{2,15},{5,14},{1,10},{3,45},{4,30}};
        System.out.println(knapsack(weig,cap));
    }
    public static int knapsack(int[][] weightval,int capacity){
        int n=weightval.length;
        int[][] dp=new int[n+1][capacity+1];
        dp[0][0]=0;
        for(int i=1;i<=n;i++){
            int weight=weightval[i-1][0];
            int val=weightval[i-1][1];
            for(int j=1;j<=capacity;j++){
                if(j<weight){
                    dp[i][j]=dp[i-1][j];
                }
                else{
                    int las=dp[i-1][j-weight]+val;
                    dp[i][j]=Math.max(las,dp[i-1][j]);
                }
            }
        }
        print(dp);
        return dp[n][capacity];
    }
}
