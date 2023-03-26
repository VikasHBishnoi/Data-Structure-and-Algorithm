package com.company.PepCoding.Recursion;

import java.util.ArrayList;

public class A16MazeJumpPartTwo {
    public static void main(String[] args) {
        ArrayList<String> out=mazejump(1,1,3,3);
        // this code when only 1,2,3 moves are terer
        for(int i=0;i<out.size();i++){
            System.out.println(out.get(i));
        }
    }
    public static ArrayList<String> mazejump(int sr,int sc,int dr,int dc){
        ArrayList<String > out=new ArrayList<>();
        if(sr==dr&&sc==dc){
            out.add("");
            return out;
        }
        // horizontal can be 1, dc-sc
        for(int ms=1;ms<=dc-sc;ms++){
            ArrayList<String> hi=mazejump(sr,sc+ms,dr,dc);
            String curr="h"+ms;
            out=addString(out,hi,curr);
        }
        // vertical
        for(int ms=1;ms<=dr-sr;ms++){
            ArrayList<String> vi=mazejump(sr+ms,sc,dr,dc);
            String curr="v"+ms;
            out=addString(out,vi,curr);
        }
        // diagonal
        for(int ms=1;ms<=Math.min(dr-sr,dc-sc);ms++){
            ArrayList<String> di=mazejump(sr+ms,sc+ms,dr,dc);
            String curr="d"+ms;
            out=addString(out,di,curr);
        }

        return out;
    }
    public static ArrayList<String> addString(ArrayList<String> out,ArrayList<String> till,String str){
        for(int i=0;i<till.size();i++){
            out.add(str+till.get(i));
        }
        return out;
    }
}
