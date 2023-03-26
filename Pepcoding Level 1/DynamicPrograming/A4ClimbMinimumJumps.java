package com.company.PepCoding.DynamicPrograming;

public class A4ClimbMinimumJumps {
    public static void main(String[] args) {
        int n=10;
        int[] arr={1,0,1,4,2,3,1,1,1,1};
        System.out.println(climbminimum(arr,n));
        System.out.println(pepAprroach(arr,n));
    }
    public static int pepAprroach(int[] arr,int n){
        Integer[] dp=new Integer[n+1];
        dp[n]=0;
        for(int i=n-1;i>=0;i--){
            int dis=arr[i];
            if(dis>0){
                int min=Integer.MAX_VALUE;
                for(int j=1;j<=dis && i+j<=n;j++) {
                    if(dp[i+j]!=null){
                        min = Math.min(min, dp[i + j]);
                    }
                }
                if(min!=Integer.MAX_VALUE){
                    dp[i]=min+1;
                }
                else{
                    dp[i]=null;
                }
            }
        }
        return dp[0];
    }
    public static int climbminimum(int[] arr,int n){
        int[] dp=new int[n+1];
        dp[n]=0;
        for(int i=n-1;i>=0;i--){
            int dis=arr[i];
            int min=Integer.MAX_VALUE-1;
            for(int j=1;j<=dis && i+j<=n;j++){
                min=Math.min(min,dp[i+j]);
            }
            dp[i]=min+1;
        }
        return dp[0];
    }
}
