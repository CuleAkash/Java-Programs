package DPProblems;

import java.util.Scanner;

public class CountSubsetswithGivenDifference {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int[] arr= new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		
		int S= s.nextInt();
		
		int ans=countSubsetsWithGivenDifference(arr,n,S);
		System.out.println(ans);
	}

	private static int countSubsetsWithGivenDifference(int[] arr, int n, int S) {
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		int diff= (S+sum)/2;
		return CountSubsetsSumtoGivenSum.countSubsetSumIterative(arr, n, diff);
	}

}
