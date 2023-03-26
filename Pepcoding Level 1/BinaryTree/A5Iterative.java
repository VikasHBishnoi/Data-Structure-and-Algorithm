package com.company.PepCoding.BinaryTree;

import java.util.Stack;

public class A5Iterative {
    public static void main(String[] args) {
        Integer [] arr={50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
        Node root=Node.nodeContstructor(arr);
        Node.Display(root);
        pair rtpair=new pair(root,1);
        Stack<pair> st=new Stack<>();
        st.push(rtpair);
        String pre="";
        String In="";
        String post="";
        while (st.size()>0){
            //System.out.println("dfd");
            if(st.peek().state==1){
                pre=pre+st.peek().node.data+" - ";
                st.peek().state=2;
                if(st.peek().node.left!=null){
                    pair temp=new pair(st.peek().node.left,1);
                    st.push(temp);
                }
            }
            else if(st.peek().state==2){
                In=In+st.peek().node.data+" - ";
                st.peek().state=3;
                if(st.peek().node.right!=null){
                    pair temp=new pair(st.peek().node.right,1);
                    st.push(temp);
                }
            }
            else if(st.peek().state==3){
                post=post+st.peek().node.data+" - ";
                st.pop();
            }
        }
        System.out.println("Pre Order is  "+pre);
        System.out.println("In Order is   "+In);
        System.out.println("Post Order is "+post);
    }
}
