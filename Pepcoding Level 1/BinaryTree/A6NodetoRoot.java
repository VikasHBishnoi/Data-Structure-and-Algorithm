package com.company.PepCoding.BinaryTree;

import java.util.ArrayList;

public class A6NodetoRoot {
    public static void main(String[] args) {
        Integer [] arr={50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
        Node root=Node.nodeContstructor(arr);
        Node.Display(root);
        boolean flag=nodetoroot(root,37);
        System.out.println(flag);
        for(int data:Arraylist){
            System.out.print(data+" ");
        }


    }
    static ArrayList<Integer> Arraylist =new ArrayList<>();
    public static boolean nodetoroot(Node node,int data){
        if(node==null){
            return false;
        }

        if(node.data==data){
            Arraylist.add(node.data);
            return true;
        }

        boolean leftflag=nodetoroot(node.left,data);
        if(leftflag){
            Arraylist.add(node.data);
            return true;
        }

        boolean rigthflag=nodetoroot(node.right,data);
        if(rigthflag){
            Arraylist.add(node.data);
            return true;
        }

        return false;
    }
}
