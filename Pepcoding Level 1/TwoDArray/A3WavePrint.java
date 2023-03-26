package com.company.PepCoding.TwoDArray;

public class A3WavePrint {
    public static void main(String[] args) {
        int[][] m1={{1,2,3},{4,5,6}};
        int[][] m2={{7,8,23,45},{9,10,11,12},{11,12,2,4}};
        printWave(m2);
    }
    public static void printWave(int[][] m){

        int len=m.length;
        for(int i=0;i<m[0].length;i++){
            if(i%2==0){
                for(int j=0;j<m.length;j++){
                    System.out.print(m[j][i]+" ");
                }
            }
            else{
                for(int j=m.length-1;j>=0;j--){
                    System.out.print(m[j][i]+" ");
                }
            }


        }
    }
}
