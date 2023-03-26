package com.company.PepCoding.Start;
import java.lang.Math;
import java.util.Scanner;

public class A5PirmeNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        boolean prime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            // we use Math.sqrt(n) to reduce complexity
            if(n%i==0){
                prime=false;
                System.out.println(i);
                break;
                // break use to decrease time complexity
                //as we get first divisor no need to go to next divisor

            }
        }
        if(prime==true){
            System.out.println("Prime");
        }
        else {
            System.out.println("non prime");
        }
    }
}
