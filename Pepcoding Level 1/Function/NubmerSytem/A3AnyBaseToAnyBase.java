package com.company.PepCoding.Function.NubmerSytem;

import java.util.Scanner;

public class A3AnyBaseToAnyBase {
    public static int anytoany(int number1,int frombase,int tobase){
        int output1 = 0;
        int temp1 = number1;
        int k = 1;
        while (temp1 > 0) {
            int dig = temp1 % 10;
            temp1 = temp1 / 10;

            output1 = output1 + dig * (k);
            k = k * frombase;

           // System.out.println(outputNumber);

        }
        System.out.println("The decimal form"+output1);
        int input2=output1;

        int finaoutput=0;
        int temp2=input2;
        int k2=1;
        while (temp2>0){
            int dig=temp2%tobase;
            temp2=temp2/tobase;

            // to get c confirm each step working correct
            //System.out.println(k);
            finaoutput=finaoutput+dig*(k2);

            k2=k2*10;

        }
        //  no need to print as it return int type
        // System.out.println(outputNumber);
        return finaoutput;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        int frombase=scan.nextInt();
        int tobase=scan.nextInt();

        int z=anytoany(number,frombase,tobase);
        System.out.println(z);

        // can also do with to function
    }
}
