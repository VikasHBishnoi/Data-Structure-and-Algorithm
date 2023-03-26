package com.company.PepCoding.DynamicPrograming;
public class A8CoinChangeCombination {
    public static void main(String[] args) {
        int[] coin={3,2,5,6};
        int taget=10;
        System.out.println(coinchange(coin,taget));
    }
    public static int coinchange(int[] coin,int target){
        int[] change=new int[target+1];
        change[0]=1;
        for(int i=0;i<coin.length;i++){
            int el=coin[i];
            for(int j=el;j<=target;j++){
                change[j]+=change[j-el];
            }
        }
        return change[target];
    }
}
