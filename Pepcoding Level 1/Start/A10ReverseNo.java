package com.company.PepCoding.Start;

import java.util.Scanner;

public class A10ReverseNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();

        int z=n;
        int out=0;
        while(z>0){
            int rem=z%10;
            out=out*10+rem;
            z=z/10;
        }
        System.out.println(n+" "+out);
    }
}
