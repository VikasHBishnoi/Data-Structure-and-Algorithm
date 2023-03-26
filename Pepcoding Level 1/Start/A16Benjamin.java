package com.company.PepCoding.Start;

import java.util.Scanner;

public class A16Benjamin {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

        for (int i=1;i*i<=n;i++){
            System.out.println(i*i);
        }
    }
}
