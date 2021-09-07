package twoDarrays;

import java.util.Scanner;

public class SpiralPrint {

	public static void main(String[] args) {
		int[][] input= taking_input();
		print_spiral(input);

	}
	
	public static int[][] taking_input() // function to take the input 2-D array
	{
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the no. of rows: ");
		int rows= s.nextInt();
		System.out.print("Enter the no. of columns: ");
		int cols= s.nextInt();
		int[][] arr= new int[rows][cols];
		System.out.println("Enter the elements of the 2-D array: ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				arr[i][j]= s.nextInt();
			}
		}
		return arr;
	}

		public static void print_spiral(int[][] arr) // function to print array spirally
		
		{
			int rows=arr.length,col= arr[0].length;
			int row_start=0,row_end=rows-1,col_start=0,col_end=col-1;
			int count=0;
			
			
			while(count<rows*col) // to count the no. of elements printed
			{
				for(int j=col_start;j<=col_end;j++)
				{
					System.out.print(arr[row_start][j]+ " ");
					count++;
				}
				row_start++;
				for(int i= row_start;i<=row_end;i++)
				{
					System.out.print(arr[i][col_end]+ " ");
					count++;
				}
				col_end--;
				for(int j=col_end;j>=col_start;j--)
				{
					System.out.print(arr[row_end][j]+ " ");
					count++;
				}
				row_end--;
				for(int i=row_end;i>=row_start;i--)
				{
					System.out.print(arr[i][col_start]+" ");
					count++;
				}
				col_start++;
			}
		}
		String a;
		
}
