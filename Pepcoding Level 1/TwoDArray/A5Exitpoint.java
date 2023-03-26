package com.company.PepCoding.TwoDArray;

public class A5Exitpoint {
    public static void main(String[] args) {
        int[][] m={{0,0,1,0},{1,0,1,1},{0,1,0,1}};
        exit(m);
        //A1Introductiontry.print(m);
    }
    public static int[] exit(int[][] m){
        int dir=0;
        int[] out=new int[2];
        int i=0;
        int j=0;
        while (i>=0&&i< m.length&&j>=0&&j<m[0].length){
            dir=(dir+m[i][j])%4;
            if(dir==0){
                j++;
            }
            else if(dir==1){
                i++;
            }
            else if(dir==2){
                j--;
            }
            else if(dir==3){
                i--;
            }

        }
        if(i<0){
            i=0;
        }
        else if(i>=m.length){
            i=m.length-1;
        }
        if(j<0){
            j=0;
        }
        else if(j>=m[0].length){
            j=m[0].length-1;
        }
        System.out.println(i);
        System.out.println(j);
        out[0]=i;
        out[1]=j;
        return out;
    }
}
