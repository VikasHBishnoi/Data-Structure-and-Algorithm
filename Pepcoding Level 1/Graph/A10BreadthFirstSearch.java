package com.company.PepCoding.Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class A10BreadthFirstSearch {
    public static void main(String[] args) {
        ArrayList<Edges>[] graph=new ArrayList[7];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edges>();
        }
        graph[0].add(new Edges(0,1,10));
        graph[0].add(new Edges(0,3,10));

        graph[1].add(new Edges(1,2,10));
        graph[1].add(new Edges(1,0,10));

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
        ArrayDeque<pair> qu=new ArrayDeque<>();
        pair pt=new pair(3,"3 ");
        qu.add(pt);
        boolean[] vis=new boolean[7];
        bfs(vis,qu,graph);

    }
    public static void bfs(boolean[] visited, ArrayDeque<pair> qu,ArrayList<Edges>[] graph){
        while (qu.size()>0){
            pair po=qu.remove();
            if(visited[po.v]==true){
                System.out.println("b" +po.v+" "+po.psf);
                // continue means it will break current iteration and willl  continue from next iteration

                continue;

                // break means complete loop termintate

            }
            visited[po.v]=true;
            System.out.println(po.psf);
            for(Edges edg:graph[po.v]){
                if(visited[edg.ng]==false){
                    pair te=new pair(edg.ng,po.psf+" - "+ edg.ng);
                    qu.add(te);
                }
            }
        }
    }
}
class pair{
    int v;
    String psf;
    pair(int v,String psf){
        this.v=v;
        this.psf=psf;
    }
}
