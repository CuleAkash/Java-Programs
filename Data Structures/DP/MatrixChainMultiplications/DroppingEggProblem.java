package MatrixChainMultiplications;

import java.util.Scanner;

public class DroppingEggProblem {
	

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int eggs= s.nextInt();
		int floors= s.nextInt();
		
		int ansRecursive= droppingEggs(eggs,floors);
		System.out.println(ansRecursive);
		
		int ansMemoized= droppingEggsMemoized(eggs, floors);
		System.out.println(ansMemoized);
		

	}
	
	private static int droppingEggsMemoized(int eggs, int floors) {
		int[][] dp= new int[eggs+1][floors+1];
		for(int i=0;i<=eggs;i++) {
			for(int j=0;j<=floors;j++) {
				dp[i][j]=-1;
			}
		}
		return solveMemoized(eggs,floors,dp);
	}

	private static int solveMemoized(int eggs, int floors, int[][] dp) {
		if(floors==0 || floors==1) {
			return floors;
		}
		
		if(eggs==1) {
			return floors;
		}
		
		if(dp[eggs][floors]!=-1) {
			return dp[eggs][floors];
		}
		
		int count=Integer.MAX_VALUE;
		
		for(int k=1;k<=floors;k++) {
			int breakCond,notBreakCond;
			if(dp[eggs-1][k-1]!=-1) {
				breakCond= dp[eggs-1][k-1];
			}
			else {
				breakCond= solveMemoized(eggs-1, k-1, dp);
				dp[eggs-1][k-1]= breakCond;
			}
			
			if(dp[eggs][floors-k]!=-1) {
				notBreakCond= dp[eggs][floors-k];
			}
			else {
				notBreakCond= solveMemoized(eggs, floors-k, dp);
				dp[eggs][floors-k]= notBreakCond;
			}
			
			int temp= 1+ Math.max(breakCond, notBreakCond);
			count= Math.min(temp, count);
			
			
		}
		
		dp[eggs][floors]= count;
		return count;
	}
	
	
	
	
	

	// We have to find minimum number of attempts to find the threshold floor in the worst case scenario

	//Recursive solution
	private static int droppingEggs(int eggs, int floors) {
		if(floors==0 || floors==1) {
			return floors;
		}
		
		if(eggs==1) {
			return floors;
		}
		
		int count= Integer.MAX_VALUE;
		
		for(int k=1;k<=floors;k++) {
			//There will be two conditions one when egg breaks and one when it doesn't
			
			int breakCond= droppingEggs(eggs-1, k-1);
			int notBreakcond= droppingEggs(eggs, floors-k);
			
			//Now we will find worst case
			int temp= 1+ Math.max(breakCond, notBreakcond);
			count= Math.min(temp, count);
		}
		return count;
		
	}

}
