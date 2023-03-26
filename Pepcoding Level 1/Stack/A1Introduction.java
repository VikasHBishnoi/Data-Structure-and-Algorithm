package com.company.PepCoding.Stack;

import java.util.Stack;

public class A1Introduction {
    public static void main(String[] args) {
        //
        // push 10
        // This above mean Add 10 to stack
        // push 20
        // This above mean Add 20 to stack
        // push 30
        // This above mean Add 30 to stack

        // peek
        // will show 30

        //pop
        // this remove 30

        // size
        // 2

        Stack<Integer> st =new Stack<>();
        st.push(10);
        st.push(20);
        System.out.println(st);
        st.push(30);
        System.out.println(st);
        st.push(40);
        System.out.println(st);
        System.out.println(st+" --- "+st.peek()+"  "+st.size());

        st.pop();
        System.out.println(st+" --- "+st.peek()+"  "+st.size());

        st.pop();
        System.out.println(st+" --- "+st.peek()+"  "+st.size());

        st.pop();
        System.out.println(st+" --- "+st.peek()+"  "+st.size());

        st.pop();
        System.out.println(st+" --- "+"  "+st.size());
        System.out.println(st.peek());



    }
}
