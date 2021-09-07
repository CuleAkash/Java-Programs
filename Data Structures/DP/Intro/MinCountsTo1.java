package Intro;

import java.util.Scanner;

public class MinCountsTo1 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int ans=minStepsBetter(n);
		System.out.println(ans);

	}

	private static int minStepsBetter(int n) {
		int[] dp= new int[n+1];
		
		return minStepsBetterI(n,dp);
	}

	private static int minStepsBetterI(int n, int[] dp) {
		if(n<=1) {
			return 0;
		}
		dp[0]=0;
		dp[1]=0;
		
		for(int i=2;i<=n;i++) {
			int countOne= dp[i-1];
			int divideByTwo=Integer.MAX_VALUE,divideByThree=Integer.MAX_VALUE;
			if(i%2==0) {
				divideByTwo=dp[n/2];
			}
			
			if(i%3==0) {
				divideByThree=dp[n/3];
			}
			
			dp[i]= 1+Math.min(Math.min(countOne, divideByTwo), divideByThree);
		}
		
		return dp[n];
		
	}

	private static int minStepsBetter(int n, int[] dp) {
		if(n<=1) {
			return 0;
		}
		
		int countOne=Integer.MAX_VALUE,divideByTwo=Integer.MAX_VALUE,divideByThree=Integer.MAX_VALUE;
		
		if(dp[n]==-1) {
			countOne= minStepsBetter(n-1, dp);
			dp[n-1]=countOne;
		}
		else {
			countOne=dp[n-1];
		}
		
		if(n%3==0) {
			if(dp[n/3]==-1) {
				divideByThree= minStepsBetter(n/3, dp);
				dp[n/3]= divideByThree;
			}
			else {
				divideByThree= dp[n/3];
			}
		}
		
		if(n%2==0) {
			if(dp[n/2]==-1) {
				divideByTwo= minStepsBetter(n/2, dp);
				dp[n/2]= divideByTwo;
			}
			else {
				divideByTwo= dp[n/2];
			}
		}
		
		return 1+ Math.min(Math.min(countOne, divideByThree), divideByThree);
	}

	private static int minSteps(int n) {
		if(n<=1) {
			return 0;
		}
		
		int stepOne=Integer.MAX_VALUE;
		int divideByTwo= Integer.MAX_VALUE;
		int divideByThree= Integer.MAX_VALUE;
		
		stepOne= minSteps(n-1);
		
		if(n%3==0) {
			divideByThree= minSteps(n/3);
		}
		
		if(n%2==0) {
			divideByTwo= minSteps(n/2);
		}
		
		return 1+ Math.min(divideByTwo, Math.min(stepOne, divideByThree)); 
	}

}
