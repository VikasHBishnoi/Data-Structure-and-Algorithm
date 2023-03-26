package com.company.PepCoding.Graph;

import java.util.ArrayList;

public class A8PerfectFriends {
    public static void main(String[] args) {
        ArrayList<Edges>[] graph=new ArrayList[7];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edges>();
        }
        graph[0].add(new Edges(0,1,10));

        graph[1].add(new Edges(1,0,10));

        graph[2].add(new Edges(2,3,10));

        graph[3].add(new Edges(3,2,10));

        graph[4].add(new Edges(4,5,10));
        graph[4].add(new Edges(4,6,10));

        graph[5].add(new Edges(5,6,10));
        graph[5].add(new Edges(5,4,10));

        graph[6].add(new Edges(6,4,10));
        graph[6].add(new Edges(6,5,10));
        boolean[] visited=new boolean[7];
        ArrayList<ArrayList<Integer>> li=A5GetConnectComponent.getConnected(graph,visited);
        int count=0;
        for(int i=0;i<li.size();i++){
            for(int j=i+1;j<li.size();j++){
                int pr=li.get(i).size()*li.get(j).size();
                count+=pr;
            }
        }
        System.out.println(count);
    }

}
