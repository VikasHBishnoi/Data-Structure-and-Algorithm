package com.company.PepCoding.Function.NubmerSytem;

import java.util.Scanner;

public class AnyBaseSubtraction {
    // assumbe n1>n2
    public static int anybasutraction(int base,int number1,int number2){
        int borrow=0;
        int output=0;
        int k=1;
        while (number1 >0 || number2>0){
            int dig1=number1%10;
            int dig2=number2%10;
            System.out.println(dig1+ " " + dig2 +" " +borrow);
            if (borrow !=0){
                dig1=dig1 -1;
            }

            if (dig2>dig1){
                borrow=base;
            }
            else {
                borrow=0;
            }
            int exp=dig1+borrow -dig2;

            int Sub=(exp)%base;

            output=output+(Sub)*(k);
            System.out.println( Sub +" "+k);
            k=k*10;

            number1=number1/10;
            number2=number2/10;
        }
        if(borrow !=0){
            System.out.println(output=output*(-1));
            System.out.println("Ther might be num 1<nub2");
        }
        return output;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        int output=anybasutraction(base,number1,number2);
        System.out.println(output);
    }
}
