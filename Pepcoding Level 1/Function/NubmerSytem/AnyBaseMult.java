package com.company.PepCoding.Function.NubmerSytem;

import java.util.Scanner;

public class AnyBaseMult {
    public static int singleproduct(int base, int number1, int dig){
        int carry=0;
        int output1=0;
        int k=1;
        while(number1>0  || carry>0){
            int dignumber1=number1%10;
            int pro=(dignumber1*dig)+carry;

            int ouputdig=pro%base;
            carry=pro/base;

            number1=number1/10;
            output1=output1+(ouputdig*k);
            k=k*10;
        }
        return output1;
    }
    public static int getproduct(int base, int multipeto, int multiplyby){
        int finalOutput=0;
        int k=1;
        while(multiplyby>0){
            int dig=multiplyby%10;
            int intemoutput= singleproduct(base,multipeto,dig);
            finalOutput=anybaseaddition(base,finalOutput,intemoutput*k);
            k=k*10;
            multiplyby=multiplyby/10;
        }

        return finalOutput;
    }
    public static int anybaseaddition(int base,int number1,int number2){
        int carry=0;
        int output=0;
        int k=1;
        while (number1 >0 || number2>0){
            int dig1=number1%10;
            int dig2=number2%10;
            int exp=dig1+dig2+carry;
            int sum=(exp)%base;
            carry=exp/base;
            output=output+(sum)*(k);
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
        int multiple=sc.nextInt();
        int output= getproduct(base,number1,multiple);
        System.out.println(output);

    }
}
