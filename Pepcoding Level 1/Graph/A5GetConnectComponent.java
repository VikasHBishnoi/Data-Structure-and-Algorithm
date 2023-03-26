package com.company.PepCoding.Graph;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class A5GetConnectComponent {
    public static void main(String[] args) {
        ArrayList<Edges>[] graph=new ArrayList[7];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edges>();
        }
        graph[0].add(new Edges(0,1,10));
        graph[0].add(new Edges(0,5,10));
        graph[1].add(new Edges(1,0,10));

        graph[2].add(new Edges(2,3,10));

        graph[3].add(new Edges(3,2,10));

        graph[4].add(new Edges(4,5,10));
        graph[4].add(new Edges(4,6,10));

        graph[5].add(new Edges(5,6,10));
        graph[5].add(new Edges(5,4,10));
        graph[5].add(new Edges(5,0,10));

        graph[6].add(new Edges(6,5,10));
        graph[6].add(new Edges(6,4,10));
        boolean[] visited=new boolean[7];
        ArrayList<ArrayList<Integer>> ou=getConnected(graph,visited);
        for(int i=0;i<ou.size();i++){
            for(int j=0;j<ou.get(i).size();j++){
                System.out.print(ou.get(i).get(j)+"  ");
            }
            System.out.println();
        }
    }
    public static ArrayList<ArrayList<Integer>> getConnected(ArrayList<Edges>[] graph, boolean[] visited){
        ArrayList<ArrayList<Integer>> out=new ArrayList<>();
        for(int i=0;i<graph.length;i++){
            if(visited[i]==false){
                ArrayList<Integer> li=helper(graph,visited,i);
                out.add(li);
            }
        }
        return out;
    }
    public static ArrayList<Integer> helper(ArrayList<Edges>[] graph, boolean[] visited,int sr){
        ArrayList<Integer> li=new ArrayList<>();
        li.add(sr);
        visited[sr]=true;
        for(Edges edg:graph[sr]){
            if(visited[edg.ng]==false){
                ArrayList<Integer> temp=helper(graph,visited,edg.ng);
                for(int i=0;i<temp.size();i++){
                    li.add(temp.get(i));
                }
            }
        }
        return li;
    }

}
