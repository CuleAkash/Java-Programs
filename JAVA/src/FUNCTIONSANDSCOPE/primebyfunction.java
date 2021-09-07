package FUNCTIONSANDSCOPE;

import java.util.Scanner;

public class primebyfunction {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n;
		System.out.println("Enter the number:");
		n= s.nextInt();
		boolean isPrime = Check_Prime(n);
		
		if(isPrime==true)
		{
			System.out.println("The number is prime");
		}
		else
		{
			System.out.println("The number is not prime");
		}

	}
	
	public static boolean Check_Prime(int n) // function to check the primability of the input number
	{
		boolean isPrime= true;
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				isPrime = false;
				return isPrime;
			}
		}
		return isPrime;
	}

}
