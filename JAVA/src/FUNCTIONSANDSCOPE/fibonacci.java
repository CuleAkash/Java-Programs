package FUNCTIONSANDSCOPE;

import java.util.Scanner;

public class fibonacci {
	public static int Fibonacci(int N)
	{
		int f0=0,f1=1,Fn=0;
				for(int i=1;i<N;i++)
				{
					 Fn= f1+f0;
					f0=f1;
					f1=Fn;
				}
				return Fn;
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int N, Fn;
		System.out.print("Enter the number: ");
		N= s.nextInt();
		
		Fn= Fibonacci(N);
		System.out.print("The nth Fibonacci number is: "+ Fn);

	}

}
