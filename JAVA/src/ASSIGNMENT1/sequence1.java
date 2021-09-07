package ASSIGNMENT1;

import java.util.Scanner;

public class sequence1 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int i,j,n,fact;
		double sum=1;
		System.out.println("enter the limit of the sequence:");
		n= s.nextInt();
		System.out.println("the sum of the sequence is: ");
		for(i=1;i<=n;i++)
		{	
			fact=1; // for each value of i a new factorial is needed so fact=1 each time bofre factorial loop starts
			for(j=i;j>0;j--)
			{
				fact = fact*j;
			}
			sum = sum + (1.0/fact);
		}
		System.out.println(sum);

	}

}
