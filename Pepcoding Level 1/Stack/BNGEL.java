package com.company.PepCoding.Stack;

import java.util.Stack;

public class BNGEL {
    public static void main(String[] args) {
        // next greater element in left
        int arr[] ={30,5,6,2,7,9,5,60,54};
        int answer[]=NextGreaterOnLeft(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println("The greter element on left  of "+arr[i]+" Is "+answer[i]);
        }
    }
    public static int[] NextGreaterOnLeft(int[] arr){
        int [] NGEL=new int[arr.length];

        Stack<Integer> st=new Stack<>();
        st.push(arr[0]);
        NGEL[0]=-1;
        for (int i=1;i<arr.length;i++){
            while (st.size()>0 && arr[i] >=st.peek()){
                st.pop();
            }
            if (st.size()>0){
                NGEL[i]=st.peek();
            }
            else {
                NGEL[i]=-1;
            }
            st.push(arr[i]);
        }
        return NGEL;
    }
}
