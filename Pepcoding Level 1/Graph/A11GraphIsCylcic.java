package com.company.PepCoding.Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class A11GraphIsCylcic {
    public static void main(String[] args) {
        ArrayList<Edges>[] graph=new ArrayList[7];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edges>();
        }
        graph[0].add(new Edges(0,1,10));
        graph[0].add(new Edges(0,3,10));

//        graph[1].add(new Edges(1,2,10));
        graph[1].add(new Edges(1,0,10));

//        graph[2].add(new Edges(2,1,10));
        graph[2].add(new Edges(2,3,10));

        graph[3].add(new Edges(3,0,10));
        graph[3].add(new Edges(3,2,10));
//        graph[3].add(new Edges(3,4,10));

//        graph[4].add(new Edges(4,3,10));
        graph[4].add(new Edges(4,5,10));
        graph[4].add(new Edges(4,6,10));

        graph[5].add(new Edges(5,4,10));
        graph[5].add(new Edges(5,6,10));

        graph[6].add(new Edges(6,5,10));
        graph[6].add(new Edges(6,4,10));
        ArrayDeque<Integer> qu=new ArrayDeque<>();
        boolean[] vis=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(vis[i]==false){
                qu.add(i);
                System.out.println(isCycle(vis,qu,graph));
                System.out.println(i);
            }
        }
    }
    public static boolean isCycle(boolean[] visited, ArrayDeque<Integer> qu, ArrayList<Edges>[] graph){

        while (qu.size()>0){
            int po=qu.remove();
            if(visited[po]==true){
                //System.out.println(po);
                return true;
            }
            visited[po]=true;
            for(Edges edg:graph[po]){
                if(visited[edg.ng]==false){
                    int te=edg.ng;
                    qu.add(te);
                }
            }
        }
        return false;
    }
}
