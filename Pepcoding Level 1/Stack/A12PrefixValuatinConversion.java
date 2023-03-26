package com.company.PepCoding.Stack;
import java.util.Scanner;
import java.util.Stack;

public class A12PrefixValuatinConversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Give prefix Expression");
        String preifxexp=sc.nextLine();


      // -+2/*6483
        Stack<Integer> value=new Stack<>();
        Stack<String> postfix=new Stack<>();
        Stack<String> infix=new Stack<>();
        for (int i=preifxexp.length()-1;i>=0;i--){
            char ch=preifxexp.charAt(i);
            if (ch>='0'&& ch<='9'){
               int numbner=ch-'0';
                value.push(numbner);
                infix.push(ch+"");
                postfix.push(ch+"");
            }
            else {
                // here v1 v2 are differemt feom other
                int v1=value.pop();
                int v2=value.pop();
                int finalff=ValueOperation(v1,v2,ch);
                value.push(finalff);

                pretoinfix(ch,infix);
                pretopost(ch,postfix);

            }
        }
        System.out.println(value.peek());
        System.out.println(infix.peek());
        System.out.println(postfix.peek());
    }
    public static void pretopost(char operation,Stack<String> post){
        String s1=post.pop();
        String s2=post.pop();
        String FinalStrig=s1+s2+operation;
        post.push(FinalStrig);
    }
    public static void pretoinfix(char operation,Stack<String> infix){
        String S1 =infix.pop();
        String S2 =infix.pop();
        String FinalString="("+S1+operation+S2+")";
        infix.push(FinalString);

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
