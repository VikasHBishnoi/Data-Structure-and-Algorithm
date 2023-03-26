package com.company.PepCoding.DynamicPrograming;

public class A20FriendsPair {
    public static void main(String[] args) {
        System.out.println(cointpairsingle(10));
        System.out.println(cointpairsingle(4));
    }
    public static int cointpairsingle(int n){
        int[] dp=new int[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
            if(i-2>=0){
                dp[i]+=(dp[i-2])*(i-1);
            }
        }
        return dp[n];
    }
}
