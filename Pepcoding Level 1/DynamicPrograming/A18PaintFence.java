package com.company.PepCoding.DynamicPrograming;

public class A18PaintFence {
    public static void main(String[] args) {
        System.out.println(countWays(6,3));
    }
    public static long countWays(int N,int k){
        long same=0;
        long diff=k;
        long total=k;
        for(int i=2;i<=N;i++){
            long cursam=diff;
            long curdif=total*(k-1);
            long currtotal=cursam+curdif;

            same=cursam;
            diff=curdif;
            total=(currtotal)%1000000007;
        }
        return total;
    }
}
