package com.company.PepCoding.Function.NubmerSytem;

import java.util.Scanner;

public class A1DecimaltoAnyBase {
    public static int decimaltanybase(int number,int tobase){
        // slightly improve myelsf but still

        // decimal to any base
        int outputNumber=0;
        int temp=number;
        int k=1;
        while (temp>0){
            int dig=temp%tobase;
            temp=temp/tobase;
            // to get c confirm each step working correct
            //System.out.println(k);
            outputNumber=outputNumber+dig*(k);
            k=k*10;

        }
        //  no need to print as it return int type
        // System.out.println(outputNumber);
        return outputNumber;
    }
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        int tobase=scan.nextInt();

        // calling funciton
        int n=decimaltanybase(number,tobase);
        System.out.println(n);


        // this slight not optimize in because of one internal loop which reduce in function
//        Scanner scan=new Scanner(System.in);
//        // decimal to any base
//        int number=scan.nextInt();
//        int tobase=scan.nextInt();
//        int outputNumber=0;
//        int temp=number;
//        int i=1;
//        while (temp>0){
//
//            int dig=temp%tobase;
//            temp=temp/tobase;
//            int k=1;
//            for (int m=1;m<i;m++){
//
//                k=k*10;
//
//            }
//            System.out.println(k);
//            outputNumber=outputNumber+dig*(k);
//            i++;
//
//        }
//        System.out.println(outputNumber);


    }
}
