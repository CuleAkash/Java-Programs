package twoDarrays;

import java.util.Scanner;

public class HighestRowColumnSum {

	public static void main(String[] args) {
		int[][] input= taking_input();
		print_max_row_col_sum(input);

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
	
	public static void print_max_row_col_sum(int[][] arr) // function to print the largest row or column sum
	{
		int rows= arr.length;
		int cols= arr[0].length;
		int sum_rows=Integer.MIN_VALUE; // to keep track of the highest sum in terms of rows
		int sum_cols= Integer.MIN_VALUE; // to keep track of the highest sum in terms of columns
		int index_row=0,index_col=0; // to store the row/col no. which has the highest sum
		
		for(int i=0;i<rows;i++)
		{
			int sum=0;// for storing sum of one individual row
			for(int j=0;j<cols;j++)
			{
				sum+= arr[i][j];
			}
			if(sum>sum_rows)// if the new row sum is greater than previous row sum it will replace the previous sum 
				// and if both are same the previous sum sustains
			{
				sum_rows= sum;
				index_row=i; // index having highest row sum is also updated
			}
		}// after all rows are checked the highest row sum and the row no. is stored in sum_rows and index_row 
		
		for(int j=0;j<cols;j++)// same as in rows
		{
			int sum=0;
			for(int i=0;i<rows;i++)
			{
				sum+= arr[i][j];
			}
			if(sum>sum_cols)
			{
				sum_cols=sum;
				index_col=j;
			}
		}
		
		if(sum_cols>sum_rows) // if column sum is greater than row sum then
		{
			System.out.print("column "+index_col+" "+sum_cols);
		}
		else// even if both are same row sum will be printed
		{
			System.out.print("row "+index_row+" "+sum_rows);
		}
	}

}
