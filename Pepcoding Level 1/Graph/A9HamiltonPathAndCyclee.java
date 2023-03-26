package com.company.PepCoding.Graph;

import java.util.ArrayList;
import java.util.HashSet;

public class A9HamiltonPathAndCyclee {
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
        graph[2].add(new Edges(2,5,10));

        graph[3].add(new Edges(3,0,10));
        graph[3].add(new Edges(3,2,10));
        graph[3].add(new Edges(3,4,10));

        graph[4].add(new Edges(4,3,10));
        graph[4].add(new Edges(4,5,10));
        graph[4].add(new Edges(4,6,10));

        graph[5].add(new Edges(5,4,10));
        graph[5].add(new Edges(5,6,10));
        graph[5].add(new Edges(5,2,10));

        graph[6].add(new Edges(6,5,10));
        graph[6].add(new Edges(6,4,10));

        HashSet<Integer> visited=new HashSet<>();
        int orsroc=0;
        int sr=0;
        hamltonin(graph,sr,visited,0+" ",orsroc);

    }
    public static void hamltonin(ArrayList<Edges>[] graph,int src,HashSet<Integer> visited,String pathsofar,int orsor){
        if(visited.size()==graph.length-1){
            System.out.print(pathsofar+" ");
            boolean fl=true;
            for(Edges edges:graph[src]){
                if(edges.ng==orsor){
                    System.out.println("Cyle ");
                    fl=false;
                    break;
                }
            }
            if(fl==true){
                System.out.println(" path ");
            }
            return;
        }

        visited.add(src);
        for(Edges edge:graph[src]){
            if(visited.contains(edge.ng)==false){
                hamltonin(graph,edge.ng,visited,pathsofar+" "+edge.ng,orsor);
            }
        }
        visited.remove(src);
    }

}
