package com.company.PepCoding.Stack;

import java.util.Scanner;
import java.util.Stack;

public class A13CelebrityProblem {
    public static void main(String[] args) {
        // need to solve in O(n)
        Scanner sc=new Scanner(System.in);

        int n=5;
        int[][] arr=new int[n][n];
        arr[0][0]=0;
       // here arr
    }
    public static void findcelebrity(int[][] arr){
        Stack<Integer> st=new Stack<>();
        for (int i=0;i<arr.length;i++){
            st.push(i);
        }
        while (st.size()>=2){
            int i=st.pop();
            int j=st.pop();
            if (arr[i][j]==1){
                // means i knows j so i can't be celebrity
                st.push(j);
            }
            else  {
                // else means i dont j so j can't be celebrity
                st.push(i);
            }
        }
        int pot=st.peek();
        for (int i=0;i<arr.length;i++){
            if (i!=pot){
                if (arr[i][pot] ==0 ||arr[pot][i]==1){
                System.out.println("None");
                return;
                }
            }
        }
        System.out.println(pot);
    }
}
