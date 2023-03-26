package com.company.PepCoding.DynamicPrograming;

public class A2ClimbingStairs {
    public static void main(String[] args) {
        int n=24;
        System.out.println(ClimbingStair(n,new int[n+1]));
        System.out.println(usigTabulation(n));
    }
    public static int usigTabulation(int n){
        int[] dp=new int[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            if(i==1){
                dp[i]=dp[i-1];
            }
            else if(i==2){
                dp[i]=dp[i-1]+dp[i-2];
            }
            else{
                dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
            }
        }
        return dp[n];
    }
    public static int ClimbingStair(int n,int[] qb){
        if(n==0 || n==1){
            return 1;
        }
        else if(n<0){
            return 0;
        }
        if(qb[n]!=0){
            return qb[n];
        }
//        System.out.println("Hello"+n);
        int n1=ClimbingStair(n-1,qb);
        int n2=ClimbingStair(n-2,qb);
        int n3=ClimbingStair(n-3,qb);
        int stepn=n1+n2+n3;
        qb[n]=stepn;
        return stepn;
    }
}
