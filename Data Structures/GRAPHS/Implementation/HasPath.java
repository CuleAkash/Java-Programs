package Implementation;

import java.util.Scanner;

public class HasPath {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int n= s.nextInt();//Number of vertices
		int e= s.nextInt();//Number of edges
		
		int[][] adjMatrix= new int[n][n];//Matrix to store all the edges and vertices information
		
		for(int i=0;i<e;i++) {
			//for taking input about all edges
			
			int v1= s.nextInt();//first vertex of the edge
			int v2= s.nextInt();//second vertex of the edges
			
			//Now both must be joined 
			
			adjMatrix[v1][v2]= 1;//One end
			adjMatrix[v2][v1]=1;//Second end
			
		}
		
		int b= s.nextInt();
		int d= s.nextInt();
		System.out.println(hasPathDFS(adjMatrix,b,d));

	}

	private static boolean hasPathDFS(int[][] adjMatrix,int b,int d) {
		if(adjMatrix.length==0) {
			return false;
		}
		
		boolean[] visited= new boolean[adjMatrix.length];
		return helperDFS(adjMatrix,b,visited,d);
	}

	private static boolean helperDFS(int[][] adjMatrix, int beginning, boolean[] visited, int destination) {
		if(beginning==destination) {
			return true;
		}
		
		visited[beginning]= true;
		for(int i=0;i<adjMatrix.length;i++) {
			if(adjMatrix[beginning][i]==1 && !visited[i]) {
				return helperDFS(adjMatrix, i, visited, destination);
			}
		}
		return false;
	}

	

}
