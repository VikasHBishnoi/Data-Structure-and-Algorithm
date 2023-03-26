package com.company.PepCoding.Graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class A15PrimeSAlgorithm {
    public static void main(String[] args) {
        ArrayList<Edges>[] graph=new ArrayList[7];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edges(0,1,10));
        graph[0].add(new Edges(0,3,40));

        graph[1].add(new Edges(1,2,10));
        graph[1].add(new Edges(1,3,10));

        graph[2].add(new Edges(2,1,10));
        graph[2].add(new Edges(2,3,10));

        graph[3].add(new Edges(3,0,40));
        graph[3].add(new Edges(3,2,10));
        graph[3].add(new Edges(3,4,2));

        graph[4].add(new Edges(4,3,2));
        graph[4].add(new Edges(4,5,3));
        graph[4].add(new Edges(4,6,2));

        graph[5].add(new Edges(5,4,3));
        graph[5].add(new Edges(5,6,3));

        graph[6].add(new Edges(6,5,3));
        graph[6].add(new Edges(6,4,2));
        boolean[] visited=new boolean[7];
        primealgo(graph,visited);
    }
    public static void primealgo(ArrayList<Edges>[] graph, boolean visited[]){
        pairtwo pt=new pairtwo(0,0,-1);
        PriorityQueue<pairtwo> pqu=new PriorityQueue<>();
        pqu.add(pt);
        while (pqu.size()>0){
            pairtwo rem=pqu.remove();
            if(visited[rem.v]){
                continue;
            }
            if(rem.Acv!=-1){
                System.out.println(""+rem.v+" "+rem.wtedge+" "+rem.Acv);
            }
            visited[rem.v]=true;
            for(Edges ed:graph[rem.v]){
                if(visited[ed.ng]==false){
                    pairtwo ad=new pairtwo(ed.ng,ed.we,rem.v);
                    pqu.add(ad);
                }
            }
        }
    }
}
class pairtwo implements Comparable<pairtwo> {
    int v;
    int wtedge;
    int Acv;
    pairtwo(int v, int wtedge,int Acv){
        this.v=v;
        this.wtedge=wtedge;
        this.Acv=Acv;
    }
    public int compareTo(pairtwo pt){

        return this.wtedge-pt.wtedge;
    }
}
