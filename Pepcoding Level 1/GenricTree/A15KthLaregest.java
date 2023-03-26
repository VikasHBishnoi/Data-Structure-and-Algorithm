package com.company.PepCoding.GenricTree;

import java.util.Stack;

public class A15KthLaregest {
    static int ciel =Integer.MAX_VALUE;
    static int floor =Integer.MIN_VALUE;

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
        //Display(root);
//        System.out.println(Comman(90,110,root));
//        System.out.println(Distance(30,110,root));
        System.out.println(floor);
        int factor=Integer.MAX_VALUE;

        for(int i=0;i<3;i++){
            travel(root,factor);
            factor=floor;
            floor=Integer.MIN_VALUE;
        }
        System.out.println(factor);

    }
    public static void travel(Node node,int val){
        if(node.data<val){
            //System.out.println("Low "+node.data+" "+val+" "+floor);
            if(node.data> floor){
                floor =node.data;
            }
        }
        else if(node.data>val){
            if(node.data< ciel){
                ciel =node.data;
            }
        }
        for(Node child:node.childer){
            travel(child,val);
        }
    }
}
