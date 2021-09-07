package Backtracking;

import java.util.Scanner;

public class PrintAllPaths {

	public static void main(String[] args) 
	 {
		Scanner s= new Scanner(System.in);
		int size= s.nextInt();
		int[][] maze= new int[size][size];
		for(int row=0;row<size;row++)
		{
			for(int col=0;col<size;col++)
			{
				maze[row][col]= s.nextInt();
			}
		}
		
		 PrintAllPaths(maze);
		

	}
	
	public static void PrintAllPaths(int[][] maze)
	{
		int[][] path= new int[maze.length][maze.length];
		 PrintAllPaths(maze,path,0,0);
	}
	
	public static void PrintAllPaths(int[][]maze,int[][]path, int row, int col)
	{
		int n= maze.length;
		if(row<0 || col<0 || row>=n|| col>=n || maze[row][col]==0 || path[row][col]==1)
		{
			return;
		}
		
		path[row][col]=1;
		if(row==n-1 && col==n-1)
		{
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print(path[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println();
			path[row][col]=0;// updating the final element to zero
			return;
		}
		
		PrintAllPaths(maze, path, row-1, col);//up
		PrintAllPaths(maze, path, row, col+1);//right
		PrintAllPaths(maze, path, row+1, col);//down
		PrintAllPaths(maze, path, row, col-1);//left
		path[row][col]=0;// now backtracking to the first position hence assigning all the values to zero on the way so that we can include that position in a diff. path
		return;
	}
		
	

	

}
