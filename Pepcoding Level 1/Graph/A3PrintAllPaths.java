package com.company.PepCoding.Graph;

import java.util.ArrayList;

public class A3PrintAllPaths {
    public static void main(String[] args) {
        ArrayList<Edges>[] graph=new ArrayList[7];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edges>();
        }
        graph[0].add(new Edges(0,1,10));
        graph[0].add(new Edges(0,3,40));

        graph[1].add(new Edges(1,0,10));
        graph[1].add(new Edges(1,2,10));

        graph[2].add(new Edges(2,1,10));
        graph[2].add(new Edges(2,3,10));

        graph[3].add(new Edges(3,0,40));
        graph[3].add(new Edges(3,2,10));
        graph[3].add(new Edges(3,4,2));

        graph[4].add(new Edges(4,3,2));
        graph[4].add(new Edges(4,5,3));
        graph[4].add(new Edges(4,6,8));

        graph[5].add(new Edges(5,4,3));
        graph[5].add(new Edges(5,6,3));

        graph[6].add(new Edges(6,5,3));
        graph[6].add(new Edges(6,4,8));

        int sr=0;
        int ds=6;
        boolean[] visited=new boolean[graph.length];
        printPaths(graph,sr,ds,"",visited,0);
    }
    public static void printPaths(ArrayList<Edges>[] graph,int sr,int ds,String Path,boolean[] visited,int wt){
        if(sr==ds){
            System.out.println(Path+ds + "  "+wt);
        }
        visited[sr]=true;
        for(Edges edge:graph[sr]){
            if(visited[edge.ng]==false){
                printPaths(graph,edge.ng,ds,Path+sr+" -- ",visited,wt+edge.we);
            }
        }
        visited[sr]=false;

    }
}
