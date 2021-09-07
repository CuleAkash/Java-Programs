package ASSIGNMENT1;

import java.util.Scanner;

public class POWER {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,n,i=1,pd=1;
		System.out.println("enter the base:");
		a = s.nextInt();
		System.out.println("enter the exponent:");
		n = s.nextInt();
		
		while(i<=n)
		{
			pd *= a;
			i++;
		}
		System.out.println("the solution is: " +pd);

	}

}
