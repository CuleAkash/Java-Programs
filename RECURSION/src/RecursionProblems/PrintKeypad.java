package RecursionProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintKeypad {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int[] arr= {2,3,4};
		printKeypad(arr);
	}

	private static void printKeypad(int[] arr) {
		helper(arr,0,arr.length-1,"");
		
	}

	private static void helper(int[] arr, int start, int end, String output) {
		if(start>end) {
			System.out.println(output);
			return;
		}
		
		char[] digitChar= getDigit(arr[start]);
		
		for(int i=0;i<digitChar.length;i++) {
			helper(arr, start+1, end, output+digitChar[i]);
		}
		
	}

	private static char[] getDigit(int n) {
		if(n>=2 && n<=9)
		{
		int size=0;
		if(n<7 || n==8)
		{
			size=3;
		}
		else
		{
			size=4;
		}
		char[] ch= new char[size];
		char c=0;
		if(n<=7) {
		 c= (char)('a'+3*(n-2));}
		else if(n==8) {
			 c= (char)('a'+3*(n-3)+4);}
		else {
			c= (char)(('a'+3*(n-4)+4)+3);}
		for(int k=0;k<size;k++)
		{
			ch[k]= (char)c;
			c++;
					
		}
		return ch;}
		else
		{
			char[] ch= {0};
			return ch;
		}
	}

}
