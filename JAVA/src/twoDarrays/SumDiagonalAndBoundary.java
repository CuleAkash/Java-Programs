package twoDarrays;

import java.util.Scanner;

public class SumDiagonalAndBoundary {

	public static void main(String[] args) {
		int[][] input = taking_input();
		int sum=sum_boundary_diagonal(input);
		System.out.println("the sum is: "+sum);

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
	
	public static int sum_boundary_diagonal(int[][] arr) // function to find sum of diagonal and boundary elements
	{
		int rows= arr.length, cols= arr[0].length;
		int sum_bound=0, sum_diag=0;
		
		int row_start=0,col_start=0,row_end=rows-1,col_end=cols-1;
		int count=0;
		while(count<(2*(rows+cols)))
		{
			for(int j=col_start;j<=col_end && count<(2*(rows+cols));j++)
			{
				sum_bound+=arr[row_start][j];
				arr[row_start][j]=0;
				count++;
			}
			row_start++;
			for(int i= row_start;i<=row_end && count<(2*(rows+cols));i++)
			{
				sum_bound+=arr[i][col_end];
				count++;
				arr[i][col_end]=0;
			}
			col_end--;
			for(int j=col_end;j>=col_start && count<(2*(rows+cols));j--)
			{
				sum_bound+=arr[row_end][j];
				count++;
				arr[row_end][j]=0;
			}
			row_end--;
			for(int i=row_end;i>=row_start  && count<(2*(rows+cols));i--)
			{
				sum_bound+=arr[i][col_start];
				count++;
				arr[i][col_start]=0;
			}
			col_start++;
		}
		
		int i=0;int j=cols-1;
		for(int k=0;k<rows;k++)
		{
			if(i==j)
			{
				sum_diag+=arr[k][i];
			}
			else
			{
				sum_diag+=arr[k][i]+arr[k][j];
			}
			i++;
			j--;
		}
		System.out.println(sum_bound);
		System.out.println(sum_diag);
		
		return (sum_bound+sum_diag);
		
		
		}
	}
	
	


