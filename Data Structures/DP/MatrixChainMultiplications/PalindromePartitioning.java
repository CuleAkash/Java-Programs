package MatrixChainMultiplications;

import java.util.Scanner;

public class PalindromePartitioning {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		String S= s.next();
		int ansRecursive= palindromePartitioningRecursive(S);
		System.out.println(ansRecursive);
		
		int ansMemoized= palindromePartitioningMemoized(S);
		System.out.println(ansMemoized);

	}

	private static int palindromePartitioningMemoized(String s) {
		int[][] dp= new int[s.length()+1][s.length()+1];
		for(int i=0;i<=s.length();i++) {
			for(int j=0;j<=s.length();j++) {
				dp[i][j]=-1;
			}
		}
		
		
		return helperMemoized(s,0,s.length()-1,dp);
	}
	
	
	private static int helperMemoized(String s, int i, int j,int[][] dp) {
		if(i>=j) {
			return 0;
		}
		//If string is empty or only one character is present no partitining is required
		
		if(isPalindrome(s,i,j)) {
			return 0;
		}//is the string is already palindrome no partioning is required
		
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		
		int ans= Integer.MAX_VALUE;
		for(int k=i;k<j;k++) {
			
			
			//Further Optimization
			int left=0,right=0;
			if(dp[i][k]!=-1) {
				left=dp[i][k];
			}
			else {
				left= helperMemoized(s, i, k, dp);
				dp[i][k]= left;
			}
			
			if(dp[k+1][j]!=-1) {
				right=dp[k+1][j];
			}
			else {
				right= helperMemoized(s, k+1, j, dp);
				dp[k+1][j]= right;
			}
			
			int tempAns= 1+left+right;
			
			
			
			
			
			
//			int tempAns= 1+helperMemoized(s, i, k,dp)+helperMemoized(s, k+1, j,dp);//1 is added as a partition is done in this step to break the string into two parts
			ans= Math.min(ans, tempAns);
		}
//		System.out.println(ans);
		dp[i][j]= ans;
		return ans;
		
	}

	public static int palindromePartitioningRecursive(String s) {
		return helperRecursive(s,0,s.length()-1);

}

	private static int helperRecursive(String s, int i, int j) {
		if(i>=j) {
			return 0;
		}
		//If string is empty or only one character is present no partitining is required
		
		if(isPalindrome(s,i,j)) {
			return 0;
		}//is the string is already palindrome no partioning is required
		
		int ans= Integer.MAX_VALUE;
		
		for(int k=i;k<j;k++) {
			int tempAns= 1+helperRecursive(s, i, k)+helperRecursive(s, k+1, j);//1 is added as a partition is done in this step to break the string into two parts
			ans= Math.min(ans, tempAns);
		}
//		System.out.println(ans);a
		return ans;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	//function to check if the string is palindrome or not
	private static boolean isPalindrome(String s, int i, int j) {
		if(i>=j) {
			return true;
		}
		
		while(i<=j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
}
