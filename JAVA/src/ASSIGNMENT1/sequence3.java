package ASSIGNMENT1;

import java.util.Scanner;



public class sequence3 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n,i,x;
		double sum=1;
		System.out.println("Enter the base value:");
		x=s.nextInt();
		System.out.println("Enter the limit:");
		n= s.nextInt();
		
		for(i=1;i<=n;i++)
		{
			sum = sum+ Math.pow(x, i);
		}
		System.out.println("the sum is "+ sum);
		

	}

}
