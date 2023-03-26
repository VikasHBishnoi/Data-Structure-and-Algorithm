package com.company.PepCoding.Stack;

import java.util.Stack;

public class BNGER {
    public static void main(String[] args) {
        int arr[] ={300,5,6,2,7,9,5,60,54};

        int answer[]=nger(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println("The greter element on Right of "+arr[i]+" Is "+answer[i]);
        }

    }

    public static int[] nger(int[] arr){
        int [] nger=new int[arr.length];

        Stack<Integer> st=new Stack<>();

        st.push(arr[arr.length-1]);
        nger[arr.length-1]=-1;
        for (int i=arr.length-2;i>=0;i--){
            while(st.size()>0 && arr[i]  >=st.peek()){
                st.pop();
            }
            if (st.size()==0){
                nger[i]=-1;
            }
            else{
                nger[i]=st.peek();
            }
            st.push(arr[i]);
        }

        return nger;
    }
}
