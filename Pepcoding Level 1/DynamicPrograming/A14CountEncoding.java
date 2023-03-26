package com.company.PepCoding.DynamicPrograming;

public class A14CountEncoding {
    public static void main(String[] args) {
        System.out.println(count_encode("321"));
    }
    public static int count_encode(String s){
        int len=s.length();
        int[] dp=new int[len+1];
        dp[0]=1;
        if(s.charAt(0)=='0'){
            return 0;
        }
        dp[1]=1;
        for(int i=2;i<=len;i++){
            char ch=s.charAt(i-1);
            if(ch!='0'){
                dp[i]=dp[i-1];
            }
            int no=Integer.parseInt(s.substring(i-2,i));
            System.out.println(no);
            if(no<=26 && s.charAt(i-2)!='0'){
                dp[i]+=dp[i-2];
            }
        }
        return dp[len];
    }
}
