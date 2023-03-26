package com.company.PepCoding.BinaryTree;

import java.io.DataInput;
import java.util.Stack;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data,Node left,Node right){
        this.data=data;
        this.left=left;
        this.right=right;
    }
    public static Node nodeContstructor(Integer[] arr){
        Node root=new Node(arr[0],null,null);

        Stack<pair> st=new Stack<>();
        pair rtpair=new pair(root,1);
        st.push(rtpair);
        int idx=0;
        while (st.size()>0){
            pair top=st.peek();
            if(top.state==1){
                idx++;
                if(arr[idx]!=null){
                    Node ln=new Node(arr[idx],null,null);
                    top.node.left=ln;
                    pair le=new pair(ln,1);
                    st.push(le);
                }
                else{
                    top.node.left=null;
                }
                top.state=2;
            }
            else if(top.state==2){
                idx++;
                if(arr[idx]!=null){
                    Node rn=new Node(arr[idx],null,null);
                    top.node.right=rn;
                    pair rp=new pair(rn,1);
                    st.push(rp);
                }
                else{
                    top.node.right=null;
                }
                top.state=3;
            }
            else{
                st.pop();
            }
        }
        // hurra done it myselft
       // System.out.println(rtpair.node.data+" "+rtpair.node.left.right.left.data+" "+rtpair.node.right.right.data);
        return root;

    }
    public static void Display(Node node){

        if(node!=null){
            //System.out.print(node.data+" --> ");
            if(node.left!=null){
                System.out.print(node.left.data);
            }
            else{
                System.out.print(" .");
            }
            System.out.print(" <-- "+node.data+" --> ");
            if(node.right!=null){
                System.out.println(node.right.data);
            }
            else{
                System.out.println(" . ");
            }
            if(node.left!=null){
                Display(node.left);
            }
            if(node.right!=null){
                Display(node.right);
            }

        }
    }
}
class pair{
    Node node;
    int state;
    pair(Node node,int state){
        this.node=node;
        this.state=state;
    }
}
public class A1Introduction {

    public static void main(String[] args) {
        Integer [] arr={50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
        Node root=new Node(arr[0],null,null);

        Stack<pair> st=new Stack<>();
        pair rtpair=new pair(root,1);
        st.push(rtpair);
        int idx=0;
        while (st.size()>0){
            pair top=st.peek();
            if(top.state==1){
                idx++;
                if(arr[idx]!=null){
                    Node ln=new Node(arr[idx],null,null);
                    top.node.left=ln;
                    pair le=new pair(ln,1);
                    st.push(le);
                }
                else{
                    top.node.left=null;
                }
                top.state=2;
            }
            else if(top.state==2){
                idx++;
                if(arr[idx]!=null){
                    Node rn=new Node(arr[idx],null,null);
                    top.node.right=rn;
                    pair rp=new pair(rn,1);
                    st.push(rp);
                }
                else{
                    top.node.right=null;
                }
                top.state=3;
            }
            else{
                st.pop();
            }
        }
        // hurra done it myselft
        System.out.println(root.data+" "+root.left.right.left.data+" "+root.right.right.data);
        Node temp2=Node.nodeContstructor(arr);
        System.out.println(temp2.data+" "+temp2.left.right.left.data+" "+temp2.right.right.data);
        Node.Display(root);
    }

}

