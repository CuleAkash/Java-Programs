package LCS;

import java.util.Scanner;

public class ShortestCommonSupersequence {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String x= s.next();
		String y= s.next();
		int n= x.length();
		int m= y.length();
		int SCS= shortestCommonSupersequence(x,y,n,m);
		System.out.println(SCS);
		

	}

	private static int shortestCommonSupersequence(String x, String y, int n, int m) {
		return x.length()+y.length()-longestCommonSubsequence(x,y,m,n);//Apart from the longest common subsequence the other characters will be written once
	}

	private static int longestCommonSubsequence(String x, String y, int m, int n) {//Top-down Longest Common Subsequence
		if(n==0 || m==0) {
			return 0;
		}
		
		int[][] dp= new int[n+1][m+1];
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=m;j++) {
				if(i==0 || j==0) {
					dp[i][j]=0;
				}
				else if(x.charAt(i-1)==x.charAt(j-1)) {
					dp[i][j]=1+dp[i-1][j-1];
				}
				else {
					dp[i][j]= Math.max(dp[i][j-1], dp[i-1][j]);
				}
			}
		}
		return dp[n][m];
	}

}
