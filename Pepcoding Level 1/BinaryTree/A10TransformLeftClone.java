package com.company.PepCoding.BinaryTree;

public class A10TransformLeftClone {
    public static void main(String[] args) {
        Integer [] arr={50,25,12,204,null,null,null,37,30,null,null,40,19,null,null,null,75,62,null,70,null,null,87,null,null};
        Node root=Node.nodeContstructor(arr);
        Node.Display(root);
        Node ner=Trlc(root);
        System.out.println("Df");
        Node.Display(ner);
        System.out.println("Let's check");
        Node reverse=ReverseTrasnfor(ner);
        Node.Display(reverse);
    }
    public static Node ReverseTrasnfor(Node node){
        if(node==null){
            return null;
        }
        node.left=node.left.left;
        Node lf=ReverseTrasnfor(node.left);
        Node rf=ReverseTrasnfor(node.right);
        return node;
    }
    public static Node Trlc(Node node){
        if(node==null){
            return null;
        }
        Node lf=Trlc(node.left);
        Node rf=Trlc(node.right);
        Node nodcpoy=new Node(node.data,lf,null);
        node.left=nodcpoy;
        node.right=rf;
        return node;
    }
}
