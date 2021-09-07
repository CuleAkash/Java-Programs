package PATTERNS;

import java.util.Scanner;

public class isoscelestriangle {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the no. of rows:");
		int i,j,k,n=s.nextInt();
		System.out.println("the pattern is:");
		
		for(i=1;i<=n;i++)
		{
			for(k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(j=i-1;j>=1;j--)
			{
				System.out.print(j);
				
			}
			System.out.println();
		}

	}

}
