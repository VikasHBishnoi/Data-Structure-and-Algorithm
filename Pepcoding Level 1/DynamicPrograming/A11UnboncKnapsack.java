package com.company.PepCoding.DynamicPrograming;
public class A11UnboncKnapsack {
    public static void main(String[] args) {
        int cap=7;
        int[][] weig={{2,15},{5,14},{1,10},{3,45},{4,30}};
        System.out.println(unbondknapbyme(weig,cap));
        System.out.println("Hello");
        System.out.println(unbondbypep(weig,cap));
    }
    public static int unbondbypep(int[][] weight,int cap){
        int n=weight.length;
        int[] dp=new int[cap+1];
        for(int i=0;i<=cap;i++){
            int max=0;
            for(int j=0;j<n;j++){
                int weg=weight[j][0];
                int val=weight[j][1];
                if(weg<=i){
                    int te=dp[i-weg]+val;
                    max=Math.max(max,te);
                }
            }
            dp[i]=max;
            System.out.print(dp[i] +" ");
        }
        System.out.println();
        return dp[cap];
    }
    public static int unbondknapbyme(int[][] weight,int cap){
        // same no problem itj just i don as compination and sir done as permutaion but same answer
        int n=weight.length;
        int[] dp=new int[cap+1];
        for(int i=0;i<n;i++){
            int we=weight[i][0];
            int val=weight[i][1];
            for(int j=0;j<=cap;j++){
                if(j>=we){
                    int cal=val+dp[j-we];
                    dp[j]=Math.max(cal,dp[j]);
                }
                System.out.print(dp[j]+"  ");;
            }
            System.out.println();

        }

        return dp[cap];
    }
}
