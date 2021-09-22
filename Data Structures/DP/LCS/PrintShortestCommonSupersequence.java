package LCS;

import java.util.Scanner;

public class PrintShortestCommonSupersequence {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		String x= s.next();
		String y= s.next();
		
		printScS(x,y,x.length(),y.length());

	}

	private static void printScS(String x, String y, int n, int m) {
		if(n==0) {
			System.out.println(y);
		}
		
		if(m==0) {
			System.out.println(x);
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
		int i=n,j=m;
		String ans="";
		while(i>0 && j>0) {
			if(x.charAt(i-1)==y.charAt(j-1)) {//if both are same we consider the character only once
				ans= x.charAt(i-1)+ans;
				i--;
				j--;
			}
			else {
				if(dp[i-1][j]>dp[i][j-1]) {//if not same we also include that in the ans
					ans= x.charAt(i-1)+ans;//if we are moving up character in x is included
					i--;
				}
				else {
					ans= y.charAt(j-1)+ans;//if we are moving left character in y is included
					j--;
				}
			}
		}
		
		
		//now if any one string is still not empty we include all its remaining characters
		while(i>0) {
			ans= x.charAt(i-1)+ans;
			i--;
		}
		
		while(j>0) {
			ans= y.charAt(j-1)+ans;
			j--;
		}
		
		System.out.println(ans);
		
	}

}
