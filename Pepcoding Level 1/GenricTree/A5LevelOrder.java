package com.company.PepCoding.GenricTree;

import javax.swing.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class A5LevelOrder {
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
        Leveloder(root);
        System.out.println("\nNow Linewise");
        Leveloderlinewise(root);
        System.out.println("\nNow LineWise Zig Zag");
        LeveloderZigZag(root);
    }
    public static void Leveloder(Node node){
        Queue<Node> qu= new ArrayDeque<>();
        qu.add(node);

        while (qu.size()>0){
            node=qu.remove();
            System.out.print(node.data+" ");
            for(Node chil:node.childer){
                qu.add(chil);
            }

        }
    }
    public static void Leveloderlinewise(Node node){
        Queue<Node> CurrentLevel=new ArrayDeque<>();
        Queue<Node> NextLevel=new ArrayDeque<>();
        CurrentLevel.add(node);
        while (CurrentLevel.size()>0){
            node=CurrentLevel.remove();
            System.out.print(node.data+" ");
            for(Node child:node.childer){
                NextLevel.add(child);
            }
            if(CurrentLevel.size()==0){
                System.out.println();
                while(NextLevel.size()>0){
                    CurrentLevel.add(NextLevel.remove());
                }
            }
        }
    }
    public static void LeveloderZigZag(Node node){
        Stack<Node> currentlevel=new Stack<>();
        Stack<Node> nextlevel=new Stack<>();
        currentlevel.push(node);
        int level=1;
        while (currentlevel.size()>0){
            node=currentlevel.pop();
            System.out.print(node.data+" ");
            if((level%2)==1){
                for(int i=0;i<node.childer.size();i++){
                    Node child=node.childer.get(i);
                    nextlevel.push(child);
                }
            }
            else{
                for(int i=node.childer.size()-1;i>=0;i--){
                    Node child=node.childer.get(i);
                    nextlevel.push(child);
                }
            }
            if(currentlevel.size()==0){
                System.out.println();
                currentlevel=nextlevel;
                nextlevel=new Stack<>();
                level++;
            }
        }

    }
}
