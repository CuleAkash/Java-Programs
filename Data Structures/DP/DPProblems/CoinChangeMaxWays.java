package DPProblems;

import java.util.Scanner;

public class CoinChangeMaxWays {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int[] coins= new int[n];
		
		for(int i=0;i<n;i++) {
			coins[i]= s.nextInt();
		}
		
		int sum= s.nextInt();
		int ways= coinChange(coins,sum,n);
		System.out.println(ways);

	}

	private static int coinChange(int[] coins, int sum, int n) {
		//it is same as count subset sum to given sum but in unbounded kanpsack
		if(sum==0) {
			return 1;
		}
		
		if(n==0 && sum!=0) {
			return 0;
		}
		
		int[][] dp= new int[n+1][sum+1];
		
		for(int i=0;i<=n;i++) {
			dp[i][0]=1;
		}
		
		for(int i=1;i<=sum;i++) {
			dp[0][i]=0;
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sum;j++) {
				if(coins[i-1]<=j) {
					dp[i][j]= dp[i][j-coins[i-1]]+dp[i-1][j];
				}
				else {
					dp[i][j]= dp[i-1][j];
				}
			}
			
		}
		return dp[n][sum];
	}

}
