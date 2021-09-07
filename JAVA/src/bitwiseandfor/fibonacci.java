package bitwiseandfor;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int fn=0,f1=1,f2=1,n,i;
		System.out.println("Enter the number:");
		n = s.nextInt();
		System.out.println("The nth fibonacci number is: ");
		
		for(i=2;i<n;i++)
		{
			fn= f1+f2;
			f1=f2;
			f2=fn;
		}
		System.out.print(fn);

	}

}
