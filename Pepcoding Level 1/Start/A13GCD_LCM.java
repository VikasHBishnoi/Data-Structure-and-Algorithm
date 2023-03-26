package com.company.PepCoding.Start;

import java.util.Scanner;

public class A13GCD_LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Give input no. 1");
        int n1 =sc.nextInt();
        int tempn1=n1;
        System.out.println("Give input no. 2");
        int n2 =sc.nextInt();
        int tempn2=n2;
        int max;
        int min;
        if(n1>n2){
            max=n1;
            min=n2;
        }
        else {
            max=n2;
            min=n1;
        }
        int temp=1;
        // gcd brootforce
        for (int i=1;i<=min;i++){
            int r1=n1%i;
            int r2=n2%i;
            if(r1==0 && r2==0){
                temp=i;
               // System.out.println(temp);
            }
        }
        System.out.println("Greatest common divisor is "+temp);

        // gcd omptize
        while(tempn1 % tempn2 != 0){
            int rem=tempn1%tempn2;
            tempn1=tempn2;
            tempn2=rem;
        }
        System.out.println(tempn2);

        // lcm * gcd =n1*n2
        int lcm=(n1*n2)/tempn2;
        boolean correct=true;
        int pro=n1*n2;
        if (pro%tempn2 !=0){
            correct=false;
        }
        System.out.println("lcm is " +lcm +" (Correc to not) "+correct);
    }
}
