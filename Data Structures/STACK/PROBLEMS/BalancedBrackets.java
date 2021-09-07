package PROBLEMS;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str= s.nextLine();
		System.out.println("The Expression is balanaced: "+ checkParanthesis(str));

	}
	
	public static boolean checkParanthesis(String str)
	{
		if(str.length()==0)
		{
			return true;
		}
		Stack<Character> stack= new Stack<>();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='[' || str.charAt(i)=='{' || str.charAt(i)=='(')
			{
				stack.push(str.charAt(i));
			}
			else if(str.charAt(i)==']' || str.charAt(i)=='}' || str.charAt(i)==')')
			{
				if(stack.isEmpty())
					return false;
			
				char ch= stack.pop();
				if(str.charAt(i)==']'&& ch=='[')
					continue;
				else if(str.charAt(i)=='}' && ch=='{')
					continue;
				else if(str.charAt(i)==')' && ch=='(')
					continue;
				else
					return false;
			}
		}
		return stack.isEmpty();
		
	}

}
