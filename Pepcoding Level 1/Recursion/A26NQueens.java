package com.company.PepCoding.Recursion;
public class A26NQueens {
    public static void main(String[] args) {
        int n=4;
        int[][] chess=new int[n][n];
        PrintNque(chess,"",0);
    }
    public static void PrintNque(int[][] chess,String qsf,int row){
        if(row==chess.length){
            System.out.println(qsf);
            return;
        }
        for(int col=0;col<chess.length;col++){
            if(isSafe(chess,row,col)==true){
                chess[row][col]=1;
                PrintNque(chess,qsf+row+"-"+col+", ",row+1);
                chess[row][col]=0;
            }
        }
    }
    public static boolean isSafe(int[][] chess,int row,int col){
        for(int i=0;i<chess.length;i++){
            if(chess[i][col]==1){
                return false;
            }
        }
        int tr=row;
        int tc=col;
        while (tr>=0&&tr<chess.length && tc>=0 && tc<chess.length){
            if(chess[tr][tc]==1){
                return false;
            }
            tr--;
            tc--;
        }
        tr=row;
        tc=col;
        while (tr>=0&&tr<chess.length && tc>=0 && tc<chess.length){
            if(chess[tr][tc]==1){
                return false;
            }
            tr--;
            tc++;
        }
        return true;
    }
}
