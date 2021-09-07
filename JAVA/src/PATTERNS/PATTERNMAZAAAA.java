package PATTERNS;

import java.util.Scanner;

public class PATTERNMAZAAAA {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int i,j,n;
		System.out.println("Enter the no. of rows:");
		n = s.nextInt();
		System.out.println("The pattern is:");
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(j==i)
				{
					System.out.print("\\");
				}
				else if(j== n-i+1)
				{
					System.out.print("/");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
