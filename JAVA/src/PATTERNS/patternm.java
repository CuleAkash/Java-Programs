package PATTERNS;

import java.util.Scanner;

public class patternm {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int i,j,n,k;
		System.out.println("Enter the no. of rows:");
		n= s.nextInt();
		System.out.println("The pattern is:");
		
		for(i=1;i<=n;i++)
		{
			k=n;
			for(j=1;j<=n-i+1;j++)
			{
				System.out.print(k);
				k--;
			}
			System.out.println();
		}

	}

}
