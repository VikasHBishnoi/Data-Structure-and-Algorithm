package com.company.PepCoding.Stack;

import java.util.Stack;

public class BNSER {
    public static void main(String[] args) {
        int arr[] ={20,5,6,2,7,9,5,60,54};
        int NextSmallerOnRight[]=NextSmallerONRight(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println("The Smaller element on Right of "+arr[i]+" Is "+NextSmallerOnRight[i]);
        }
    }
    public static int[] NextSmallerONRight(int arr[]){
        int nser[] =new int[arr.length];
        Stack<Integer> st=new Stack<>();
        st.push(arr[arr.length-1]);
        nser[arr.length-1]=-1;
        for (int i=arr.length-2;i>=0;i--){
            while (st.size()>0 && st.peek() >= arr[i]){
                st.pop();
            }
            if (st.size()>0){
                nser[i]=st.peek();
            }
            else {
                nser[i]=-1;
            }
            st.push(arr[i]);
        }
        return nser;
    }
}
