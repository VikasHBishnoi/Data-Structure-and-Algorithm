package com.company.PepCoding.DynamicPrograming;
public class A5MinimumCost {
    public static void main(String[] args) {
        int n=7;
        int[][] orignal={
                {2,8,2,2,2,2,2,0},
                {6,1,9,5,3,8,2,0},
                {1,4,3,4,0,6,2,0},
                {6,4,7,2,4,6,2,3},
                {1,0,3,7,1,2,2,0},
                {1,5,3,2,3,0,3,0},
                {2,2,5,1,9,8,2,20}
        };
        System.out.println(cost(orignal));
    }
    public static int cost(int[][] orginal){
        int len=orginal.length;
        int wid=orginal[0].length;
        int[][] dp=new int[len][wid];
        dp[len-1][wid-1]=orginal[len-1][wid-1];
        for(int ro=len-1;ro>=0;ro--){
            for(int co=wid-1;co>=0;co--){
                if(ro==len-1 && co!=wid-1){
                    dp[ro][co]=dp[ro][co+1]+orginal[ro][co];
                }
                else if(co==wid-1 && ro!=len-1){
                    dp[ro][co]=dp[ro+1][co]+orginal[ro][co];
                }
                else if(co!=wid-1 && ro!=len-1){
                    dp[ro][co]=Math.min(dp[ro+1][co],dp[ro][co+1])+orginal[ro][co];
                }
            }
        }
        print2d(dp);
        return dp[0][0];
    }
    public static void print2d(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
