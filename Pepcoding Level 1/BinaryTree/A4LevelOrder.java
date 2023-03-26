package com.company.PepCoding.BinaryTree;

import java.util.ArrayDeque;
import java.util.Queue;

public class A4LevelOrder {
    public static void main(String[] args) {
        Integer [] arr={50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
        Node root=Node.nodeContstructor(arr);
        Node.Display(root);
        levelorder(root);

    }
    public static void levelorder(Node node){
        Queue<Node> currentlevel=new ArrayDeque<>();
        Queue<Node> nextlevel=new ArrayDeque<>();
        currentlevel.add(node);
        while(currentlevel.size()>0){
            Node temp=currentlevel.remove();
            System.out.print(temp.data+" ");
            if(temp.left!=null){
                nextlevel.add(temp.left);
               // System.out.print(node.data+" "+currentlevel.size()+" ");

            }
            if(temp.right!=null){
                nextlevel.add(temp.right);
            }
            if(currentlevel.size()==0){
                System.out.println();
                currentlevel=nextlevel;
                nextlevel=new ArrayDeque<>();
            }

        }
    }
}
