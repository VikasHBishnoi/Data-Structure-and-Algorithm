package com.company.PepCoding.TwoDArray;

public class A10SaddlePoint {
    public static void main(String[] args) {
        int[][] m = {{563, 245, 424, 345}, {153, 103, 701, 504}, {420, 190, 699, 159}, {130, 141, 564, 234}};
        // square matrx is given
        A1Introductiontry.print(m);
        sadde(m);
    }
    public static void sadde(int[][] m){
        for(int i=0;i<m.length;i++){
            int smj=0;
            for(int j=0;j<m[0].length;j++){
                if(m[i][smj]>m[i][j]){
                    smj=j;
                }
            }
            boolean flag=true;
            for(int k=0;k<m.length;k++){
                if(m[i][smj]<m[k][smj]){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                System.out.println(m[i][smj]);
                return;
            }

        }
    }
}
