package PATTERNS;

import java.util.Scanner;

public class TRIANGULARNUM {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the no. of rows:");
		int i=1,j,n= s.nextInt();
		System.out.println("the pattern is:");
		
		while(i<=n)
		{
			j=1;
			while(j<=i)
			{
				System.out.print(i);
				j++;
			}
			i++;
			System.out.println();
		}

	}

}
