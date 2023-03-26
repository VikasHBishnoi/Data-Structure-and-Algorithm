package com.company.PepCoding.Graph;

import java.util.ArrayList;

public class A1IntroductionToGraphs {
    public static void main(String[] args) {
        ArrayList<Edges> [] graph=new ArrayList[7];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edges>();
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

        graph[6].add(new Edges(6,5,3));
        graph[6].add(new Edges(6,4,8));

        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].size();j++){
                System.out.print("Sr " +graph[i].get(j).sr+" Ng "+graph[i].get(j).ng+" Wt " +graph[i].get(j).we +"  ");
            }
            System.out.println();
        }

    }
}
class Edges{
    int sr;
    int ng;
    int we;
    Edges(int sr,int ng,int we){
        this.sr=sr;
        this.ng=ng;
        this.we=we;
    }
}
