package ASSIGNMENT1;

import java.util.Scanner;

public class divisibleandevenodd {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n,m,i;
		System.out.println("enter the dividend:");
		n= s.nextInt();
		System.out.println("enter the divisor:");
		m = s.nextInt();
		System.out.println("the status of the numbers are:");
		
		for(i=1;i<=n;i++)
		{
			if(i%m==0)
			{
				if(i%2==0)
				{
					System.out.println("the the number is "+ i + "and is even");
				}
				else {
					System.out.println("the number is "+ i+ "and is odd");
				}
			}
		}

	}

}
