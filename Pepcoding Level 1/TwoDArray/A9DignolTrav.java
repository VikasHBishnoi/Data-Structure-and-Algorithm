package com.company.PepCoding.TwoDArray;

public class A9DignolTrav {
    public static void main(String[] args) {
        int[][] m = {{563, 245, 124, 345}, {153, 803, 701, 504}, {420, 199, 699, 159}, {130, 141, 564, 234}};
        // square matrx is given
        A1Introductiontry.print(m);
        Diag(m);

    }
    public static void Diag(int[][] m){
        int len=m.length;
        for(int i=0;i<len;i++){
            int co=i;
            int ro=0;
            while (ro<len&& co<len){
                System.out.print(m[ro][co]+" ");
                ro++;
                co++;
            }
            System.out.println();
        }
    }

}
