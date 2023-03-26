package com.company.PepCoding.Stack;

import java.util.Stack;

public class A6StockSpan {
    public static void main(String[] args) {
        int[] arr={20,5,9,3,10,12,6,8,7};
        // this next greater on left

        int[] nextGreateleft=solve(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(i-1-nextGreateleft[i]+"   ");
        }
    }
    public static int[] solve(int[] arr){
        int[] ngeindexonlft=new int[arr.length];

        Stack<Integer> st=new Stack<>();
        st.push(0);
        ngeindexonlft[0]=-1;

        for (int i=1;i<arr.length;i++){
            while(st.size()>0 && arr[i]>=arr[st.peek()]){
                //int pos=st.peek();
                st.pop();

            }
            if (st.size()==0){
                ngeindexonlft[i]=-1;
            }
            else {
                ngeindexonlft[i]=st.peek();
            }


            st.push(i);
        }


        return ngeindexonlft;

    }
}
