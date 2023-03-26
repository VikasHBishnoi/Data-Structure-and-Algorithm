package com.company.PepCoding.GenricTree;

import java.awt.*;
import java.util.ArrayList;
import java.util.Stack;

class Node{
    int data;
    ArrayList<Node> childer=new ArrayList<>();

}
public class A1IntroductionGenricTree {
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
        Display(root);
    }
    public static void Display(Node Root){
        String str=Root.data+"-->";
        for(Node child:Root.childer){
            str +=child.data+ ", ";
        }
        str +=".";
        System.out.println(str);
        for(Node child:Root.childer){
            Display(child);
        }
    }
}