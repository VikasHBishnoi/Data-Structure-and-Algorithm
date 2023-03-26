package com.company.PepCoding.Start;

import java.awt.font.FontRenderContext;
import java.util.Scanner;

public class A1Output {
    public static void main(String[] args){
        System.out.println("hello");
        System.out.println("Ram ram ");

        Scanner sc= new Scanner(System.in);
        System.out.println("Length of  square");
        int input=sc.nextByte();
        // For a print a square
//        for (int i=0;i<input;i++){
//            for (int k=0;k<input;k++){
//            System.out.print("* ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//
//        // for printing half square
//        for (int i=1;i<=input;i++){
//            for (int k=1;k<=i;k++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // For Printing Z
        for (int i=1;i<=input;i++){
            if (i==1 || i==input){
                for (int j=1;j<=input;j++){
                    System.out.print(" * ");
                }
            }
            else {
                for (int k = 1; k <= input - i; k++) {
                    System.out.print("   ");
                }
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
