package Backtracking;

import java.util.Scanner;

public class RatInMaze2 {

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
	
	public static boolean rat_in_maze(int[][]maze,int[][]path,int row,int col)
	{
		int n= maze.length;
		if(row<0 || col<0 || row>=n || col>=n || maze[row][col]==0 || path[row][col]==1)
		{
			return false;
		}
		path[row][col]=1;// to include the cell into the path
		
		if(row==n-1 && col==n-1)
		{
			return true;
		}
		boolean valid= false;
		
		if(rat_in_maze(maze, path, row-1, col))
		{
			valid=true;
		}
		else if(rat_in_maze(maze, path, row, col+1))
		{
			valid=true;
		}
		else if(rat_in_maze(maze, path, row+1, col))
		{
			valid=true;
		}
		else if(rat_in_maze(maze, path, row, col-1))
		{
			valid=true;
		}
		
		return valid;
	}
}
	
	
	
	

	


