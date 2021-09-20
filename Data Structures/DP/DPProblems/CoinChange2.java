package DPProblems;

import java.util.Scanner;

public class CoinChange2 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int n= s.nextInt();
		int[] coin= new int[n];
		
		for(int i=0;i<n;i++) {
			coin[i]= s.nextInt();
		}
		
		int sum= s.nextInt();
		int ans= coinChange2(coin,n,sum);
		System.out.println(ans);

	}

	private static int coinChange2(int[] coin, int n, int sum) {
		if(n==0) {
			return Integer.MAX_VALUE-1;
		}
		
		if(sum==0 && n!=0) {
			return 0;
		}
		
		int[][] dp= new int[n+1][sum+1];
		
		for(int i=0;i<=sum;i++) {
			dp[0][i]= Integer.MAX_VALUE-1;
		}
		
		for(int i=1;i<=n;i++) {
			dp[i][0]=0;
		}
		
		for(int j=1;j<=sum;j++) {
			if(j%coin[0]==0) {
				dp[1][j]= j/coin[0];
			}
			else {
				dp[1][j]= Integer.MAX_VALUE-1;
			}
		}
		
		for(int i=2;i<=n;i++) {
			for(int j=1;j<=sum;j++) {
				if(coin[i-1]<=j) {
					dp[i][j]= Math.min(1+dp[i][j-coin[i-1]], dp[i-1][j]);
				}
				else {
					dp[i][j]= dp[i-1][j];
				}
			}
		}
		
		return dp[n][sum];
		
		
	}

}
