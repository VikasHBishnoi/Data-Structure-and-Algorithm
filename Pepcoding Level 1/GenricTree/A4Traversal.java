package com.company.PepCoding.GenricTree;

import java.util.Stack;

public class A4Traversal {
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
        traversal(root);
    }
    public static void traversal(Node node){
        // euler left, on the way to deep to recursion
        System.out.println("Node pre "+node.data);
        for(Node child:node.childer){
            // edge pre
            System.out.println("Edge Pre "+node.data+"--"+child.data);
            traversal(child);
            System.out.println("Edge post "+node.data+"--"+child.data);
        }
        System.out.println("Node Post "+node.data);
        //System.out.println();

    }
}
