package DPProblems;


import java.util.Scanner;

public class MinimumSubsetDifference {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int[] arr=  new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= s.nextInt();
		}
		
		int ans= minimumSubsetDiff(arr,n);
		System.out.println(ans);

	}

	private static int minimumSubsetDiff(int[] arr, int n) {
		int range=0;
		for(int i=0;i<n;i++) {
			range+=arr[i];
		}
		int ans= subsetSumIterative(arr,n,range);
		return ans;
	}
	
	
	
	private static int subsetSumIterative(int[] arr, int size, int sum) {
		if(sum==0) {
			return 0;
		}
		
		if(size==0 && sum!=0) {
			return 0;
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
					if(arr[i-1]<=j) {
						boolean smallAns1= dp[i-1][j];
						boolean smallAns2= dp[i-1][j-arr[i-1]];
						dp[i][j]= smallAns1 || smallAns2;
					}
					else {
						dp[i][j]= dp[i-1][j];
					}
				}
			}
		
		int ans= Integer.MAX_VALUE;
		for(int i=0;i<=sum/2;i++) {
			if(dp[size][i]==true) {
				int temp=sum-i;
				int smallAns= Math.abs(temp-i);
				if(smallAns<ans) {
					ans=smallAns;
				}	
			}
		}
		return ans;
	}

}
