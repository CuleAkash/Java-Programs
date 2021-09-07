import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String input = s.next();
		boolean isPalindrome= check_palindrome(input);
		System.out.println(isPalindrome);

	}
	
	public static boolean check_palindrome(String s)
	{
		return check_palindrome(s,0,s.length()-1);
	}
	
	public static boolean check_palindrome(String s, int start, int end)
	{
		if(start==end || start+1==end)
		{
			if(s.charAt(start)== s.charAt(end))
			{
				return true;
			}
		}
		if(s.charAt(start)!=s.charAt(end))
		{
			return false;
		}
		
		return check_palindrome(s,start+1,end-1);
	}

}
