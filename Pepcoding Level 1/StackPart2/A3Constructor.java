package com.company.PepCoding.StackPart2;

public class A3Constructor {
    public static class person{
        int age;
        String name;
        void sayHI(){
            System.out.println("Hi "+ name+" your age is "+age);
        }
        person(){

        }
        person(int age2,String name){
            this.age=age2;
            this.name=name;
            // here this age means Orignal age of person class

        }
    }
    public static void main(String[] args) {

        person p1=new person(30,"vikas");
        p1.sayHI();
    }
}
