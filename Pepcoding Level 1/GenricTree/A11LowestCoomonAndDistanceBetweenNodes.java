package com.company.PepCoding.GenricTree;

import java.util.ArrayList;
import java.util.Stack;

public class A11LowestCoomonAndDistanceBetweenNodes {
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
        //Display(root);
        System.out.println(Comman(90,110,root));
        System.out.println(Distance(30,110,root));


    }
    public static int Distance(int target1,int target2,Node node){
        ArrayList<Integer> arr1=nodetoroot(target1,node);
        ArrayList<Integer> arr2=nodetoroot(target2,node);
        int out=-1;
        int j=arr2.size()-1;
        for(int i=arr1.size()-1; (i>=0&&j>=0);i-- ,j--){
            if(arr1.get(i)!=arr2.get(j)){
                out=i+j+2;
                return out;
            }
        }
        return Math.max(arr1.size(),arr2.size())-Math.min(arr2.size(), arr1.size());
    }
    public static int Comman(int target1,int target2,Node node){
        ArrayList<Integer> arr1=nodetoroot(target1,node);
        ArrayList<Integer> arr2=nodetoroot(target2,node);
        int out=-1;
        int j=arr2.size()-1;
        for(int i=arr1.size()-1; (i>=0&&j>=0);i-- ,j--){
            if(i==0){
                out=arr1.get(1);
                break;
            }
            else if(j==0){
                out=arr2.get(1);
                break;
            }
            if(arr1.get(i-1)!=arr2.get(j-1)){
                out=arr1.get(i);
                break;
            }
        }
        return out;
    }

    public static ArrayList<Integer> nodetoroot(int target,Node node){
        ArrayList<Integer> arr=new ArrayList<>();
        if(node.data==target){
            arr.add(node.data);
            return arr;
        }

        for(Node Child:node.childer){
            arr=nodetoroot(target,Child);
            if(arr.size()>0){
                arr.add(node.data);
                return arr;
            }
        }

        return arr;
    }

    public static void Display(Node Root){
        String str=Root.data+"-->";
        for(Node child:Root.childer){
            str +=child.data+ ", ";
        }
        str +=".";
        System.out.println(str);
        for(Node child:Root.childer){
            Display(child);
        }
    }
}
