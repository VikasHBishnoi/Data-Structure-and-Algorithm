package com.company.PepCoding.TwoDArray;

public class A2MatrixMulpication {
    public static void main(String[] args) {
        int[][] m1={{1,2,3},{4,5,6}};
        int[][] m2={{7,8,23,45},{9,10,11,12},{11,12,2,4}};
        int[][] ans=multiply(m1,m2);
        A1Introductiontry.print(m1);
        A1Introductiontry.print(m2);
        A1Introductiontry.print(ans);
    }
    public static int[][] multiply(int[][] matrix1,int[][] matrix2){
        int row1=matrix1.length;
        int col2=matrix2[0].length;
        int[][] out=new int[row1][col2];
        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
                int sum=0;
                for(int k=0;k<matrix1[0].length;k++){
                    sum=sum+(matrix1[i][k]*matrix2[k][j]);
                    System.out.println(sum);
                }
                out[i][j]=sum;
            }
        }
        return out;
    }
}
