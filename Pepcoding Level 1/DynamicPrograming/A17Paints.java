package com.company.PepCoding.DynamicPrograming;

public class A17Paints {
    public static void main(String[] args) {
        int[][] cost={{1,5,7,2,2,4},{5,8,4,3,6,1},{3,2,9,7,2,3},{1,2,4,9,1,7}};
        System.out.println(paintwiththreecolor(cost));
        System.out.println(paintwithmultiplecolor(cost));
    }
    public static long paintwithmultiplecolor(int[][] cost){
        long[] dp=new long[cost[0].length];
        for(int i=0;i<cost.length;i++){
            long[] tempdp=new long[cost[0].length];
            long[] least=minfun(dp);
            for(int j=0;j<cost[0].length;j++){
                if(dp[j]!=least[0]) {
                    tempdp[j]=cost[i][j]+least[0];
                }
                else{
                    tempdp[j]=cost[i][j]+least[1];
                }
            }
            dp=tempdp;
        }

        return minfun(dp)[0];
    }
    public static long[] minfun(long[] dp){
        long least=Long.MAX_VALUE;
        long second=Long.MAX_VALUE;

        for(int i=0;i<dp.length;i++){
            long com=dp[i];
            if(com<=least){
                second=least;
                least=com;
            }
            else if(com<=second){
                second=com;
            }
        }
        long[] out= {least,second};
        return out;
    }
    public static long paintwiththreecolor(int[][] cost){
        long r=0;
        long b=0;
        long g=0;
        for(int i=0;i<cost.length;i++){
            long cur=cost[i][0]+Math.min(b,g);
            long cub=cost[i][1]+Math.min(r,g);
            long cug=cost[i][2]+Math.min(r,b);

            r=cur;
            b=cub;
            g=cug;
            System.out.println(i+"i "+r+" "+b+" "+g);
        }
        return Math.min(r,Math.min(g,b));
    }
}
