package DynamicProgramming;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int ans= fibMem(n);
        ans= fibIt(n);
        System.out.println(ans);
        s.close(); 
    }

    //Interative solution in O(1) space complexity
    private static int fibIt(int n) {
        int prev2=0;
        int prev1=1;

        for(int i=2;i<=n;i++){
            int curr= prev2+prev1;
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }

    private static int fibMem(int n) {
        int[] dp= new int[n+1];
        for(int i=0;i<=n;i++){
            dp[i]=-1;
        }
        return helper(n,dp);
    }

    private static int helper(int n, int[] dp) {
        if(n<=1)
        return n;

        if(dp[n]!=-1){
            return dp[n];
        }

        dp[n]=helper(n-1, dp)+helper(n-2, dp);

        return dp[n];
    }
}
