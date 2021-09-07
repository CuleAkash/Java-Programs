package PATTERNS;

import java.util.Scanner;

public class diamond {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int i,j,n,k;
		System.out.println("Enter the no. of rows:");
		n= s.nextInt();
		System.out.println("The pattern is:");
		
		for(i=1;i<=(n/2)+1;i++)
		{
			for(k=1;k<=((n/2)+1)-i;k++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(i=n/2;i>=1;i--)
		{
			for(k=i;k<=n/2;k++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
