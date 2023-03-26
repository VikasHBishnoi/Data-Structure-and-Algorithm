package com.company.PepCoding.Function.NubmerSytem;

import java.util.Scanner;

public class AnyBaseAddition  {
    public static int anybaseaddition(int base,int number1,int number2){
        int carry=0;
        int output=0;
        int k=1;
        while (number1 >0 || number2>0){
            int dig1=number1%10;
            int dig2=number2%10;
            System.out.println(dig1+ " " + dig2 +" " +carry);
            int exp=dig1+dig2+carry;
            int sum=(exp)%base;
            carry=exp/base;
            output=output+(sum)*(k);
            System.out.println( sum +" "+k);
            k=k*10;

            number1=number1/10;
            number2=number2/10;
        }
        if(carry !=0){
            output=output+(carry)*(k);
        }
        return output;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        int output=anybaseaddition(base,number1,number2);
        System.out.println(output);

    }
}
