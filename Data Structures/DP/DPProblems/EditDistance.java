package DPProblems;

import java.util.*;

public class EditDistance {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1= s.next();
		String s2= s.next();
		
		int ans = editDistance(s1,s2);
		System.out.println(ans);
		
		int ansMemoize= editDistanceMemoize(s1, s2);
		System.out.println(ansMemoize);
		
		int ansIterate= editDistanceIterate(s1,s2);
		System.out.println(ansIterate);

	}
	
	
	
	
	//iterative solution
	private static int editDistanceIterate(String s1, String s2) {
		int[][] dp= new int[s1.length()+1][s2.length()+1];
		int n= s1.length();
		int m= s2.length();
		
		for(int i=0;i<=n;i++) {
			dp[i][m]=n-i;
		}
		
		for(int i=0;i<=m;i++) {
			dp[n][i]=m-i;
		}
		
		for(int i=n-1;i>=0;i--) {
			for(int j=m-1;j>=0;j--) {
				if(s1.charAt(i)==s2.charAt(j)) {
					dp[i][j]=dp[i+1][j+1];
				}
				else {
					int insert=dp[i][j+1];
					int replace= dp[i+1][j+1];
					int delete= dp[i+1][j];
					
					dp[i][j]=1+ Math.min(Math.min(replace, insert), delete);
				}
			}
		}
		return dp[0][0];
	}










	//memoized  solution
	private static int editDistanceMemoize(String s1, String s2) {
		int[][] dp= new int[s1.length()+1][s2.length()+1];
		
		for(int i=0;i<=s1.length();i++) {
			for(int j=0;j<=s2.length();j++) {
				dp[i][j]=-1;
			}
		}
		
		return editDistanceMemoize(s1, s2,0,0,s1.length(),s2.length(),dp);
	}



	private static int editDistanceMemoize(String s1, String s2, int i, int j, int n, int m, int[][] dp) {
		if(i==n) {
			return m-j;
		}
		
		if(j==m) {
			return n-i;
		}
		
		int myAns;
		
		if(s1.charAt(i)==s2.charAt(j)) {
			int smallAns;
			if(dp[i+1][j+1]==-1) {
				smallAns= editDistanceMemoize(s1, s2, i+1, j+1, n, m, dp);
				dp[i+1][j+1]=smallAns;
			}
			else {
				smallAns= dp[i+1][j+1];
			}
			myAns=smallAns;
		}
		else {
			int insert=0;
			int delete=0;
			int replace=0;
			
			if(dp[i+1][j]==-1) {
				delete= editDistanceMemoize(s1, s2, i+1, j, n, m, dp);
				dp[i+1][j]=delete;
			}
			else {
				delete=dp[i+1][j];
			}
			
			if(dp[i+1][j+1]==-1) {
				replace= editDistanceMemoize(s1, s2, i+1, j+1, n, m, dp);
				dp[i+1][j+1]=replace;
			}
			else {
				replace=dp[i+1][j+1];
			}
			
			if(dp[i][j+1]==-1) {
				insert= editDistanceMemoize(s1, s2, i, j+1, n, m, dp);
				dp[i][j+1]=insert;
			}
			else {
				insert=dp[i][j+1];
			}
			
			myAns= 1+ Math.min(replace, Math.min(insert, delete));
			
			
		}
		return myAns;
	}



	//recursive solution
	private static int editDistance(String s1, String s2) {
		return editDistance(s1, s2,0,0,s1.length(),s2.length());
	}

	private static int editDistance(String s1, String s2, int i, int j, int n, int m) {
		if(i==n) {
			return m-j;
		}
		
		if(j==m) {
			return n-i;
		}
		
		int myAns;
		
		if(s1.charAt(i)==s2.charAt(j)) {
			myAns= editDistance(s1, s2, i+1, j+1, n, m);
		}
		else {
			int insert= editDistance(s1, s2, i, j+1, n, m);
			int replace= editDistance(s1, s2, i+1, j+1, n, m);
			int delete= editDistance(s1, s2, i+1, j, n, m);
			
			myAns= 1+ Math.min(replace, Math.min(insert, delete));
		}
		
		return myAns;
		
		
	}

}
