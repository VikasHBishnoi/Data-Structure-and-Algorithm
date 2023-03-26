package com.company.PepCoding.Stack;

import java.util.Scanner;
import java.util.Stack;

public class A10InfixConversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Give Infix Expression");
        String infixExp=sc.nextLine();

        Stack<String> pre=new Stack<>();
        Stack<String> post=new Stack<>();
        Stack<Character> oator=new Stack<>();

        for (int i=0;i<infixExp.length();i++){
            char ch=infixExp.charAt(i);
            if (ch =='('){
                oator.push(ch);
            }
            else if ((ch>='0' && ch<='9') || (ch >='a' && ch<='z') || (ch >='A' && ch<='Z')){
                pre.push(ch + "");
                post.push(ch + "");
            }
            else if (ch==')'){
                while (oator.peek() !='('){
                    Procees(oator,pre,post);
                }
                oator.pop();

            }
            else if (ch=='+' || ch=='-' || ch=='*'|| ch=='/'){
                while (oator.size()>0 && oator.peek() !='(' && precedence(ch) <=precedence(oator.peek())){
                    Procees(oator,pre,post);
                }
                oator.push(ch);
            }
        }
        while(oator.size() !=0){
            Procees(oator,pre,post);
        }
        System.out.println("The prefix is "+pre.peek());
        System.out.println("The Postfix is " +post.peek());
    }


    public static void Procees(Stack<Character> ops,Stack<String> pre,Stack<String> post){
        char op=ops.pop();
        String Postv2=post.pop();
        String Postv1=post.pop();

        String Postv= Postv1+Postv2+op;
        post.push(Postv);

        String Prev2=pre.pop();
        String Prev1=pre.pop();

        String Prev= op+Prev1+Prev2;
        pre.push(Prev);
    }

    public static int precedence(char operator){
        if (operator =='+'){
            return 1;
        }
        else if (operator =='-'){
            return 1;
        }
        else if (operator =='*'){
            return 2;
        }
        else{
            return 2;
        }
    }
}
