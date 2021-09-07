package FUNCTIONSANDSCOPE;

import java.util.Scanner;

public class nCr {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		System.out.println("Value of N is:");
		int N=s.nextInt();
		System.out.println("Value of r is:");
		int r= s.nextInt();
		int factN=1,factR=1,factNR=1;
		
		for(int i=1;i<=N;i++)
		{
			factN *=i;
		}
		
		for(int i=1;i<=r;i++)
		{
			factR*=i;
		}
		
		for(int i=1;i<=(N-r);i++)
		{
			factNR *= i;
		}
		
		int result = factN/(factR*factNR);
		System.out.println("The nCr value is: "+ result);
		/* in this code same type of code is written three times and this type of iteration is not very good for the code
		 * for this type of situations, functions concept ia very important
		 * whenever we have to use same type of code multiple times in the code then functions are required 
		 */
		

	}

}
