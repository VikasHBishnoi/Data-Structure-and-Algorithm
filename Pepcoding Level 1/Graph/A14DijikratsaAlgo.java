package com.company.PepCoding.Graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class A14DijikratsaAlgo {
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
        graph[4].add(new Edges(4,6,8));

        graph[5].add(new Edges(5,4,3));
        graph[5].add(new Edges(5,6,4));

        graph[6].add(new Edges(6,5,4));
        graph[6].add(new Edges(6,4,8));
        boolean[] visited=new boolean[7];
        System.out.println(dijikstra(graph,0,6,visited));
    }
    public static int dijikstra(ArrayList<Edges>[] graph,int sr,int ds,boolean[] visted){
        PriorityQueue<pairweigth> pqu=new PriorityQueue<>();
        pairweigth t=new pairweigth(sr,0);
        pqu.add(t);
        while (pqu.size()>0){
            pairweigth pt=pqu.remove();

            if(visted[pt.v]){
                continue;
            }
            visted[pt.v]=true;
            for(Edges ed:graph[pt.v]){
                if(visted[ed.ng]==false){
                    pairweigth adpt=new pairweigth(ed.ng,ed.we+pt.wttill);
                    pqu.add(adpt);
                }
            }
            if(pt.v==ds){
                return pt.wttill;
            }

        }

        return -1;
    }
}
class pairweigth implements Comparable<pairweigth> {
    int v;
    int wttill;
    pairweigth(int v, int wttill){
        this.v=v;
        this.wttill=wttill;
    }
    public int compareTo(pairweigth pt){
        return this.wttill-pt.wttill;
    }
}
