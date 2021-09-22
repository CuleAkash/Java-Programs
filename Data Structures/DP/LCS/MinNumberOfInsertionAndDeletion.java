package LCS;

import java.util.Scanner;

public class MinNumberOfInsertionAndDeletion {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String x= s.next();
		String y= s.next();
		
		 minNumber(x,y,x.length(),y.length());

	}

	private static void minNumber(String x, String y, int length, int length2) {
		System.out.println("No of Insertions are: "+(length2-lcs(x,y,length,length2)));
		System.out.println("No of deletions are: "+(length- lcs(x,y,length,length2)));
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
