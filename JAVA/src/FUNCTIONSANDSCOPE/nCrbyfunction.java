package FUNCTIONSANDSCOPE;

import java.util.Scanner;

public class nCrbyfunction {
	
	public static int factorial(int num)/*function is declared by name factorial and expected output of type integer
										and int num value is passed into the function from the main function*/
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		return fact;//value of n factorial num is return after the execution of this function
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int r=s.nextInt();
		
		int factN =factorial(n); //vale of n is passed to the function factorial and in return it gives the factorial n value
									//which is then stored in the factN variable.
		int factR= factorial(r);
		int factNR =factorial(n-r);
		
		int result = factN/(factR*factNR);
		System.out.println("The nCr value is: "+ result);
		

	}

}
