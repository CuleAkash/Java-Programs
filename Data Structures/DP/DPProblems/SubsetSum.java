package DPProblems;

import java.util.Scanner;

public class SubsetSum {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int size= s.nextInt();
		int[] arr= new int[size];
		for(int i=0;i<size;i++) {
			arr[i]= s.nextInt();
		}
		int sum= s.nextInt();
		boolean isPresent= subsetSum(arr,size,sum);
		System.out.println(isPresent);
		
		boolean isPresentMemoized= subsetSumIterative(arr,size,sum);
		System.out.println(isPresentMemoized);

	}
	
	
	


	private static boolean subsetSumIterative(int[] arr, int size, int sum) {
		if(sum==0) {
			return true;
		}
		
		if(size==0 && sum!=0) {
			return false;
		}
		
		if(arr[size-1]==sum) {
			return true;
		}
		
		boolean [][] dp= new boolean[size+1][sum+1];
		for(int i=0;i<=size;i++) {
			dp[i][0]=true;
		}
		
		for(int i=1;i<=sum;i++) {
			dp[0][i]=false;
		}
		
		for(int i=1;i<=size;i++) {
			for(int j=1;j<=sum;j++) {
				if(arr[i-1]==j) {
					dp[i][j]=true;
				}
				else {
					if(arr[i-1]<j) {
						boolean smallAns1= dp[i-1][j];
						boolean smallAns2= dp[i-1][j-arr[i-1]];
						dp[i][j]= smallAns1 || smallAns2;
					}
					else {
						dp[i][j]= dp[i-1][j];
					}
				}
			}
		}
		return dp[size][sum];
	}





	//recursive solution
	private static boolean subsetSum(int[] arr, int n, int sum) {
		if(sum==0) {
			return true;
		}
		
		if(n==0 && sum!=0) {
			return false;
		}
		
		if(arr[n-1]==sum) {
			return true;
		}
		
		boolean myAns= false;
		
		if(arr[n-1]<sum) {
			boolean included= subsetSum(arr, n-1, sum-arr[n-1]);
			boolean nonInclude= subsetSum(arr, n-1, sum);
			myAns= included||nonInclude;
		}
		else {
			myAns= subsetSum(arr, n-1, sum);
		}
		
		return myAns;
	}

}
