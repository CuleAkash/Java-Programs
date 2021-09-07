package PATTERNS;

import java.util.Scanner;

public class patternf {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i,j,k=1,n;
		System.out.println("Enter the no. of rows:");
		n= s.nextInt();
		System.out.println("the pattern is:");
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(k+ " ");
				k=k+1;
			}
			System.out.println();
		}

	}

}
