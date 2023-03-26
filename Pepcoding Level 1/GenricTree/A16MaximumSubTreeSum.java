package com.company.PepCoding.GenricTree;

import java.util.Stack;

public class A16MaximumSubTreeSum {
    static int s=Integer.MIN_VALUE;
    static Node nodefff=new Node();
    public static void main(String[] args) {
        System.out.println("Ram Ram Sa");
        int[] arr={10,20,-50,-1,-60,-1,-1,30,-70,-1,80,-110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
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
        sum(root);
        System.out.println(nodefff.data);
        System.out.println(s);


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

    public static int sum(Node node){
        int SubSum=0;
        for(Node child:node.childer){
            SubSum=sum(child)+SubSum;
        }
        SubSum=SubSum+node.data;
        if(SubSum>s) {
            s = SubSum;
            nodefff=node;
//            System.out.println(nodefff.data);
//            System.out.println(s);
        }
       // SubSum=SubSum+node.data;
        return SubSum;
    }
}
