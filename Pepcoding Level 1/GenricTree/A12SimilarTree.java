package com.company.PepCoding.GenricTree;

import java.util.Stack;

public class A12SimilarTree {
    public static void main(String[] args) {
        System.out.println("Ram Ram Sa");
        int[] arr={10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,140,-1,-1,-1};
        Stack<Node> st=new Stack<>();
        Node root=new Node();
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == -1) {
                st.pop();
            } else {
                Node t = new Node();
                t.data = arr[i];
                if (st.size() > 0) {
                    st.peek().childer.add(t);
                } else {
                    root = t;
                }
                st.push(t);
            }
        }
       // System.out.println(checkSimilar(root.childer.get(0),root.childer.get(2)));
        System.out.println(checkmirror(root,root));
    }
    public static boolean checkmirror(Node n1,Node n2){
        if(n1.childer.size()!=n2.childer.size()){
            return false;
        }
        for(int i=0;i<n1.childer.size();i++){
            int j=n1.childer.size()-i-1;
            Node ch1=n1.childer.get(i);
            Node ch2=n2.childer.get(j);
            System.out.println(ch1.data+"  "+ch2.data);
            boolean flag=checkmirror(ch1,ch2);
            if(flag==false){
                return false;
            }
        }
        return true;
    }
    public static boolean checkSimilar(Node node1, Node node2){

        if(node1.childer.size()!=node2.childer.size()){
            return false;
        }

        for(int i=0;i<node1.childer.size();i++){
            Node child1=node1.childer.get(i);
            Node child2=node2.childer.get(i);
            boolean check=checkSimilar(child1,child2);
            if(check==false){
                return false;
            }
        }
        return true;
    }

}
