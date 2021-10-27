package Implementation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graph {

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
		bfTraversal(adjMatrix);
		
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				System.out.print(adjMatrix[i][j]+" ");
//			}
//			System.out.println();
//		}

	}

	private static void bfTraversal(int[][] adjMatrix) {
		Queue<Integer> pendingVertices= new LinkedList<>();
		boolean[] visited= new boolean[adjMatrix.length];
		
		bfTraversal(adjMatrix,pendingVertices,visited,0);
		
	}

	private static void bfTraversal(int[][] adjMatrix, Queue<Integer> pendingVertices, boolean[] visited, int currentVertex) {
		if(adjMatrix.length==0) {
			return;
		}
		
		pendingVertices.add(currentVertex);
		visited[currentVertex]= true;
		
		while(!pendingVertices.isEmpty()) {
			int front= pendingVertices.remove();
			System.out.print(front+" ");
			
			for(int i=0;i<adjMatrix.length;i++) {
				if(adjMatrix[front][i]==1 && visited[i]==false) {
					visited[i]=true;
					pendingVertices.add(i);
				}
			}
		}
	}

	private static void dfTraversal(int[][] adjMatrix) {
		boolean[] visited= new boolean[adjMatrix.length];
		
		dfTraversal(adjMatrix,0,visited);
		//We start from the 0Th vertex of the graph
		
	}

	private static void dfTraversal(int[][] adjMatrix, int currentVertex, boolean[] visited) {
		visited[currentVertex]=true;//To mark the vertex as visited
		
		System.out.print(currentVertex+" ");
		
		//Traversing through the list correspondfing to a vertex aND IF NEIGHBOUR FOUND THEN THAT NEIBHBOUR IS EXPLORED
		for(int i=0;i<adjMatrix.length;i++) {
			if(adjMatrix[currentVertex][i]==1 && visited[i]==false) {
				dfTraversal(adjMatrix, i, visited);
			}
		}
		
	}
	
	
	

}
