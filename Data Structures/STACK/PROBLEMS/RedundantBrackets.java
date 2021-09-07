package PROBLEMS;

import java.util.Scanner;
import java.util.Stack;

public class RedundantBrackets {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str= s.next();
		System.out.println(isRedundantPresent(str));

	}
	
	public static boolean isRedundantPresent(String str)
	{
		if(str.length()==0 || str.length()==1)
		{
			return false;
		}
		
		Stack<Character> stack= new Stack<>();
		for(int i=0;i<str.length();i++)
		{
			char c= str.charAt(i);
			if(c>='a'&&c<='z' || c>='A'&&c<='Z')
			{
				continue;
			}
			else if(c!=')')
			{
				stack.push(c);
			}
			else
			{
				if(stack.pop()=='(')
				{
					return true;
				}
				else
				{
					while(!stack.isEmpty())
					{
						if(stack.pop()=='(')
							break;
					}
				}
			}
		}
		return false;
	}

}
