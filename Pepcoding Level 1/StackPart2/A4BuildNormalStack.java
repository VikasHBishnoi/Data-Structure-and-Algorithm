package com.company.PepCoding.StackPart2;

public class A4BuildNormalStack {
    public static class CustomStack{
        int[] data;
        int counter;
        // it they index at which new element is added

        public CustomStack(int capacity){
            data=new int[capacity];
            counter =0;
        }
        int size(){
            int size= counter;
            return size;
        }
        void display(){
            for (int i = counter-1;i>=0;i--){
                System.out.print(data[i]+" ");
            }
            System.out.println();
        }
        void push(int val){
            if (counter ==data.length-1){
                System.out.println("Stack Overflow");
            }
            else {
                data[counter]=val;
                counter++;
            }
        }

        int top(){
            if (counter==0){
                System.out.println("Stack Underflow");
                return -1;
            }
            else {
                return data[counter-1];
            }
        }
        int pop(){
            if (counter==0){
                System.out.println("Stack Underflow");
                return -1;
            }
            else {
                int val= data[counter-1];
                counter--;
                return val;

            }
        }


    }
    public static void main(String[] args) {

    }
}
