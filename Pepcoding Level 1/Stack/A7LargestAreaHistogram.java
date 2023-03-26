package com.company.PepCoding.Stack;

import java.util.Scanner;
import java.util.Stack;

public class A7LargestAreaHistogram {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] arr=new int[n];
//        for (int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }
        //boolean Duplicate=false;
        int[] arr={6,2,5,4,5,1,6};
        int[] rb =new int[arr.length];
        // right boundary


        int[] lb =new int[arr.length];
        lb=solverleft(arr);

        for (int i=0;i<arr.length;i++){
            System.out.println(lb[i]);
        }
       // Stack<Character> st =new Stack<>();
    }

    public static int[] solverleft(int[] arr){
        int[] nsel=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        // next smaller element on right
        st.push(0);
        nsel[0]=0;

        for (int i=1;i<arr.length;i++){
            while(st.size()>0 && arr[st.peek()] >arr[i]){
                st.pop();
            }
            if (st.size()==0){
                nsel[i]=0;
            }
            else {
                nsel[i]=st.peek();
            }
            st.push(i);

        }
        return nsel;
    }
}
