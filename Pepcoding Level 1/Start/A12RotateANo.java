package com.company.PepCoding.Start;
import java.math.*;
import java.util.Scanner;

public class A12RotateANo {
    public static void main(String[] args) {
        System.out.println(-5%3);

        Scanner sc=new Scanner(System.in);
        System.out.println("Give input no.");
        int no =sc.nextInt();
        System.out.println("How Much Rotatation");
        int k= sc.nextInt();
        int temp=no;
        int dig=0;
        while(temp !=0){
            temp=temp/10;
            dig++;
        }
        System.out.println(dig);
        if(k<0){
            k=k%dig;
            k=k+dig;
            System.out.println(k);
        }
        else{
            k=k%dig;
            System.out.println(k);
        }
        int div=(int)Math.pow(10,k);
        int multi=(int)Math.pow(10,dig-k);
        int endingpart=no/div;
        int startingpat=no%div;
        int r=(startingpat*multi)+endingpart;
        System.out.println(r);



    }
}
