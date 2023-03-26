package com.company.PepCoding.DynamicPrograming;

public class A7TargetSubset {
    public static void main(String[] args) {
        int[] arr={3,70,4,1,7};
        int target=10;
        System.out.println(target_subset(arr,target));
    }
    public static void print2d(boolean[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++) {
                if (arr[i][j] == true) {
                    System.out.print(" T ");
                }
                else{
                    System.out.print(" F ");
                }
            }
            System.out.println();
        }
    }
    public static boolean target_subset(int[] arr,int target){
        int arrlen=arr.length;
        boolean[][] dp=new boolean[arrlen+1][target+1];
        dp[0][0]=true;
        for(int i=1;i<=arrlen;i++){
            int el=arr[i-1];
            for(int j=0;j<=target&&j<el;j++){
                dp[i][j]=dp[i-1][j];
            }
            for(int j=el;j<=target;j++){
                if(dp[i-1][j]==true || dp[i-1][j-el]==true){
                    dp[i][j]=true;
                }
            }
        }
        print2d(dp);

        return dp[arrlen][target];
    }
}
