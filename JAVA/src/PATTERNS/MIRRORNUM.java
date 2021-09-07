package PATTERNS;

import java.util.Scanner;

public class MIRRORNUM {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int i,j,n,k;
		System.out.println("enter the no. of rows:");
		n =s.nextInt();
		
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
			System.out.println();
		}

	}

}
