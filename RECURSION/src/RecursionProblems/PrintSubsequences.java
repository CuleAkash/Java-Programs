package RecursionProblems;

import java.util.Scanner;

public class PrintSubsequences {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		String input= s.next();
		printSubsequences(input);

	}

	private static void printSubsequences(String input) {
		helper(input,0,input.length()-1,"");
		
	}

	private static void helper(String input,int start,int end ,String ans) {
		if(start>end) {
			System.out.println(ans);
			return;
		}
		
		helper(input, start+1, end, ans);
		helper(input, start+1, end, ans+input.charAt(start));
		
	}

}
