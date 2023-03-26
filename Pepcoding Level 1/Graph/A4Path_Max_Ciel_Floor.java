package com.company.PepCoding.Graph;

import java.util.ArrayList;

public class A4Path_Max_Ciel_Floor {
    static int min=Integer.MAX_VALUE;
    static String  minpath="";
    static int max=Integer.MIN_VALUE;
    static String  maxpath="";
    static int ciel=Integer.MAX_VALUE;
    static String cielpath="";
    static int floor=Integer.MIN_VALUE;
    static String floorpath="";
    public static void main(String[] args) {
        ArrayList<Edges>[] graph=new ArrayList[7];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edges>();
        }
        graph[0].add(new Edges(0,1,10));
        graph[0].add(new Edges(0,3,40));

        graph[1].add(new Edges(1,0,10));
        graph[1].add(new Edges(1,2,10));

        graph[2].add(new Edges(2,1,10));
        graph[2].add(new Edges(2,3,10));

        graph[3].add(new Edges(3,0,40));
        graph[3].add(new Edges(3,2,10));
        graph[3].add(new Edges(3,4,2));

        graph[4].add(new Edges(4,3,2));
        graph[4].add(new Edges(4,5,3));
        graph[4].add(new Edges(4,6,8));

        graph[5].add(new Edges(5,4,3));
        graph[5].add(new Edges(5,6,3));

        graph[6].add(new Edges(6,5,3));
        graph[6].add(new Edges(6,4,8));

        int sr=0;
        int ds=6;
        boolean[] visited=new boolean[graph.length];
        solve(graph,sr,ds,sr+" ",0,visited,39);
        System.out.println(minpath+" And Wt "+min);
        System.out.println(maxpath+" And wt "+max);
        System.out.println("Ciel  "+cielpath+" "+ciel);
        System.out.println("Floor  "+floorpath+" "+floor);
    }
    public static void solve(ArrayList<Edges>[] graph,int sr,int ds,String pathsofar,int wtpath,boolean[] visited,int ci){
        if(sr==ds){
            if(min>wtpath){
                min=wtpath;
                minpath=pathsofar;
            }
            if(max<wtpath){
                max=wtpath;
                maxpath=pathsofar;
            }
            if(ci<wtpath && ciel>wtpath){
                ciel=wtpath;
                cielpath=pathsofar;
            }
            if(ci>wtpath && floor<wtpath){
                floor=wtpath;
                floorpath=pathsofar;
            }
            return;
        }
        visited[sr]=true;
        for(Edges edge:graph[sr]){
            if(visited[edge.ng]==false){
                solve(graph,edge.ng,ds,pathsofar+ edge.ng+" ",wtpath+edge.we,visited,ci);
            }
        }
        visited[sr]=false;
    }
}
