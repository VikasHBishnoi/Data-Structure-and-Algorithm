package com.company.PepCoding.BinaryTree;

public class A9LeafToRoot {
    public static void main(String[] args) {
        Integer [] arr={50,25,12,204,null,null,null,37,30,null,null,40,19,null,null,null,75,62,null,70,null,null,87,null,null};
        Node root=Node.nodeContstructor(arr);
        Node.Display(root);
        leaftoroot(root,"",0,142,142);
    }
    public static void leaftoroot(Node node,String path,int sum,int lo,int hi){
        if(node==null){
            return;
        }

        if(node.left==null && node.right==null){
            sum+=node.data;
            if(sum>=lo && sum<=hi){
                System.out.println(path+node.data);
            }
        }
        leaftoroot(node.left,path+node.data+" ",sum+node.data,lo,hi);
        leaftoroot(node.right,path+node.data+" ",sum+node.data,lo,hi);

    }
}
