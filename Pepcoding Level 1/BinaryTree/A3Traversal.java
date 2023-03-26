package com.company.PepCoding.BinaryTree;

public class A3Traversal {
    public static void main(String[] args) {
        Integer [] arr={50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
        Node root=Node.nodeContstructor(arr);
        Node.Display(root);
        System.out.println();
        printpre(root);
        System.out.println();
        printpost(root);
        System.out.println();
        printin(root);

    }

    public static void printin(Node node){
        if(node==null){
            return;
        }
        printin(node.left);
        System.out.print(node.data+"  ");
        printin(node.right);
    }
    public static void printpost(Node node){
        if(node==null){
            return;
        }
        printpost(node.left);
        printpost(node.right);
        System.out.print(node.data+"  ");
    }
    public static void printpre(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.data+"  ");
        printpre(node.left);
        printpre(node.right);
    }

}
