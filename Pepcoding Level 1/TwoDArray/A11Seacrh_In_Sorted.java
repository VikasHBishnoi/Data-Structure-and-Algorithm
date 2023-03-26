package com.company.PepCoding.TwoDArray;

public class A11Seacrh_In_Sorted {
    public static void main(String[] args) {
        int[][] m = {{101, 103, 124, 145}, {113, 123,140, 160}, {120, 130, 149, 199}, {131, 141, 156, 234}};
        // square matrx is given
        A1Introductiontry.print(m);
        boolean fl=search(m,141);
        System.out.println(fl);
    }
    public static boolean search(int[][] m,int val){

        int i=0;
        int j=m[0].length-1;
        System.out.println(i+" "+j);
        while (i<m.length&&j>=0){
            System.out.println(i+" "+j);
            if(val==m[i][j]){
                System.out.println(val+" "+i+" "+j);
                return true;
            }
            else if(val<m[i][j]){
                j--;
            }
            else if(val>m[i][j]){
                i++;
            }
        }
        return false;
    }
}
