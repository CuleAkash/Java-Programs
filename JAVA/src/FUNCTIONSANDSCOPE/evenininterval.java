package FUNCTIONSANDSCOPE;

import java.util.Scanner;

public class evenininterval {
	public static void Print_Even_In_Interval(int i,int n)
	{
		for(int j =i;j<=n;j++)
		{
			if(j%2==0)
			{
				System.out.print(j +" ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		int firstnum,secondnum;
		System.out.println("Enter the two numbers:");
		firstnum= s.nextInt();
		secondnum= s.nextInt();
		System.out.println("The even numbers in the interval are:");
		Print_Even_In_Interval(firstnum,secondnum);

	}

}
