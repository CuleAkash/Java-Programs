package PATTERNS;

import java.util.Scanner;

public class patternd {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int i,j,n;
		System.out.println("Enter the no. of rows:");
		n =s.nextInt();
		System.out.println("the pattern is: ");
		
		for(i=1;i<=n;i++)
		{
			for(j=i+1;j<=2*i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
