package com.company.PepCoding.DynamicPrograming;
public class A1Introduction {
    static int[] arr;
    public static void main(String[] args) {
        int n=10;
        arr=new int[n+1];
      //  System.out.println(fibonaciiRecursionn(n)+"sse");
        int[] que=new int[n+1];
        System.out.println(fibonaciDp(n,que));
        for(int i=0;i<n+1;i++){
            System.out.println("Item"+i+" Time:- "+arr[i]);
        }

    }
    public static int fibonaciDp(int n,int[] qb){
        if(n==0 || n==1){
            return n;
        }
        if(qb[n]!=0){
            return qb[n];
        }
        arr[n]++;
        int n2=fibonaciDp(n-1,qb);
        int n1=fibonaciDp(n-2,qb);
        qb[n]=n1+n2;
        return qb[n];
    }
    public static int fibonaciiRecursionn(int n){
        arr[n]++;
        if(n==0 ||n==1){
            return n;
        }
        System.out.println("Hello "+ n);
        int n1=fibonaciiRecursionn(n-1);
        int n2=fibonaciiRecursionn(n-2);
        return n1+n2;
    }



}
