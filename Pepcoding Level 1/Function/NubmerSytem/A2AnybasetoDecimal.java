package com.company.PepCoding.Function.NubmerSytem;

import java.util.Scanner;

public class A2AnybasetoDecimal {
    public static int anybasetoecimal(int number,int numberBase) {
        // slightly improve myelsf but still

        // decimal to any base
        int outputNumber = 0;
        int temp = number;
        int k = 1;
        while (temp > 0) {
            int dig = temp % 10;
            temp = temp / 10;
            // to get c confirm each step working correct
            //System.out.println(k);
            outputNumber = outputNumber + dig * (k);
            k = k * numberBase;

        }
        return outputNumber;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        int numberBase=scan.nextInt();
        int z=anybasetoecimal(number,numberBase);
        System.out.println(z);
    }
}
