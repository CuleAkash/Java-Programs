package ARRAYSandSTRINGS;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String input = s.nextLine();
		int size = input.length();
		String reverse_word= reversal(input,size);
		System.out.println(reverse_word);

	}
	
	public static String reversal(String str,int size)
	{
		int start = size-1;
		int end= size;
		String str1="";
		while(start>=0)
		{
			if(str.charAt(start)==' ')// stopping iteration when space is there
			{
				str1+= str.substring(start+1, end)+" ";
				end=start;
			}
			start--;
		}
		str1+= str.substring(start+1, end)+" ";// space is not present before start=0 so to print the ver first word this is necessary
		return str1;
	}

}
