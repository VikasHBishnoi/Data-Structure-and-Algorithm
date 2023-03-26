package com.company.PepCoding.TwoDArray;

public class A7ShellWiseRotate {
    public static void main(String[] args) {
        int[][] m = {{563, 245, 124, 345}, {153, 803, 701, 504}, {420, 199, 699, 159}, {130, 141, 564, 234}};
//        A1Introductiontry.print(m);
        shellroate(m,1,4);

    }
    public static int[] shellroate(int[][] m,int s,int r){
        int rowlen=m.length;
        int collen=m[0].length;
        int rowmin=s-1;
        int rowmax=rowlen-s-1;
        int colmin=s-1;
        int colmax=collen-s-1;


        return m[0];
    }
    public static int[] fillone(int[][] m,int s){
        int rowmin=s-1;
        int rowmax=m.length-s-1;
        int colmin=s-1;
        int colmax=m[0].length-s-1;


        return m[0];
    }
    public static int[] roateoned(int[] arr,int r){
        int len=arr.length;
        System.out.println(len);
        r=((r%len)+len)%len;
        arr=reverse(arr,0,len-r-1);
        arr=reverse(arr,len-r,len-1);
        arr=reverse(arr,0,len-1);
        return arr;
    }
    public static int[] reverse(int arr[],int lo,int hi){
        while (lo<hi){
            int temp=arr[lo];
            arr[lo]=arr[hi];
            arr[hi]=temp;
            lo++;
            hi--;
        }
        return arr;

    }
}
