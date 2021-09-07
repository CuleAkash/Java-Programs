package Backtracking;

import java.util.Scanner;

public class RatInMaze {

	public static void main(String[] args) {
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
		
		boolean isPath= rat_in_maze(maze);
		System.out.println(isPath);

	}
	
	public static boolean rat_in_maze(int[][] maze)
	{
		int[][] path= new int[maze.length][maze.length];
		return rat_in_maze(maze,path,0,0);
	}
	
	public static boolean rat_in_maze(int[][] maze, int[][] path, int row, int col)
	{
		if(row==maze.length-1 && col== maze.length-1)
		{
			for(int i=0;i<path.length;i++)
			{
				for(int j=0;j<maze.length;j++)
				{
					System.out.print(path[i][j]+" ");
				}
				System.out.println();
			}
			return true;
		}
		
		boolean valid= false;
		
		if(row-1>=0)
		{
			if(maze[row-1][col]==1 && path[row-1][col]!=1)
			{path[row-1][col]=1;
				valid= rat_in_maze(maze, path, row-1, col);
			}
		}
		if(!valid)
		{
			if(col+1<maze.length) {
				if(maze[row][col+1]==1 && path[row][col+1]!=1)
				{path[row][col+1]=1;
					valid= rat_in_maze(maze, path, row, col+1);
				}}
		}
		if(!valid)
		{
			if(row+1<maze.length) {
				if(maze[row+1][col]==1 && path[row+1][col]!=1)
				{path[row+1][col]=1;
					valid= rat_in_maze(maze, path, row+1, col);
				}}
		}
		if(!valid)
		{
			if(col-1>=0) {
				if(maze[row][col-1]==1 && path[row][col-1]!=1)
				{path[row][col-1]=1;
					valid= rat_in_maze(maze, path, row, col-1);
				}}
		}
		
		
		return valid;
	}

	}


