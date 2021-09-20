package LCS;

import java.util.Scanner;

public class LongestCommonSubstring {

	public static void main(String[] args) {
		//We have to return the length of the longest common substring
		//Substring is grp of continuous elements in the string
		
		Scanner s= new Scanner(System.in);
		String a= s.next();
		String b= s.next();
		
		int ans= longestCommonSubstring(a,b);
		System.out.println(ans);

	}

	private static int longestCommonSubstring(String a, String b) {
		if(a.length()==0 || b.length()==0) {
			return 0;
		}
		int n=a.length();
		int m= b.length();
		
		int[][] dp= new int[n+1][m+1];
		int max= 0;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i==0 || j==0) {
					dp[i][j]=0;
				}
				else if(a.charAt(i-1)==b.charAt(j-1)) {
					dp[i][j]=1+dp[i-1][j-1];
					max= Math.max(max,dp[i][j]);//Compare the length of the present substring and the length of previous substring
				}
				else {
					dp[i][j]=0;
				}
			}
		}
		return max;
	}

}
