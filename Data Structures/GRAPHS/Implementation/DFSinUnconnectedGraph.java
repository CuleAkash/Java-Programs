package Implementation;

import java.util.Scanner;

public class DFSinUnconnectedGraph {

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
		
		dfTraversal(adjMatrix);

	}

	private static void dfTraversal(int[][] adjMatrix) {
		if(adjMatrix.length==0) {
			return;
		}
		
		boolean[] visited= new boolean[adjMatrix.length];
		
		for(int i=0;i<visited.length;i++) {
			if(!visited[i]) {//whenever a node is not visited dfs is called on it
				dfTraversal(adjMatrix,i,visited);
			}
		}
		
	}

	private static void dfTraversal(int[][] adjMatrix, int i, boolean[] visited) {
		visited[i]= true;
		
		System.out.print(i +" ");
		
		for(int j=0;j<adjMatrix.length;j++) {
			if(adjMatrix[i][j]==1 && !visited[j]) {
				dfTraversal(adjMatrix, j, visited);
			}
		}
		
	}

}
