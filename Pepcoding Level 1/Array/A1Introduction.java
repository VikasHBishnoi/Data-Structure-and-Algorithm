package com.company.PepCoding.Array;

public class A1Introduction {
    public static void main(String[] args) {

        // this is first way to intilize
//        int[] marks;
//        marks =new int[5];

        // another way
        int[] learn=new int[6];

        // another way
        int[] marks={2,3,4,4,6};

        // how to print
        for (int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();

        int [] one =new int[3];
        one[0]=2;
        one[1]=6;
        one[2]=33;

        // shallow copy
        int [] two =one;
        // this change will in both array

       two[0]=200000;

        for (int i=0;i<one.length;i++){
            System.out.print(one[i]+" ");
        }
        System.out.println();
        for (int i=0;i<two.length;i++){
            System.out.print(two[i]+" ");
        }

    }
}
