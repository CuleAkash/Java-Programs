package ARRAYSandSTRINGS;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the String: ");
		String input = s.next();
		int size= input.length();
		String newString = removal(input,size);
		System.out.print("The new string after removal is: ");
		System.out.println(newString);

	}
	
	public static String removal(String str,int size)// function to remove consecutive same characters from a string
	{
		String newString = "";
		char temp=0; // to store the current character
		
		for(int i=0;i<size;i++)
		{
			if(i==0)// first element is directly stored to the new string and the temp
			{
				newString += str.charAt(i);
				temp= str.charAt(i);
			}
			else
			{
				if(temp==str.charAt(i))// if the next character is same as the previous character we will continue to the next iteration
				{
					continue;
				}
				newString+= str.charAt(i);// if the next character is not same we will add the character to the new string
				temp= str.charAt(i);// and store the character in temp to check if the next character is equal or not to terminate consecutive same characters
			}
		}
		return newString;
	}

}
