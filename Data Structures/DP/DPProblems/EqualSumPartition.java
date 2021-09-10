package DPProblems;

import java.util.Scanner;

public class EqualSumPartition {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int size= s.nextInt();
		int[] arr= new int[size];
		for(int i=0;i<size;i++) {
			arr[i]= s.nextInt();
		}
		
		boolean isPossible= equalSumRecursive(arr,size);
		System.out.println(isPossible);
		
		boolean isPossibleIterative= equalSumIterative(arr,size);
		System.out.println(isPossibleIterative);
	}
	
	
	
	
	//iterative solution
	private static boolean equalSumIterative(int[] arr, int size) {
		int sum= 0;
		for(int i=0;i<size;i++) {
			sum+=arr[i];
		}
		if(sum%2==0) {
			return equalSumIterative(arr, size,sum/2);
		}
		else {
			return false;
		}
	}
	
	
	private static boolean equalSumIterative(int[] arr, int size, int sum) {
		if(sum==0) {
			return true;
		}
		
		if(size==0 && sum!=0) {
			return false;
		}
		
		if(arr[size-1]==sum) {
			return true;
		}
		
		boolean[][] dp= new boolean[size+1][sum+1];
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
	private static boolean equalSumRecursive(int[] arr, int size) {
		int sum= 0;
		for(int i=0;i<size;i++) {
			sum+=arr[i];
		}
		if(sum%2==0) {
			return equalSumRecursive(arr, size,sum/2);
		}
		else {
			return false;
		}
	}

	private static boolean equalSumRecursive(int[] arr, int size, int sum) {
		if(sum==0) {
			return true;
		}
		
		if(size==0 && sum!=0) {
			return false;
		}
		
		if(arr[size-1]==sum) {
			return true;
		}
		
		boolean myAns= false;
		
		if(arr[size-1]<sum) {
			boolean smallAns1= equalSumRecursive(arr, size-1, sum-arr[size-1]);
			boolean smallAns2= equalSumRecursive(arr, size-1, sum);
			myAns= smallAns1|| smallAns2;
		}
		else {
			myAns= equalSumRecursive(arr, size-1, sum);
		}
		return myAns;
	}

}
