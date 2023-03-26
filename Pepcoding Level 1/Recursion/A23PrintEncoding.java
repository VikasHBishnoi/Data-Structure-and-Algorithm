package com.company.PepCoding.Recursion;

public class A23PrintEncoding {
    public static void main(String[] args) {
        printEnco("12132350053","");
    }
    public static void printEnco(String Que,String Ans){
        if(Que.length()==0){
            System.out.println(Ans);
            return;
        }
        String st=Que.charAt(0)+"";
        int fi=toint(st);
        if(fi>0){
            fi--;
            char ch=(char) (fi+'a');
            printEnco(Que.substring(1),Ans+ch);
        }
        if(Que.length()>1){
            String sts=Que.substring(0,2);
            if(sts.charAt(0)!='0'){
                int se=toint(sts);
                se--;
                if(se<26){
                    char sech=(char) (se+'a');
                    printEnco(Que.substring(2),Ans+sech);
                }
            }
        }
    }
    public static int toint(String str){
        int no=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int el=ch-'0';
            no=(no*10)+el;
        }
//        if(no<26)
//        System.out.println("No "+no);
        return no;
    }

}
