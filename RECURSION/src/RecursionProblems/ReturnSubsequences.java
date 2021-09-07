package RecursionProblems;

import java.util.Scanner;

public class ReturnSubsequences {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		String input= s.next();
		
		String[] ans= printSubsequences(input);
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}

	}

	private static String[] printSubsequences(String input) {
		return printSubsequences(input,0,input.length()-1);
	}

	private static String[] printSubsequences(String input, int start, int end) {
		if(start>end) {
			String[] ans= {""};
			return ans;
		}
		
		String[] smallAns= printSubsequences(input, start+1, end);
		String[] ans= new String[2*smallAns.length];
		
		int k=0;
		
		for(int i=0;i<smallAns.length;i++) {
			ans[k]=smallAns[i];
			k++;
		}
		
		for(int i=0;i<smallAns.length;i++) {
			ans[k]=input.charAt(start)+smallAns[i];
			k++;
		}
		
		return ans;
	}

}
