package com.company.PepCoding.BinaryTree;

import java.util.ArrayList;

public class A8PrintKLevelFar {
    public static void main(String[] args) {
        Integer [] arr={50,25,12,204,null,null,null,37,30,null,null,40,19,null,null,null,75,62,null,70,null,null,87,null,null};
        Node root=Node.nodeContstructor(arr);
        Node.Display(root);
        nodetoroot(root,37);
        int k=0;
        for(int i=0;i<path.size();i++){
            if(i==0){
                printKLevelDown(path.get(i),k-i,null);
            }
            else{
                printKLevelDown(path.get(i),k-i,path.get(i-1));
            }
        }
    }
    static ArrayList<Node> path =new ArrayList<>();
    public static boolean nodetoroot(Node node,int data){
        if(node==null){
            return false;
        }

        if(node.data==data){
            path.add(node);
            return true;
        }

        boolean leftflag=nodetoroot(node.left,data);
        if(leftflag){
            path.add(node);
            return true;
        }

        boolean rigthflag=nodetoroot(node.right,data);
        if(rigthflag){
            path.add(node);
            return true;
        }

        return false;
    }
    public static void printKLevelDown(Node node, int k,Node blocker){
        if(node==null || k<0){
            return;
        }
        if(k==0){
            System.out.print(node.data+" ");
        }
        if(node.left!=blocker){
            printKLevelDown(node.left,k-1,blocker);
        }
        if(node.right!=blocker){
            printKLevelDown(node.right,k-1,blocker);
        }

    }
}
