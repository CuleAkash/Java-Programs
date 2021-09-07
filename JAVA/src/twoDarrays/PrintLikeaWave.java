package twoDarrays;

import java.util.Scanner;

public class PrintLikeaWave {

	public static void main(String[] args) {
		int[][] input= taking_input();
		print_wave(input);

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
	
	public static void print_wave(int[][] arr)
	{
		int rows= arr.length,cols= arr[0].length;
		for(int j=0;j<cols;)
		{
			for(int i=0;i<rows;i++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			j++;
			for(int i=rows-1;i>=0;i--)
			{
				System.out.print(arr[i][j]+" ");
			}
			j++;
		}
	}

}
