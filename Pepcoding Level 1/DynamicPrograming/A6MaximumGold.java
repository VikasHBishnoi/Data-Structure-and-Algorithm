package com.company.PepCoding.DynamicPrograming;

public class A6MaximumGold {
    public static void main(String[] args) {
        int n=7;
        int[][] orignal={
                {0,1,4,2,8,2},
                {4,3,6,5,0,4},
                {1,2,4,1,4,6},
                {2,0,7,3,2,2},
                {3,1,5,9,2,4},
                {2,7,0,8,5,1}
        };
        System.out.println(goldmine(orignal));
    }
    public static void print2d(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int goldmine(int[][] goldgrid){
        int len=goldgrid.length;
        int wid=goldgrid[0].length;
        int[][] dp=new int[len][wid];
        int max=Integer.MIN_VALUE;
        for(int col=wid-1;col>=0;col--){
            for(int row=0;row<len;row++){
                if(col==wid-1){
                    dp[row][col]=goldgrid[row][col];
                }
                else if(row==0){
                    dp[row][col]=goldgrid[row][col]+Math.max(dp[row][col+1],dp[row+1][col+1]);
                }
                else if(row==len-1){
                    dp[row][col]=goldgrid[row][col]+Math.max(dp[row][col+1],dp[row-1][col+1]);
                }
                else{
                    int ul=Math.max(dp[row-1][col+1],dp[row+1][col+1]);
                    dp[row][col]=goldgrid[row][col]+Math.max(ul,dp[row][col+1]);
                }

                if(col==0){
                    max=Math.max(max,dp[row][col]);
                }
            }
        }
        print2d(dp);
        return max;
    }

}
