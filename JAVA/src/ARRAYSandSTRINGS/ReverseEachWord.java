package ARRAYSandSTRINGS;

import java.util.Scanner;

public class ReverseEachWord {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the elements of the string: ");
		String input = s.nextLine();// taking input string
		int size= input.length();
		String reverseWords= reverse_words(input,size);
		System.out.println(reverseWords);

	}
	
	
	
	public static String reverse_words(String input,int size)// function to reverse all the words and not the order
	{
		String reverse ="";// taking a reverse string
		int start=0,end=0;
		
		while(end<size)
		{
			if(input.charAt(end)==' ') // when end==' ' it will store the substring from start to end-1 after reversing  substring in the reverse string
			{
				String temp= input.substring(start, end);
				reverse+= reversal(temp)+" ";// storing the srting after reversal of each character order
				start= end+1;// after storing one reversed word start is again initialised fromm end+1 to collect the next word
			}
			end++;
		}
		String temp= input.substring(start, end);// at the end as there is no space we have to store the last word seperately
		//till this point end is at string lenght and start is at the first letter of the last word
		reverse+= reversal(temp)+" ";
		return reverse; // retirning the desired string
	}
	
	
	
	public static String reversal(String temp)// function to reverse each character of the string
	{	String reversal ="";
		for(int i=0;i<temp.length();i++)
		{
			reversal= temp.charAt(i)+ reversal;
			
		}
		return reversal;
	}

}
