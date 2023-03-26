package com.company.PepCoding.Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class A12GraphBipartite {
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

        int[] vis=new int[n];
        Arrays.fill(vis,-1);
        for(int i=0;i<graph.length;i++){
            if(vis[i]==-1){
                boolean isbipa=checkBipartite(graph,i,vis);
                if(isbipa==false){
                    System.out.println("false"+i);
                    return;
                }
            }
        }
        System.out.println(true);
    }
    public static boolean checkBipartite(ArrayList<Edges>[] graph, int src,int[] visited){
        ArrayDeque<VerLevel> qu=new ArrayDeque<>();
        VerLevel pt=new VerLevel(src,0);
        qu.add(pt);
        while(qu.size()>0){
            VerLevel cu=qu.remove();
            if(visited[cu.v]!=-1){
                // lets code here
                if(cu.level!= visited[cu.v]){
                    return false;
                }
            }
            else{
                visited[cu.v]=cu.level;
            }
            for(Edges e:graph[cu.v]){
                if(visited[e.ng]==-1){
                    VerLevel edg=new VerLevel(e.ng,cu.level+1);
                    qu.add(edg);
                }
            }

        }
        return true;
    }
}
class VerLevel{
    int v;
    int level;
    VerLevel(int v,int level){
        this.v=v;
        this.level=level;
    }
}
