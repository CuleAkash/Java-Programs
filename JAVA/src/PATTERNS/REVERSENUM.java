package PATTERNS;

import java.util.Scanner;

public class REVERSENUM {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the no. of rows:");
		int i=1,j,n=s.nextInt();
		System.out.println("the pattern is:");
		
		while(i<=n)
		{
			j=i;
			while(j>0)
			{
				System.out.print(j);
				j--;
			}
			i++;
			System.out.println();
		}

	}

}
