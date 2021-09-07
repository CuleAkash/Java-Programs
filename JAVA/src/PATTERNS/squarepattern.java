package PATTERNS;

import java.util.Scanner;

public class squarepattern {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int i=1,j,n;
		System.out.println("enter the no. or rows:");
		n= s.nextInt();
		System.out.println("the pattern is: ");
		while(i<=n)
		{
			j=1;
			while(j<=n)
			{
				System.out.print("*");
				j++;
			}
			i++;
			System.out.println();
		}

	}

}
