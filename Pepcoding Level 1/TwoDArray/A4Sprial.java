package com.company.PepCoding.TwoDArray;

import java.util.ArrayList;

public class A4Sprial {
    public static void main(String[] args) {
        int[][] m2={{7,8,23,45},{9,10,11,12},{11,12,2,4}};
        ArrayList<Integer> li=spirallyTraverse(m2,3,4);
        // this code is for clockwise spirl
        // pepcoding done for anticockwise same logic is there
        for(int i=0;i<li.size();i++){
            System.out.print(li.get(i)+" ");
        }
    }
    public static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here
        int minrow=0;
        int mincol=0;
        int maxrow=matrix.length-1;
        int maxcol=matrix[0].length-1;
        ArrayList<Integer> out=new ArrayList<>();
        while((minrow<=maxrow && mincol<=maxcol)){
            ArrayList<Integer> temp=helper(matrix,minrow,mincol,maxrow,maxcol);
            out=mergeList(out,temp);
            // System.out.println("Round "+minrow+" "+mincol+" "+maxrow+" "+maxcol);
            if(minrow==maxrow){
                break;
            }
            if(maxcol==mincol){
                break;
            }
            minrow++;
            mincol++;
            maxrow--;
            maxcol--;
        }
        return out;

    }
    public static ArrayList<Integer> helper(int[][] m,int minrow,int mincol,int maxrow,int maxcol){
        ArrayList<Integer> li=new ArrayList<>();
        if(mincol==maxcol){
            for(int i=minrow;i<=maxrow;i++){
                li.add(m[i][mincol]);
            }
            return li;
        }
        if(minrow==maxrow){
            for(int i=mincol;i<=maxcol;i++){
                li.add(m[minrow][i]);
            }
            return li;
        }
        for(int i=mincol;i<maxcol;i++){
            li.add(m[minrow][i]);
        }
        for(int i=minrow;i<maxrow;i++){
            li.add(m[i][maxcol]);
        }
        for(int i=maxcol;i>mincol;i--){
            li.add(m[maxrow][i]);
        }
        for(int i=maxrow;i>minrow;i--){
            li.add(m[i][mincol]);
        }
        return li;
    }
    public static ArrayList<Integer> mergeList(ArrayList<Integer> main,ArrayList<Integer> help){
        for(int i=0;i<help.size();i++){
            main.add(help.get(i));
        }
        return main;
    }
}
