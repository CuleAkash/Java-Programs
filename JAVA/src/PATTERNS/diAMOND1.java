package PATTERNS;

import java.util.Scanner;

public class diAMOND1 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		
		System.out.println("*");
		
		for(int i=1;i<=n;i++)
		{
			for( int j=1;j<=i+1;j++)
			{
				if(j==1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(j-1);
				}
			}
			for(int j=i;j>=1;j--)
			{
				if(j==1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(j-1);
				}
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--)
		{
			for(int j=1;j<=i+1;j++)
			{
				if(j==1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(j-1);
				}
				
			}
			for(int j=i;j>=1;j--)
			{
				if(j==1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(j-1);
				}
			}
			System.out.println();
		}
		System.out.println("*");

	}

}
