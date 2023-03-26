package com.company.PepCoding.BinaryTree;

import java.util.ArrayDeque;
import java.util.Queue;

public class A7PrintKLevelDown {
    public static void main(String[] args) {
        Integer [] arr={50,25,12,null,null,37,30,null,null,40,null,null,75,62,60,null,null,70,null,null,87,null,null};
        Node root=Node.nodeContstructor(arr);
        Node.Display(root);
        printklevel(root,2);
        System.out.println();
        pepApproac(root,2);
    }
    public static void pepApproac(Node node,int k){
        if(node==null || k<0){
            return;
        }
        if(k==0){
            System.out.print(node.data+" ");
        }
        pepApproac(node.left,k-1);
        pepApproac(node.right,k-1);
    }
    public static void printklevel(Node root,int k){
        Queue<pair> qu=new ArrayDeque<>();
        pair trpair=new pair(root,0);
        qu.add(trpair);
        System.out.println("DFdf"+qu.peek().node.data);
        //System.out.println(qu.size());
        while (qu.size()>0){
            pair temp=qu.remove();
            //System.out.println(temp.state);
            if(temp.state==k){
                System.out.print(temp.node.data+" ");
            }
            if(temp.node.left!=null){
                pair le=new pair(temp.node.left,temp.state+1);
                qu.add(le);
            }
            if(temp.node.right!=null){
                pair le=new pair(temp.node.right,temp.state+1);
                qu.add(le);
            }
        }
    }
}

