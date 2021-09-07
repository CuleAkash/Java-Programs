package DPProblems;

import java.util.Scanner;

public class LCS {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str1= s.next();
		String str2= s.next();
		
		int ans= findLCS(str1,str2);
		System.out.println(ans);
		
		int ansMemoize= findLCSBetter(str1,str2);
		System.out.println(ansMemoize);
		
		int ansIterative= findLCSIterative(str1,str2);
		System.out.println(ansIterative);

	}
	
	
	//iterative method
	private static int findLCSIterative(String str1, String str2) {
		int[][] dp= new int[str1.length()+1][str2.length()+1];
		
		for(int i=0;i<dp.length;i++) {
			dp[i][dp[0].length-1]=0;
		}
		
		for(int i=0;i<dp[0].length;i++) {
			dp[dp.length-1][i]=0;
		}
		
		for(int i=dp.length-2;i>=0;i--) {
			for(int j=dp[0].length-2;j>=0;j--) {
				if(str1.charAt(i)==str2.charAt(j)) {
					dp[i][j]= 1+dp[i+1][j+1];
				}
				else {
					dp[i][j]= Math.max(dp[i+1][j], dp[i][j+1]);
				}
			}
		}
		return dp[0][0];
	}


	//memoized solution

	private static int findLCSBetter(String str1, String str2) {
		int[][] dp= new int[str1.length()+1][str2.length()+1];
		
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++) {
				dp[i][j]=-1;
			}
		}
		return findLCSBetter(str1, str2,0,0,str1.length(),str2.length(),dp);
	}
	
	
	private static int findLCSBetter(String str1, String str2, int i, int j, int n, int m, int[][] dp) {
		if(i==n || j==m) {
			return 0;
		}
		int myAns=0;
		if(str1.charAt(i)==str2.charAt(j)) {
			int smallAns;
			if(dp[i+1][j+1]==-1) {
				smallAns= findLCSBetter(str1, str2, i+1, j+1, n, m, dp);
				dp[i+1][j+1]=smallAns;
			}
			else {
				smallAns= dp[i+1][j+1];
			}
			myAns= 1+smallAns;
		}
		else {
			int smallAns1;
			int smallAns2;
			if(dp[i+1][j]==-1) {
				smallAns1= findLCSBetter(str1, str2, i+1, j, n, m, dp);
				dp[i+1][j]=smallAns1;
			}
			else {
				smallAns1= dp[i+1][j];
			}
			
			if(dp[i][j+1]==-1) {
				smallAns2= findLCSBetter(str1, str2, i, j+1, n, m, dp);
				dp[i][j+1]=smallAns2;
			}
			else {
				smallAns2 =dp[i][j+1];
			}
			myAns= Math.max(smallAns1, smallAns2);
			
		}
		
		return myAns;
	}


	//recursive solution
	private static int findLCS(String str1, String str2) {
		return findLCSHelper(str1,str2,0,0,str1.length()-1,str2.length()-1);
	}

	private static int findLCSHelper(String str1, String str2, int i, int j, int n, int m) {
		if(i>n || j>m) {
			return 0;
		}
		
		if(n==0 || m==0) {
			return 0;
		}
		//if two elements are same then it has to be the part of lcs
		if(str1.charAt(i)==str2.charAt(j)) {
			return 1+findLCSHelper(str1, str2, i+1, j+1, n, m);
		}
		//otherwise look for remaining strings
		else {
			int firstLCS= findLCSHelper(str1, str2, i+1, j, n, m);
			int secondLCS= findLCSHelper(str1, str2, i, j+1, n, m);
			return Math.max(firstLCS, secondLCS);
		}
	}

}
