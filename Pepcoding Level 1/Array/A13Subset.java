package com.company.PepCoding.Array;

public class A13Subset {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        subset(arr);
    }
    public static void subset(int[] m){
        int len=m.length;
        int limtit=1<<len;
        System.out.println(limtit);
        //System.out.println("Empty");
        int i=0;
        while (i<limtit){

            String str="";
            int counter=i;
            for(int j=len-1;j>=0;j--){
                int rem=counter%2;
                counter=counter/2;
                if(rem==0){
                    str="-\t"+str;
                }
                else{
                    str=m[j]+"\t"+str;
                }
            }
            System.out.println(str);
            i++;
        }
    }

}
