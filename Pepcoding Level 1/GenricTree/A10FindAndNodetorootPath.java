package com.company.PepCoding.GenricTree;

import java.util.ArrayList;
import java.util.Stack;

public class A10FindAndNodetorootPath {
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
        System.out.println(find(10,root));
        System.out.println(find(100,root));
        System.out.println(find(220,root));
        System.out.println();
        ArrayList<Integer> arr1=nodetoroot(100,root);
        printarr(arr1);
        System.out.println(" ");
        ArrayList<Integer> arr2=nodetoroot(30,root);
        printarr(arr2);
        System.out.println(" ");
        ArrayList<Integer> arr3=nodetoroot(120,root);
        printarr(arr3);
        System.out.println(" ");
        ArrayList<Integer> arr4=nodetoroot(700,root);
        printarr(arr4);
        System.out.println(" ");
        ArrayList<Integer> arr5=nodetoroot(60,root);
        printarr(arr5);
        System.out.println(" ");
     //   nodetoroot(20,root);
    }
    public static boolean find(int target,Node node){
        if(node.data==target){
            return true;
        }
        boolean output=false;
        for(Node child: node.childer){
            output=find(target,child);
            if(output==true){
                return true;
            }
        }
        return output;
    }
    public static ArrayList<Integer> nodetoroot(int target,Node node){
        ArrayList<Integer> arr=new ArrayList<>();
        if(node.data==target){
            arr.add(node.data);
            return arr;
        }

        for(Node Child:node.childer){
            arr=nodetoroot(target,Child);
            if(arr.size()>0){
                arr.add(node.data);
                return arr;
            }
        }

        return arr;
    }
    public static void printarr(ArrayList<Integer> arr){
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+"  ");
        }
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
