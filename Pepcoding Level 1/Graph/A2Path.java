package com.company.PepCoding.Graph;

import java.util.ArrayList;

public class A2Path {
    public static void main(String[] args) {

        ArrayList<Edges>[] graph=new ArrayList[7];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edges>();
        }
        graph[0].add(new Edges(0,1,10));
        graph[0].add(new Edges(0,3,10));

        graph[1].add(new Edges(1,2,10));
        graph[1].add(new Edges(1,3,10));

        graph[2].add(new Edges(2,1,10));
        graph[2].add(new Edges(2,3,10));

        graph[3].add(new Edges(3,0,10));
        graph[3].add(new Edges(3,2,10));
        graph[3].add(new Edges(3,4,10));

        graph[4].add(new Edges(4,3,10));
        graph[4].add(new Edges(4,5,10));
        graph[4].add(new Edges(4,6,10));

        graph[5].add(new Edges(5,4,10));
        graph[5].add(new Edges(5,6,10));

        graph[6].add(new Edges(6,5,10));
        graph[6].add(new Edges(6,4,10));

        int sr=0;
        int ds=6;
        boolean[] visited=new boolean[graph.length];
        System.out.println(haspath(graph,sr,ds,visited));
    }
    public static boolean haspath(ArrayList<Edges>[] graph,int sr,int ds,boolean[] visited){
        if(sr==ds){
            return true;
        }
        visited[sr]=true;
        for(Edges edge:graph[sr]){
            if((visited[edge.ng])==false){
                boolean nghaspath=haspath(graph,edge.ng,ds,visited);
                if(nghaspath){
                    return true;
                }
            }
        }
        return false;
    }
}

