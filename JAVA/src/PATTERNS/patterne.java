package PATTERNS;

import java.util.Scanner;

public class patterne {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i,n,j;
		System.out.println("Enter the no. of rows:");
		n=s.nextInt();
		System.out.println("The pattern is:");
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				if((i+j)%2==0)
				{
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}

	}

}
