package com.company.PepCoding.Start;

import java.util.Scanner;

public class A4LoopsAndInput {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Giving int input");
        // int n=sc.nextInt();
        // this above will be bug if use int and string concureently
        int n=Integer.parseInt(sc.nextLine());
        for (int i =1;i<=n;i++){
            System.out.println(" "+i);
        }

        System.out.println("Giving string input");
        String name=sc.nextLine();
        System.out.println("Ram ram sa"+name);
    }
}
