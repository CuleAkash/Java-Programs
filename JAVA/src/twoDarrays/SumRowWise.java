package twoDarrays;

import java.util.Scanner;

public class SumRowWise {

	public static void main(String[] args) {
		int[][] input= taking_input();
		print_sum_row_wise(input);

	}
	
	public static int[][] taking_input()
	{
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the no. of rows: ");
		int rows= s.nextInt();
		System.out.print("Enter the no. of columns: ");
		int cols= s.nextInt();
		int[][] arr= new int[rows][cols];
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.println("Enter the element in "+i+"th row and "+j+ "th column");
				arr[i][j]= s.nextInt();
			}
		}
		return arr;
	}
	
	public static void print_sum_row_wise(int[][] arr)
	{
		int rows = arr.length;
		int cols= arr[0].length;
		for(int i=0;i<rows;i++)
		{
			int sum=0;
			for(int j=0;j<cols;j++)
			{
				sum+= arr[i][j];
			}
			System.out.print(sum+" ");
		}
	}

}
