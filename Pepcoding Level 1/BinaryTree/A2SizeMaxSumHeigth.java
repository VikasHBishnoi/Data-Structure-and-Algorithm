package com.company.PepCoding.BinaryTree;
public class A2SizeMaxSumHeigth {
    public static int maximum=Integer.MIN_VALUE;
    public static void main(String[] args) {
        Integer [] arr={50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
        Node root=Node.nodeContstructor(arr);
        Node.Display(root);
        System.out.println(size(root));
        System.out.println(sum(root));
        System.out.println(max(root.left));
        System.out.println(heigth(root));
    }
    public static int size(Node node){
        if(node==null){
            return 0;
        }
        int cout=1;
        cout=size(node.left)+size(node.right)+cout;
        return cout;
    }
    public static int sum(Node node){
        if(node==null){
            return 0;
        }
        int sum=node.data;
        sum=sum(node.right)+sum(node.left)+sum;
        return sum;
    }
    public static int max(Node node){
        int maxvalue=Integer.MIN_VALUE;
        if(node==null){
            return maxvalue;
        }
        maxvalue=Math.max(max(node.left),max(node.right));
        maxvalue=Math.max(maxvalue,node.data);
        if(maxvalue>maximum){
            maximum=maxvalue;
        }
        return maxvalue;
    }
    public static int heigth(Node node){
        if(node==null){
            return -1;
        }
        int internalheigth=Math.max(heigth(node.left),heigth(node.right))+1;
        return internalheigth;
    }
}
