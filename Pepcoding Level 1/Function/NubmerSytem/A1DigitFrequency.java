package com.company.PepCoding.Function.NubmerSytem;

import java.util.Scanner;

public class A1DigitFrequency {
    public static boolean check(int x){
        boolean check;
        if(x<=9){
            check=true;
        }
        else {
            check=false;
        }
        return check;
    }
    public static void digfr(int n,int dig){
        if (check(dig)){
            System.out.println("true");

            int digfre=0;
            while(n > 0){
                int va=n%10;
                if (dig==va){
                    digfre++;
                }
                n=n/10;
            }
            System.out.println(digfre);
        }
        else {
            System.out.println("wrong input");
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int dig=scan.nextInt();

      //  int cout=0;
        // no need
//        while((n/i) !=0){
//            cout++;
//            i=i*10;
//        }
        //System.out.println(cout);
        digfr(n,dig);


    }
}
