package DPProblems;

import java.util.Scanner;

public class CountSubsetsSumtoGivenSum {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int[] arr= new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		
		int S= s.nextInt();
		int countRecursive= countSubsetSumRecursive(arr,n,S);
		System.out.println(countRecursive);
		
		int countIterative= countSubsetSumIterative(arr,n,S);
		System.out.println(countIterative);

	}

	
	
	
	//iterative solution
	private static int countSubsetSumIterative(int[] arr, int n, int sum) {
		if(sum==0) {
			return 1;
		}
		
		if(n==0 && sum!=0) {
			return 0;
		}
		
		int[][] dp= new int[n+1][sum+1];
		for(int i=0;i<=n;i++) {
			dp[i][0]=1;
		}
		
		for(int i=1;i<=sum;i++) {
			dp[0][i]=0;
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sum;j++) {
				if(arr[i-1]<=j) {
					dp[i][j]= dp[i-1][j]+dp[i-1][j-arr[i-1]];
				}
				else {
					dp[i][j]= dp[i-1][j];
				}
			}
		}
		return dp[n][sum];
	}





	//recursive solution
	private static int countSubsetSumRecursive(int[] arr, int n, int S) {
		if(S==0) {
			return 1;
		}
		
		if(n==0 && S!=0) {
			return 0;
		}
		
		int count=0;
		
		if(arr[n-1]<=S) {
			int count1= countSubsetSumRecursive(arr, n-1, S);
			int count2= countSubsetSumRecursive(arr, n-1, S-arr[n-1]);
			count+=count1+count2;
		}
		else {
			count+=countSubsetSumRecursive(arr, n-1, S);
		}
		return count;
	}

}
