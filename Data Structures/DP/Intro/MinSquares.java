package Intro;

import java.util.Scanner;

public class MinSquares {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		
		int ans= minSquaresBetterI(n);
		System.out.println(ans);

	}
	
	
	
	
	
	
	//iterative solution
	private static int minSquaresBetterI(int n) {
		
		if(n==0) {
			return 0;
		}
		
		if(n==1) {
			return 1;
		}
		int[] dp= new int[n+1];
		for(int i=0;i<=n;i++) {
			dp[i]=-1;
		}
		
		dp[0]=0;
		dp[1]=1;
		
		for(int i=2;i<=n;i++) {
			int minCount= Integer.MAX_VALUE;
			for(int j=1;j*j<=i;j++) {
				int tempCount= dp[i-j*j];
				if(tempCount<minCount) {
					minCount=tempCount;
				}
				dp[i]=1+minCount;
			}
		}
		
		return dp[n];
		
		
	}







	//memoized solution
	private static int minSquaresBetter(int n) {
		int[] dp= new int[n+1];
		for(int i=0;i<=n;i++) {
			dp[i]=-1;
		}
		
		return minSquaresBetter(n,dp);
	}
	
	
	
	
	
	
	private static int minSquaresBetter(int n, int[] dp) {
		if(n==0) {
			return 0;
		}
		
		if(n==1) {
			return 1;
		}
		int minCount=Integer.MAX_VALUE;
		for(int i=1;i*i<=n;i++) {
			int tempCount;
			if(dp[n-i*i]==-1) {
				tempCount=minSquaresBetter(n-i*i, dp);
				dp[n-i*i]=tempCount;
			}
			else {
				tempCount=dp[n-i*i];
			}
			
			if(tempCount<minCount) {
				minCount=tempCount;
			}
		}
		
		return 1+minCount;
	}




	//recursive solution
	private static int minSquares(int n) {
		if(n==0) {
			return 0;
		}
		
		if(n==1) {
			return 1;
		}
		
		int minCount=Integer.MAX_VALUE;
		
		for(int i=1;i*i<=n;i++) {
			int tempCount= minSquares(n-(i*i));
			
			if(tempCount<minCount) {
				minCount=tempCount;
			}
		}
		return 1+minCount;
	}

}
