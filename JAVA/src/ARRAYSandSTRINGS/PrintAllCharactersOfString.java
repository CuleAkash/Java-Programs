package ARRAYSandSTRINGS;

import java.util.Scanner;

public class PrintAllCharactersOfString {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = s.nextLine();
		/*for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
		}*/
		printChars(str);

	}
	
	public static void printChars(String str) // function to print all the characters in the string
	{
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
		}
	}

}
