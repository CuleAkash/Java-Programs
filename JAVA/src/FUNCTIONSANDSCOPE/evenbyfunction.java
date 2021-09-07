package FUNCTIONSANDSCOPE;

import java.util.Scanner;

public class evenbyfunction {
	public static void Print_Even_Numbers(int n) // fucntion to print all even numbers in a given range

	{
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.print(i +" ");
			}
		}
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int num;
		System.out.println("Enter the Number:");
		num= s.nextInt();
		Print_Even_Numbers(num);

	}

}
