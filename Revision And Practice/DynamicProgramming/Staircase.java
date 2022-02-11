package DynamicProgramming;

import java.util.Scanner;

public class Staircase {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int ways= recursiveSol(n);
        ways= memoizedSol(n);
        ways= iterSol(n);
        System.out.println(ways);
    }

    private static int iterSol(int n) {
        int dp[]= new int[n+1];
        dp[0]=dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    private static int memoizedSol(int n) {
        int[] dp= new int[n+1];
        for(int i=0;i<=n;i++){
            dp[i]=-1;
        }
        return helperMem(n,dp);
    }

    private static int helperMem(int n, int[] dp) {
        if(n<=1){
            return 1;
        }

        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=helperMem(n-1, dp)+helperMem(n-2, dp);
        return dp[n];
    }

    private static int recursiveSol(int n) {
        if(n<=1){
            return 1;
        }

        return recursiveSol(n-1)+recursiveSol(n-2);
    }
}
