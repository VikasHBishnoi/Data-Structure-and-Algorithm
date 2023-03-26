package com.company.PepCoding.StackPart2;

public class A4BuildDynamicStack {
    public static class CustomDyanmicStack{
        int[] data;
        int counter;
        // it they index at which new element is added

        public CustomDyanmicStack(int capacity){
            data=new int[capacity];
            counter =0;
        }
        void push(int val){
            if (counter ==data.length){
                int[] newdata= new int[2*data.length];
                for (int i=0;i<data.length;i++){
                    newdata[i]=data[i];
                }
                data=newdata;
                // here data array will give refernce to new location
            }
            data[counter]=val;
            counter++;
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
        int top(){
            if (counter==0){
                System.out.println("Stack Underflow");
                return -1;
            }
            else {
                return data[counter-1];
            }
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
    }
    public static void main(String[] args) {

    }
}
