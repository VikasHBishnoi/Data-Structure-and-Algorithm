package com.company.PepCoding.DynamicPrograming;

import static com.company.PepCoding.Array.A2Memmory.print;

public class A9CoinChangePermutation {
    public static void main(String[] args) {
        int[] coin={2,3,5,6};
        System.out.println( cointpermut(coin,10));
    }
    public static int cointpermut(int[] coin,int target){
        int[] dp=new int[target+1];
        boolean fl=true;
        dp[0]=1;
        for(int i=0;i<dp.length;i++) {
            for (int j = 0; j < coin.length; j++) {
                int el = coin[j];
                if (el <= i) {
                    dp[i] += dp[i - el];
                }
            }
            System.out.println(dp[i]+" "+i);
        }
        System.out.println();
        return dp[target];
    }
}

