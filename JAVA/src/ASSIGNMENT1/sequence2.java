package ASSIGNMENT1;

import java.util.Scanner;
public class sequence2 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int i,j,fact,x,n;
		double sum=0;
		System.out.println("enter the limit: ");
		n= s.nextInt();
		System.out.println("enter the base value:");
		x= s.nextInt();
		
		for(i=1;i<=n;i++)
		{
			fact=1;
				for(j=i;j>0;j--)
				{
					fact= fact*j;
				}
				if(i%2==0)
				{
					sum = (sum -( (Math.pow(x, i))/fact));
				}				else
			{
					sum = (sum +(( Math.pow(x, i))/fact));
				}
		}
		System.out.println("the sum of the sequence is:" +sum);

	}

}
	