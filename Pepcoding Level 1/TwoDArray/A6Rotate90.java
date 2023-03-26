package com.company.PepCoding.TwoDArray;

public class A6Rotate90 {
    public static void main(String[] args) {
        int[][] m={{563,245,124,345},{153,803,701,504},{420,199,699,159},{130,141,564,234}};
        A1Introductiontry.print(m);
        m=mirror(m);
        System.out.println(" ");
        //A1Introductiontry.print(m);
        m=transpose(m);
        System.out.println("TR");
        A1Introductiontry.print(m);
    }
    public static int[][] mirror(int[][] m){
        for(int i=0;i<m.length/2;i++){
            int[] arr=m[i];
            m[i]=m[m.length-i-1];
            m[m.length-i-1]=arr;
        }
        return m;
    }
    public static int[][] transpose(int[][] m){
        for(int i=0;i<m.length;i++){
            for(int j=i+1;j<m[0].length;j++){
                m[i][j]=m[i][j]+m[j][i];
                m[j][i]=m[i][j]-m[j][i];
                m[i][j]=m[i][j]-m[j][i];
            }
        }
        return m;
    }
}
