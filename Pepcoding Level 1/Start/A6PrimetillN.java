package com.company.PepCoding.Start;
import java.lang.Math;
import java.util.Scanner;

public class A6PrimetillN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int count=0;
        for(int i=2;i<=n;i++){
            boolean prime=true;
            for(int k=2;k*k<=i;k++){
                // to repreresent square
                // also use k*k<=i
                // we use Math.sqrt(n) to reduce complexity
                if(i%k==0){
                    prime=false;
                    break;
                    // break use to decrease time complexity
                    //as we get first divisor no need to go to next divisor
                }
            }
            if(prime==true){
                count++;
                System.out.println("The No. "+i+"is prime and Count is "+count);

            }

        }
    }
}
