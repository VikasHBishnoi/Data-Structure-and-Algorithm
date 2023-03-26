package com.company.PepCoding.Stack;

import java.util.Stack;

public class A5NGETR_Alternate_Approach {
    public static void main(String[] args) {
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

        st.push(0);


        for (int i=1;i<arr.length;i++){
            // -a   +
            while (st.size()>0 && arr[i]>=arr[st.peek()]){
                int position =st.peek();
                nge[position]=arr[i];
                st.pop();
            }
            st.push(i);
        }
        while (st.size()>0){
            int pos=st.peek();
            nge[pos]=-1;
            st.pop();
        }

        return nge;
    }

}
