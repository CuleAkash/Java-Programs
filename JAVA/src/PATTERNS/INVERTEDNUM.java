package PATTERNS;

import java.util.Scanner;

public class INVERTEDNUM {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("enter the no. of rows:");
		int i,j,k,n=S.nextInt();
		
		for(i=1;i<=n;i++)
		{
			for(k=1;k<=i-1;k++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=n-i+1;j++)
			{
				System.out.print(n-i+1);
			}
			System.out.println();
		}

	}

}
