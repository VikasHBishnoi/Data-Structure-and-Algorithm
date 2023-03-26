package com.company.PepCoding.Graph;

import java.util.ArrayList;

public class A6IsGraphConnected {
    public static void main(String[] args) {
        ArrayList<Edges>[] graph=new ArrayList[7];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edges>();
        }
        graph[0].add(new Edges(0,1,10));
        graph[0].add(new Edges(0,5,10));

        graph[1].add(new Edges(1,0,10));

        graph[2].add(new Edges(2,3,10));
        graph[2].add(new Edges(2,6,10));

        graph[3].add(new Edges(3,2,10));

        graph[4].add(new Edges(4,5,10));
        graph[4].add(new Edges(4,6,10));

        graph[5].add(new Edges(5,6,10));
        graph[5].add(new Edges(5,4,10));
        graph[5].add(new Edges(5,0,10));


        graph[6].add(new Edges(6,4,10));
        graph[6].add(new Edges(6,2,10));
        graph[6].add(new Edges(6,5,10));
        System.out.println(isCoonected(graph));
    }
    public static boolean isCoonected(ArrayList<Edges>[] graph){
        boolean[] visted=new boolean[graph.length];
        visite(graph,0,visted);
        for(int i=0;i<graph.length;i++){
            if(visted[i]==false){
                return false;
            }
        }
        return true;
    }
    public static void visite(ArrayList<Edges>[] graph,int sr,boolean[] visited){
        visited[sr]=true;
        for(Edges edges:graph[sr]){
            if(visited[edges.ng]==false){
                visite(graph,edges.ng,visited);
            }
        }
    }


}
