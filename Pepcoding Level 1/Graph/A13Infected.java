package com.company.PepCoding.Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class A13Infected {
    public static void main(String[] args) {
        int n=7;
        ArrayList<Edges>[] graph=new ArrayList[n];
//        ArrayList<Edges> [] graphe=new ArrayList [n];
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

        boolean[] vis=new boolean [n];
        System.out.println(infected(graph,0,vis,3));

    }
    public static int infected(ArrayList<Edges>[] graph, int src, boolean[] visited, int time){
        ArrayDeque<VerLevel> qu=new ArrayDeque<>();
        VerLevel pt=new VerLevel(src,1);
        qu.add(pt);
        int count=0;
        while(qu.size()>0){
           VerLevel rem=qu.remove();
           if(visited[rem.v]==false){
               if(rem.level<=time){
                   count++;
               }
               else{
                   return count;
               }
               for(Edges ed:graph[rem.v]){
                   VerLevel z=new VerLevel(ed.ng,rem.level+1);
                   qu.add(z);
               }
           }
           visited[rem.v]=true;
        }
        return count;
    }
}
