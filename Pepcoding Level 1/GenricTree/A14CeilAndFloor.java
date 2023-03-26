package com.company.PepCoding.GenricTree;

import java.util.Stack;

public class A14CeilAndFloor {
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
        travel(root,100);
        System.out.println("Ciel is "+ ciel);
        System.out.println("Floor is "+ floor);

    }
    public static void travel(Node node,int val){
        if(node.data<val){
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
