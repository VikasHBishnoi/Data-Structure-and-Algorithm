package com.company.PepCoding.Stack;

import java.util.Scanner;
import java.util.Stack;

public class A11PostFixValuationConversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Give Postfix Expression");
        String postExp=sc.nextLine();

        // code for postfix valution and to convert it in pre and infix
        Stack<String> Infix=new Stack<>();
        Stack<String> prefix=new Stack<>();
        Stack<Integer> Value=new Stack<>();

        for (int i=0;i<postExp.length();i++){
            char ch=postExp.charAt(i);
            if (ch>='0'&& ch<='9'){
                int number=ch-'0';
                Value.push(number);
              //  System.out.println(number);
                Infix.push(ch+"");
                prefix.push(ch+"");
            }
            else if (ch=='+' || ch=='-' || ch=='*'|| ch=='/'){
                // for Value calculating
                int v2=Value.pop();
                int v1=Value.pop();
                int finalvalue= ValueOperation(v1,v2,ch);
               // System.out.println("Final"+finalvalue);
                Value.push(finalvalue);

                // Code for post to infix
                posttoinfix(ch,Infix);

                // Code for post to prefix
                posttoprefix(ch,prefix);


            }

        }
        System.out.println("The value"+Value.peek());
        System.out.println("The Infix Expresssion is"+Infix.peek());
        System.out.println("The prefix Expresssion is"+prefix.peek());
        //Stack<Character> oator=new Stack<>();
    }
    public static void posttoprefix(char operation,Stack<String> prefix ){
        String S2=prefix.pop();
        String S1=prefix.pop();
        String FinalPre=operation+S1+S2;
        prefix.push(FinalPre);
    }
    public static void posttoinfix(char operation,Stack<String> Infix){
        String S2=Infix.pop();
        String S1=Infix.pop();
        String FinalSting="("+S1+operation+S2+")";
        Infix.push(FinalSting);
    }
    public static int ValueOperation(int v1, int v2, char operator){
        if (operator =='+'){
            return v1+v2;
        }
        else if (operator =='-'){
            return v1-v2;
        }
        else if (operator =='*'){
            return v1*v2;
        }
        else{
            return v1/v2;
        }
    }
}
