package LCS;

import java.util.Scanner;

public class MinimumNumberOfDeletionsToMakeStringPalindrome {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		String x= s.next();
		int minDeletions= minDeletions(x);
		System.out.println(minDeletions);

	}

	private static int minDeletions(String x) {
		int lps= lps(x);
		return x.length()-lps;
	}
	//No. of deletions are inversely proportional to the length of Palindromic subsequence
	//hence to get the minimum number of deletions we want the longest palindromic subsequence
	
	
	
	//function to get longest palindromic subsequence
	private static int lps(String x) {
		if(x.length()==0) {
			return 0;
		}
		
		String y="";
		for(int i=0;i<x.length();i++) {
			y= x.charAt(i)+y;
		}
		
		return lcs(x,y,x.length(),y.length());
	}
	
	private static int lcs(String x, String y, int n, int m) {
		if(n==0 || m==0) {
			return 0;
		}
		
		int[][] dp= new int[n+1][m+1];
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=m;j++) {
				if(i==0 || j==0) {
					dp[i][j]=0;
				}
				else if(x.charAt(i-1)==y.charAt(j-1)) {
					dp[i][j]= 1+ dp[i-1][j-1];
				}
				else {
					dp[i][j]= Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		return dp[n][m];
	}

}
