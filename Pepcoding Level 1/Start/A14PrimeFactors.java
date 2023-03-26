package com.company.PepCoding.Start;

import java.util.Scanner;

public class A14PrimeFactors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Give no.");
        int n =sc.nextInt();
        int temp=n;
        for (int i=2; n!=1 ;i++){
            boolean prime=true;
            for(int k=2;k<=Math.sqrt(i);k++){
                // we use Math.sqrt(n) to reduce complexity
                if(i%k==0){
                    prime=false;
                    //System.out.println(i);
                    break;
                    // break use to decrease time complexity
                    //as we get first divisor no need to go to next divisor
                }
            }
            while(n%i==0 && prime==true){
                n=n/i;
                System.out.println(i);
            }
        }


        // pepcode solution
        System.out.println("Second solutuon");
        for (int i =2;i<temp;i++){
            while(temp%i==0){
                temp=temp/i;
                System.out.println(i);
            }
        }
        if(temp !=1){
            System.out.println(temp);
        }
    }
}
