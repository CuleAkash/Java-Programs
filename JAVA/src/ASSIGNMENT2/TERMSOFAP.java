package ASSIGNMENT2;
import java.util.Scanner;

public class TERMSOFAP {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i,count=0,terms,N;// taking count to check the no. of terms
		System.out.println("Enter the no. of terms:");
		terms= s.nextInt();
		System.out.println("The terms of the series are:");
		
		for(i=1;;i++)
		{
			N= 3*i+2;
			if(N%4==0)
			{
				continue;//if the term is divisible by 4 we will go back to the start of the loop
			}
			else
			{
				System.out.print(N + " ");
				count++;
				if(count==terms)//if the count of terms equal to the no. of terms required it will break the loop
				{
					break;
				}
			}
		}
			

	}

}
