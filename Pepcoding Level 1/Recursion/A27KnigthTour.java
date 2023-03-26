package com.company.PepCoding.Recursion;
public class A27KnigthTour {
    public static void main(String[] args) {
        int n=5;
        int[][] che=new int[n][n];
        boolean[][] vis=new boolean[n][n];
        knighttour(n,che,2,2,1);
    }
    public static void chessprint(int[][] chess,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(chess[i][j]+" ");
            }
            System.out.println();
        }
        n=1;
    }
    public static void knighttour(int n,int[][] chess,int sr,int sc,int mov){
        if(sr<0|| sr>=n || sc<0 || sc>=n|| chess[sr][sc]!=0){
            return;
        }
        chess[sr][sc]=mov;
        if(mov==n*n){
            chessprint(chess,n);
            chess[sr][sc]=0;
            System.out.println();
            return;
        }
        knighttour(n,chess,sr-2,sc+1,mov+1);
        knighttour(n,chess,sr-1,sc+2,mov+1);
        knighttour(n,chess,sr+1,sc+2,mov+1);
        knighttour(n,chess,sr+2,sc+1,mov+1);
        knighttour(n,chess,sr+2,sc-1,mov+1);
        knighttour(n,chess,sr+1,sc-2,mov+1);
        knighttour(n,chess,sr-1,sc-2,mov+1);
        knighttour(n,chess,sr-2,sc-1,mov+1);
        chess[sr][sc]=0;
    }
}
