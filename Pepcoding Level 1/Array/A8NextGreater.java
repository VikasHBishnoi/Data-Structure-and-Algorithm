package com.company.PepCoding.Array;

import java.util.Scanner;
import java.util.Stack;

public class A8NextGreater {
    public static int[] inputarray(int n){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Size of array 1");
        int n1=sc.nextInt();
        int[] arr1=inputarray(n1);

        // lets try
        Stack<Integer> st =new Stack<>();
        int k=0;
        int count=0;
       // int temp=arr1[k];
        for (int i=1;i<arr1.length;i++){
            int temp=arr1[k];
            count++;
            if (arr1[i]>temp){
                st.push(arr1[i]);
              //  count++;
                System.out.println("Next Greater to"+temp+"is"+st.peek()+"  "+count  );
                k++;
                temp=arr1[k];

                i=k;
            }
        }

       // for (int i=0;i<arr1.length;i++){
         //   int comparingfor=arr1[i];
//            Stack<Integer> st =new Stack<>();
//            st.push(comparingfor);

    }
}
