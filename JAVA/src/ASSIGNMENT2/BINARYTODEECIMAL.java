package ASSIGNMENT2;

import java.util.Scanner;

public class BINARYTODEECIMAL {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int pow=1,binary,decimal=0,r;
		System.out.println("Enter the binary number:");
		binary= s.nextInt();
		
		for(;binary>0;)
		{
			r= binary%10;
			decimal+= (r*pow);
			binary/=10;
			pow*=2;
		}
		System.out.println("The decimal number is: " +decimal);
		
		

	}

}
