package com.company.PepCoding.Graph;

public class A7Island {
    public static void main(String[] args) {
        int[][] matrix={{0,0,0,1,1,1,1},
                        {1,0,0,1,1,0,1},
                        {1,0,1,1,1,1,1},
                        {0,1,1,0,1,0,1},
                        {0,0,0,1,0,1,1}};
        System.out.println(countIsland(matrix));
    }
    public static int countIsland(int[][] matrix){
        boolean[][] visited=new boolean[matrix.length][matrix[0].length];
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(visited[i][j]==false && matrix[i][j]==0){
                    travel(matrix,i,j,visited);
                    count++;
                    System.out.println(visited[i][j]+" "+i+" "+j);
                }
            }
        }
        return count;
    }
    public static void travel(int[][] matrix,int i,int j,boolean[][] visited){
        if(i<0 || j<0 || i>=matrix.length || j>=matrix[0].length){
            return;
        }
        if(matrix[i][j]==0 && visited[i][j]==false){
            visited[i][j]=true;
            travel(matrix,i,j+1,visited);
            travel(matrix,i+1,j,visited);
            travel(matrix,i,j-1,visited);
            travel(matrix,i-1,j,visited);
        }
    }

}
