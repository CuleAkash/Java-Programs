import java.util.Scanner;

public class PrinttSubsequences {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String input= s.next();
		print_subsequences(input);

	}
	public static void print_subsequences(String input)
	{
		print_subsequences(input,"");
	}
	
	public static void print_subsequences(String input, String output)
	{
		if(input.length()==0)// when the input string will be empty we will have our output int the output string
		{
			System.out.println(output);
			return;
		}
		print_subsequences(input.substring(1), output);// to include the first character
		print_subsequences(input.substring(1), output+input.charAt(0));// to not include the first character
	}

}
