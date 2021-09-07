package ASSIGNMENT1;

import java.util.Scanner;

public class FACTORS {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int i=2,n;
		System.out.println("enter the no.:");
		n = s.nextInt();
		
		System.out.println("the factors of " +n + " are:");
		
		while(i<n)
		{
			if(n%i==0)
			{
				System.out.print(i + " ");
			}
			i++;
		}

	}

}
