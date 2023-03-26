package com.company.PepCoding.DynamicPrograming;

public class A13ArrangeBuilding {
    public static void main(String[] args) {
        System.out.println(buildingarrange(5));
    }
    public static int buildingarrange(int n){
        int prb=1;
        int prs=1;
        for(int i=2;i<n;i++){
            int cub=prs;
            int cus=prb+prs;

            prb=cub;
            prs=cus;
        }
        return (prb+prs)*(prb+prs);
    }
}
