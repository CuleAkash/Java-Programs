package twoDarrays;

import java.util.Scanner;

public class takingInputandPrinting {
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the no. of rows and columns: ");
		int rows= s.nextInt();
		int columns =  s.nextInt();
		int[][] input = new int[rows][columns];
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				input[i][j]= s.nextInt();
			}
		}
		
		print(input,rows,columns);
	}
	public static void print(int[][] input,int rows,int columns)
	{
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print(input[i][j]+ " ");
			}
			System.out.println();
		}
	}
	

}
