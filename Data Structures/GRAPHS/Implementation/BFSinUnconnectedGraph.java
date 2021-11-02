package Implementation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFSinUnconnectedGraph {

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
		
		bfTraversal(adjMatrix);

	}

	private static void bfTraversal(int[][] adjMatrix) {
		if(adjMatrix.length==0) {
			return;
		}
		
		boolean[] visited= new boolean[adjMatrix.length];
		Queue<Integer> pendingVertices= new LinkedList<>();
		
		for(int i=0;i<visited.length;i++) {
			if(!visited[i]) {
				bfTraversal(adjMatrix,i,pendingVertices,visited);
			}
		}
	}

	private static void bfTraversal(int[][] adjMatrix, int currentVertex, Queue<Integer> pendingVertices, boolean[] visited) {
		visited[currentVertex]=true;
		
		pendingVertices.add(currentVertex);
		
		while(!pendingVertices.isEmpty()) {
			int front= pendingVertices.remove();
			System.out.print(front+" ");
			
			for(int i=0;i<adjMatrix.length;i++) {
				if(adjMatrix[front][i]==1 && !visited[i]) {
					pendingVertices.add(i);
					visited[i]=true;
				}
			}
		}
		
	}

}
