package com.company.PepCoding.Stack;

import java.util.Stack;

public class BNSEL {
    public static void main(String[] args) {
        int arr[] ={2,5,6,2,7,9,5,60,54};
        int nsel[]=NextSmallerOnLeft(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println("The Smaller element on Left of "+arr[i]+" Is "+nsel[i]);
        }
    }
    public static int[] NextSmallerOnLeft(int arr[]){
        int[] nsel=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        st.push(arr[0]);
        nsel[0]=-1;
        for (int i=1;i<arr.length;i++){
            while(st.size()>0 && st.peek()>=arr[i]){
                st.pop();
            }
            if (st.size()>0){
                nsel[i]=st.peek();
            }
            else {
                nsel[i]=-1;
            }
            st.push(arr[i]);
        }
        return nsel;
    }
}
