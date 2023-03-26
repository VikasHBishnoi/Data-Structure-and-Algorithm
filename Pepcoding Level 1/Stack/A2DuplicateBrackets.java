package com.company.PepCoding.Stack;

import java.util.Scanner;
import java.util.Stack;

public class A2DuplicateBrackets {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        boolean Duplicate=false;

        Stack<Character> st =new Stack<>();
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch==')'){
                if (st.peek()=='('){
                    Duplicate=true;
                    System.out.println("True");
                    return;
                }
                else {
                    while (st.peek() !='('){
                        st.pop();
                    }
                    st.pop();
                }
            }
            else {
                st.push(ch);
            }
        }
        System.out.println(Duplicate);
    }
}
