package MatrixChainMultiplications;

import java.util.Scanner;

public class MatrixChainMultiplication {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int n= s.nextInt();
		int[] arr= new int[n];
		//We make an array which will consist of the dimensions of the matrices to be multiplied
		
		for(int i=0;i<n;i++) {
			arr[i]= s.nextInt();
		}
		
		int ansRecursive= MCMrecursive(arr,n);
		System.out.println(ansRecursive);

		int ansMemoized= MCMmemoized(arr,n);
		System.out.println(ansMemoized);
	}

	private static int MCMmemoized(int[] arr, int n) {
		int dp[][]= new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				dp[i][j]=-1;
			}
		}
		
		return helperMemoized(arr,1,n-1,dp);
	}

	private static int helperMemoized(int[] arr, int i, int j, int[][] dp) {
		if(i>=j) {
			return 0;
		}
		
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		
		int ans= Integer.MAX_VALUE;
		
		for(int k=i;k<=j-1;k++) {
			int c1= helperMemoized(arr, i, k,dp);
			int c2= helperMemoized(arr, k+1, j,dp);
			int c3= arr[i-1]*arr[k]*arr[j];
			//c1=> cost of multiplication of first part of matrices
			//c2=> cost of multiplication of second part of matrices
			//c3=> cost of multiplying the matrices obtained from first and second part
			
			int tempAns= c1+c2+c3;//total cost
			ans= Math.min(tempAns,ans);//minimum cost among different combinations
		}
		dp[i][j]= ans;
		return dp[i][j];
	}

	//recursive code
	private static int MCMrecursive(int[] arr, int n) {
		//First step find i and j values
		//i starts from 1 as if we take i==0 arr[i-1]*arr[i] is the dimension of the required matrix
		//j ==n-1
		return helperRecursive(arr,1,n-1);
	}

	private static int helperRecursive(int[] arr, int i, int j) {
		//Base condition
		if(i>=j) {
			return 0;
		}
		
		int ans= Integer.MAX_VALUE;
		
		for(int k=i;k<=j-1;k++) {
			int c1= helperRecursive(arr, i, k);
			int c2= helperRecursive(arr, k+1, j);
			int c3= arr[i-1]*arr[k]*arr[j];
			//c1=> cost of multiplication of first part of matrices
			//c2=> cost of multiplication of second part of matrices
			//c3=> cost of multiplying the matrices obtained from first and second part
			
			int tempAns= c1+c2+c3;//total cost
			ans= Math.min(tempAns,ans);//minimum cost among different combinations
		}
		return ans;
	}

}
