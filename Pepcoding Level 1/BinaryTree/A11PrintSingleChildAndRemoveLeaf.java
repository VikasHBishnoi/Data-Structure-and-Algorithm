package com.company.PepCoding.BinaryTree;

import java.sql.SQLOutput;
import java.util.IllegalFormatFlagsException;

public class A11PrintSingleChildAndRemoveLeaf {
    public static void main(String[] args) {
        Integer [] arr={50,25,12,204,null,null,null,37,30,null,null,40,19,null,null,null,75,62,null,70,null,null,87,null,null};
        Node root=Node.nodeContstructor(arr);
        Node.Display(root);
        System.out.println();
        printSingle(root);
        System.out.println("Removed leaf");
        Node rem=remove(root);
        Node.Display(rem);
    }
    public static Node remove(Node node){
        if(node==null){
            return null;
        }
        if(node.left==null&& node.right==null){
            return null;
        }
        Node lf=remove(node.left);
        Node rf=remove(node.right);
        node.left= lf;
        node.right=rf;
        return node;
    }
    public static void printSingle(Node node){
        if(node==null){
            return;
        }
        if( (node.left==null&& node.right!=null) ||(node.left!=null&& node.right==null) ){
            System.out.print(node.data+" ");
        }
        printSingle(node.left);
        printSingle(node.right);

    }
}
