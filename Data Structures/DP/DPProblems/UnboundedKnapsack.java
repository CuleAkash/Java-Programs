package DPProblems;

import java.util.Scanner;

public class UnboundedKnapsack {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= s.nextInt();
		}
		int[] weights= new int[n];
		
		for(int i=0;i<n;i++) {
			weights[i]= s.nextInt();
		}
		
		int W= s.nextInt();
		int ans= unboundedKnapsack(arr,weights,n,W);
		System.out.println(ans);

	}

	private static int unboundedKnapsack(int[] arr,int[] weights, int n, int W) {
		if(n==0) {
			return 0;
		}
		
		if(W==0) {
			return 0;
		}
		
		int[][] dp= new int[n+1][W+1];
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=W;j++) {
				if(weights[i-1]<=j) {
					dp[i][j]= Math.max(arr[i-1]+dp[i][j-weights[i-1]], dp[i-1][j]);//if we include then we can again include the number and if dont its been processed
				}
				else {
					dp[i][j]= dp[i-1][j];
				}
			}
		}
		return dp[n][W];
		
	}

}
