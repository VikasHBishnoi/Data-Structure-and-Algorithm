package com.company.PepCoding.StackPart2;

public class A2Swap2 {
    public static class person{
        int age;
        String name;
        void sayHI(){
            System.out.println("Hi "+ name+" your age is "+age);
        }
    }
    public static void swap2(person p1,person p2){
        p1=new person();

        int age=p1.age;
        p1.age=p2.age;
        p2.age=age;

        p2=new person();
        String name=p1.name;
        p1.name= p2.name;
        p2.name=name;

//        p1.sayHI();
//        p2.sayHI();
    }
    public static void swap3(person p1,person p2){

    }
    public static void main(String[] args) {

        person p1 = new person();
        p1.age = 23;
        p1.name = "pooja";
       // p1.sayHI();
        person p2=new person();
        p2.name="vikas";
        p2.age=24;
        System.out.println("Before Swap");
        p1.sayHI();
        p2.sayHI();

        System.out.println("After Swap");
        swap2(p1,p2);
        System.out.println("After Funciton");
        p1.sayHI();
        p2.sayHI();
    }
}
