package com.company.PepCoding.GenricTree;

import java.util.Stack;

public class A9LineraizeEfficient {
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
        Linearizeingefficent(root);
        Display(root);

    }
    public static Node Linearizeingefficent(Node node){
        if(node.childer.size()==0){
            return node;
        }
       // Node tail=new Node();
        Node Lastkitail= Linearizeingefficent(node.childer.get(node.childer.size()-1));

        while(node.childer.size()>1){
            Node lastfront= node.childer.remove(node.childer.size()-1);
            Node SecondLast= Linearizeingefficent(node.childer.get(node.childer.size()-1));

            SecondLast.childer.add(lastfront);
        }
        return Lastkitail;
    }
    public static Node tailfinder(Node node){
        if(node.childer.size()==0){
            return node;
        }
        Node out= tailfinder(node.childer.get(0));
        return out;
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
