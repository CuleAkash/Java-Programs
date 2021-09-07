package ASSIGNMENT1;

import java.util.Scanner;

public class reversenum {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n,rev=0,r;
		System.out.println("enter the number:");
		n= s.nextInt();
		System.out.print("the reverse of the number is: ");
		
		while(n>0)
		{
			r= n%10;
			rev= rev*10 +r;
			n=n/10;
		}
		System.out.print(rev);

	}

}
