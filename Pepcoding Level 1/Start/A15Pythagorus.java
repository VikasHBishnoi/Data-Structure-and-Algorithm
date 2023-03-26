package com.company.PepCoding.Start;

import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

public class A15Pythagorus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Give no. a");
        int a =sc.nextInt();
        System.out.println("Give no. b");
        int b =sc.nextInt();
        System.out.println("Give no. c");
        int c =sc.nextInt();

        int perp=a;
        int base=b;
        int hy=c;
        if(a>b && a>c){
            hy=a;
            base=b;
            perp=c;

        }
        else if (b>c && b>a){
            hy=b;
            base=a;
            perp=c;

        }
        else  {
            hy=c;
            base=a;
            perp=b;

        }

        int base2=base*base;
        int per2=perp*perp;
        int lhs=base2+per2;
        int rhs=hy*hy;
        if (lhs==rhs){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
