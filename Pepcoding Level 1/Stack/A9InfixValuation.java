package com.company.PepCoding.Stack;

import java.util.Scanner;
import java.util.Stack;

public class A9InfixValuation {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String expression=sc.nextLine();
        Stack<Integer> operands=new Stack<>();
        Stack<Character> operator=new Stack<>();
        for (int i=0;i<expression.length();i++){
            char ch=expression.charAt(i);
            if (ch =='('){
                operator.push(ch);
            }
            else if (Character.isDigit(ch)){
                int k=ch-'0';
                operands.push(k);
            }
            else if (ch==')'){
                while (operator.peek() !='('){
                    char oprator=operator.pop();
                    int v2=operands.pop();
                    int v1=operands.pop();

                    int operationvalue=Operation(v1,v2,oprator);
                    operands.push(operationvalue);
                }
                operator.pop();

            }
            else if (ch=='+' || ch=='-' || ch=='*'|| ch=='/'){
                while (operator.size()>0 && operator.peek() !='(' && precedence(ch) <=precedence(operator.peek())){
                    char oprator=operator.pop();
                    int v2=operands.pop();
                    int v1=operands.pop();

                    int operationvalue=Operation(v1,v2,oprator);
                    operands.push(operationvalue);
                }
                operator.push(ch);
            }
        }
        while(operator.size() !=0){
            char oprator=operator.pop();
            int v2=operands.pop();
            int v1=operands.pop();

            int operationvalue=Operation(v1,v2,oprator);
            operands.push(operationvalue);
        }
        System.out.println(operands.peek());

    }

    public static int Operation(int v1,int v2,char operator){
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
