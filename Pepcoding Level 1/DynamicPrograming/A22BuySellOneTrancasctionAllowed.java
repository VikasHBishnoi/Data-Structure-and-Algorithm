package com.company.PepCoding.DynamicPrograming;

import com.company.PepCoding.BinaryTree.A2SizeMaxSumHeigth;

import java.util.Scanner;

public class A22BuySellOneTrancasctionAllowed {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.nextLine();
        int[] price={4,6,8,3,4,6,1,5,7,8,1,5};
       /// System.out.println(maximumprofwithonlyonetransaction(price,11));
       // System.out.println(maximumprofitManyTransaction(price));
        System.out.println(maximumWithFee(price,4));
    }
    public static int Transaction_k(int k, int[] prices) {
        int totaldays=prices.length;
        int[][] dp=new int[k+1][totaldays];
        for(int tr=0;tr<=k;tr++){
            for(int day=0;day<totaldays;day++){
                if(tr==0 || day==0){
                    dp[tr][day]=0;
                }
                else{
                    int max=Integer.MIN_VALUE;
                    max=Math.max(dp[tr][day-1],max);
                    for(int da=0;da<day;da++){
                        int cupro=prices[day]-prices[da];
                        int protemp=dp[tr-1][da]+cupro;
                        max=Math.max(max,protemp);
                    }
                    dp[tr][day]=max;
                }
            }
        }
        return dp[k][totaldays-1];
    }
    public int maxprofitCooldown(int[] price) {
        int boug=-price[0];
        int sel=0;
        int cool=0;
        for(int i=1;i<price.length;i++){
            int cubou=Math.max(boug,cool-price[i]);
            int cusel=Math.max(sel,price[i]+boug);
            int cosp=Math.max(sel,cool);
            // System.out.println(cubou+" "+cusel+" "+cosp);
            boug=cubou;
            sel=cusel;
            cool=cosp;
        }
        return sel;
    }
    public static int maximumWithFee(int[] price,int fee){
        int bought=price[0]*-1;
        int sold=0;
        for(int i=1;i<price.length;i++){
            int currboug=Math.max(bought,sold-price[i]);
            int cursold=Math.max(sold,price[i]+bought-fee);
            bought=currboug;
            sold=cursold;
        }

        return sold;
    }
    public static int maximumprofitManyTransaction(int[] price){
        int totalpro=0;
        int buy=0;
        int sell=0;
        for(int i=1;i<price.length;i++){
            if(price[i]>=price[i-1]){
                sell=i;
            }
            else{
                totalpro+=price[sell]-price[buy];
                sell=i;
                buy=i;
                System.out.println(totalpro +" "+i);
            }
        }
        totalpro+=price[sell]-price[buy];
        return totalpro;

    }
    public static int maximumprofwithonlyonetransaction(int[] price,int n){

        int profit=0;
        int least=price[0];
        for(int i=0;i<n;i++){
            if(price[i]<least){
                least=price[i];
            }
            int today=price[i]-least;
            if(today>profit){
                profit=today;
            }
        }

        return profit;
    }
}
