package com.company.PepCoding.GenricTree;

import java.util.Stack;
import java.util.*;

public class A2CountNodes {
    static int size=0;
    public static void main(String[] args) {
        System.out.println("Ram Ram Sa");
        int[] arr={10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
        Stack<Node> st=new Stack<>();
        Node root=new Node();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==-1){
                st.pop();
            }
            else{
                Node t=new Node();
                t.data=arr[i];
                if(st.size()>0) {
                    st.peek().childer.add(t);
                }
                else{
                    root=t;
                }
                st.push(t);
            }
        }
        System.out.println(size(root));

    }
    public static int size(Node root){
        size++;
        for(Node child: root.childer){
            size(child);
        }
        return size;
    }
}
