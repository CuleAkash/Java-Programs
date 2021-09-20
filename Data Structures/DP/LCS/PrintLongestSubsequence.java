package LCS;

import java.util.Scanner;

public class PrintLongestSubsequence {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String a= s.next();
		String b= s.next();
		
		printLongestSubsequence(a,b,a.length(),b.length());

	}

	private static void printLongestSubsequence(String a, String b, int n, int m) {
		if(n==0 || m==0) {
			return;
		}
		
		int[][] dp= new int[n+1][m+1];
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=m;j++) {
				if(i==0 || j==0) {
					dp[i][j]=0;
				}
				else if(a.charAt(i-1)==b.charAt(j-1)) {
					dp[i][j]= 1+ dp[i-1][j-1];
				}
				else {
					dp[i][j]= Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		
		
		String ans="";
		for(int i=n,j=m;i>0&&j>0;) {
			if(a.charAt(i-1)==b.charAt(j-1)) {
				ans= a.charAt(i-1)+ans;
				i--;
				j--;
			}
			else {
				if(dp[i-1][j]<dp[i][j-1]) {
					j--;
				}
				else {
					i--;
				}
			}
			
		}
		
		System.out.println(ans);
		
	}
	

}
