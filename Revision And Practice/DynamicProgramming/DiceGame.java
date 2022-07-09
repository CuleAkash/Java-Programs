package DynamicProgramming;

import java.util.Scanner;

class DiceGame{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int length= sc.nextInt();
        int[] values= new int[length+1];
        for(int i=0;i<=length;i++){
            values[i]=sc.nextInt();
        } 
        int ans = harry(length,values);
        System.out.println(ans);
    }
    public static int harry(int input1,int[] input2){
        int[][] dp= new int[input1+1][input1+1];
        for(int i=0;i<=input1;i++){
            for(int j=0;j<=input1;j++){
                dp[i][j]=-1;
            }
        }
        return function(input2.length-1,input2,input1,dp);
    }
    

    private static int function(int i, int[] values, int length, int[][] dp) {
        if(length==0 || i==0){
            dp[i][length]=0;
            return dp[i][length];
        }
            if(dp[i][length]!=-1)
                return dp[i][length];
        int notTake= function(i-1, values, length,dp);
        int take = Integer.MIN_VALUE;
        if(length>=i){
            take= values[i] + function(i, values, length-i,dp);
        }
        return dp[i][length]= Math.max(take,notTake);
    }
}