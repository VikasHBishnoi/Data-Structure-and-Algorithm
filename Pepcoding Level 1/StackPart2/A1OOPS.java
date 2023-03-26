package com.company.PepCoding.StackPart2;

import java.net.PortUnreachableException;

public class A1OOPS {
    public static class person{
        int age;
        String name;
        void sayHI(){
            System.out.println("Hi "+ name+" your age is "+age);
        }
    }
    public static void swap1(person p1,person p2){
        person temp=p1;
        p1=p2;
        p2=temp;
        // here swap only withn this function as it dosn't return anything

        p1.sayHI();
        p2.sayHI();
    }
    public static void main(String[] args) {
        person p1 = new person();
        p1.age = 23;
        p1.name = "pooja";
        p1.sayHI();
        person p2=new person();
        p2.name="vikas";
        p2.age=24;
        System.out.println("Before Swap");
        p1.sayHI();
        p2.sayHI();

        System.out.println("After Swap");
        swap1(p1,p2);
        System.out.println("After Funciton");
        p1.sayHI();
        p2.sayHI();

    }
}
