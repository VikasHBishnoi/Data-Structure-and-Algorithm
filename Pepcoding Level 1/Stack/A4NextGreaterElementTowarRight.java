package com.company.PepCoding.Stack;

import java.util.Scanner;
import java.util.Stack;

public class A4NextGreaterElementTowarRight {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
       // int n=sc.nextInt();
        int[] arr={2,5,9,3,1,12,6,8,7};
       // int[] arr=new int[n];
//        for (int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }
        int[] nextGreate=solve(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println("The greter element of "+arr[i]+" Is "+nextGreate[i]);
        }
    }
    public static int[] solve(int[] arr){
        int[] nge=new int[arr.length];

        Stack<Integer> st=new Stack<>();

        st.push(arr[arr.length-1]);
        nge[arr.length-1]=-1;

        for (int i=arr.length-2;i>=0;i--){

            // -a+
            while (st.size()>0 && arr[i]>=st.peek()){
                st.pop();
            }
            if (st.size()==0){
                nge[i]=-1;
            }
            else{
                nge[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return nge;
    }
}
