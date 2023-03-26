package com.company.PepCoding.LinkedList;

public class A2DataMember {
    public static class Node{
        int data;
        Node next;
    }
    public static class LinkdedList{
        Node head;
        Node tail;
        int size;

        int size(){
            return size;
        }
        public void display(){
          Node tempor=head;
          while(tempor !=null){
              System.out.println(tempor.data);
              tempor=tempor.next;
          }
          System.out.println();
        }
        public void addLast(int datavalue){
            Node temp= new Node();
            temp.data=datavalue;
            temp.next=null;
            if (size==0){
                head=tail=temp;
            }
            else {
                tail.next=temp;
                tail=temp;
            }
            size++;

        }
        public void removefirst(){
            if (size==0){
                System.out.println("Sorry guys its empty");
            }
            else if(size==1) {
                // my way correct but more good way is next
//                Node temp=new Node();
//                temp=head.next;
//                head=temp;
//                tail=temp;
//                size--;

                head=tail=null;
                size--;
            }
            else{
                Node temp=new Node();
                temp=head.next;
                head=temp;
                size--;
            }
        }
        public int getFirst(){
            if(size==0){
                System.out.println("List is empty");
                return -1;
            }
            else{
                int r=head.data;
                return r;
            }
        }
        public int getLast(){
            int r=tail.data;
            return r;
        }
        public int getAt(int ind){
            Node temp=new Node();
            int re=-1;
            if(ind>=size || ind<0){
                System.out.println("Opps index out of bound");
            }
            else{
                temp=head;
                for(int i=1;i<=ind;i++){
                    temp=temp.next;
                }
                re=temp.data;
            }

            return  re;
        }
        public void addFirst(int val){
            Node temp=new Node();
            temp.data=val;
            temp.next=head;
            if(size==0){
                head=temp;
                tail=temp;
            }
            else{
                head=temp;
            }
            size++;
        }
        public void addAtindex(int ind,int val){
            // need to code;
            if(ind<0 || ind >=size){
                System.out.println("Invalid arrgument");
            }
            else if(ind==0){
                addFirst(val);
            }
            else if(ind==size){
                addLast(val);
            }
            else{
                Node newnode=new Node();
                newnode.data=val;
                Node temp=new Node();
                temp=head;
                for(int i=0;i<ind-1;i++){
                    temp=temp.next;
                }
                newnode=temp.next;
                temp.next=newnode;
                // need to do more
                size++;
            }
        }
        public void removeLast(){
            if(size<=1){
                removefirst();
            }
            else{
                Node tem=new Node();
                tem=head;
                for(int i=1;i<size-1;i++){
                    tem=tem.next;
                }
                tem.next=null;
                size--;
            }

        }
        public void removeAt(int ind){
            if(ind<0 || ind>=size){
                System.out.println("Invalid argument");
            }
            else if(ind==0){
                removefirst();
            }
            else if(ind==size-1){
                removeLast();
            }
            else{
                Node temp=new Node();
                temp=head;
                for(int i=1;i<ind;i++){
                    temp=temp.next;
                }
                Node netem=new Node();
                netem=temp.next;
                netem=netem.next;
                temp.next=netem;
                size--;
            }
        }

        public void reverseLink(){
            // need to code;;;
        }


    }
    public static void main(String[] args) {

    }
}
