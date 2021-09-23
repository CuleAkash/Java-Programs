package LCS;

import java.util.Scanner;

public class LongestRepeatingSubsequence {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str= s.next();
		int ans= longestRepeatingSubsequence(str);
		System.out.println(ans);

	}

	private static int longestRepeatingSubsequence(String str) {
		//Duplicating the given string to find the LCS
		String a= new String(str);
		String b= new String(str);
		System.out.println(a);
		//Now we have to find LCS of both but with a restriction that we include character into the LCS only if their indices are different
		return lcsModified(a,b,a.length());
	}

	private static int lcsModified(String a, String b, int n) {
		if(n==0) {
			return 0;
		}
		
		int[][] dp= new int[n+1][n+1];
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i==0 || j==0) {
					dp[i][j]=0;
				}
				else if(a.charAt(i-1)==b.charAt(j-1) && i!=j) {//Including into the LCS if two characters are same and their indices are no same
					dp[i][j]= 1+ dp[i-1][j-1];
				}
				else {
					dp[i][j]= Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		
//		System.out.println(dp[n][n]);
		return dp[n][n];
	}

}
