package ARRAYSandSTRINGS;

import java.util.Scanner;

public class occurence {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String input = s.next();
		char ans = find_highest(input);
		System.out.println(ans);

	}
	
	public static char  find_highest(String str) // function to find the highest occuring character
	{
		int[] freq= new int[256];
		for(int i=0;i<256;i++) //taking a freq array to store each character's freq
		{
			freq[i]=0;
		}
		
		for(int i=0;i<str.length();i++)
		{
			freq[str.charAt(i)]++; // storing each character's freq
		}
		char ans= str.charAt(0);
		int count = freq[str.charAt(0)];//assuming the first character is the highest occuring character
		
		for(int i=1;i<str.length();i++)
		{
			if(count>=freq[str.charAt(i)])// if freq of the current char >= freq of next char nothing will happen
			{
				continue;
			}
			ans= str.charAt(i);// if freq of current character < freq of next char next char is now assigned to ans
			count= freq[str.charAt(i)];
		}
		return ans;
	}

}
