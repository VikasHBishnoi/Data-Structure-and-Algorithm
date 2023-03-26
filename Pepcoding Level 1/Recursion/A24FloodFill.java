package com.company.PepCoding.Recursion;

public class A24FloodFill {
    public static void main(String[] args) {
        int n=4;
        int m=6;
        int[][] grid={{0,1,1,0,0,0},{0,0,0,1,0,0},{0,0,0,0,1,0},{0,0,0,0,0,0}};
        boolean[][] visited=new boolean[n][m];
        floodfill(0,0,n,m,"",grid,visited);
    }
    public static void floodfill(int r,int c,int n,int m,String path,int[][] grid,boolean[][] visited){
        if(r<0 || c<0 || r>=n || c>=m || grid[r][c]==1 || visited[r][c]==true){
            return;
        }
        if(r==n-1 && c==m-1){
            System.out.println(path);
            return;
        }
//        System.out.println(path);
        visited[r][c]=true;
        floodfill(r-1,c,n,m,path+"t",grid,visited);
        floodfill(r,c-1,n,m,path+"l",grid,visited);
        floodfill(r+1,c,n,m,path+"d",grid,visited);
        floodfill(r,c+1,n,m,path+"r",grid,visited);
        visited[r][c]=false;
    }
}
