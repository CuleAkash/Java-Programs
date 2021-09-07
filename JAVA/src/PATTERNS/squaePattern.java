package PATTERNS;

import java.util.Scanner;

public class squaePattern {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=2*i-1;j<=2*n-1;j+=2)
			{
				System.out.print(j);
			}
			for(int j=1;j<=2*i-3;j+=2)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
