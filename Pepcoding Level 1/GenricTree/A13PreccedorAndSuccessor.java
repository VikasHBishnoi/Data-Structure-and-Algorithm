package com.company.PepCoding.GenricTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class A13PreccedorAndSuccessor {
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
        preandpost(root);

    }
    public  static  void preandpost(Node node){
        List<Node> output=pre(node);
        for(int i=0;i<output.size();i++){
            System.out.println(output.get(i).data);
        }
    }
    public static List<Node> pre(Node root){
        List<Node> li=new ArrayList<>();
        li.add(root);
        for(Node child:root.childer){
            List<Node> iz=pre(child);
            for(int i=0;i<iz.size();i++){
                li.add(iz.get(i));
            }
        }

        return  li;
    }
}
