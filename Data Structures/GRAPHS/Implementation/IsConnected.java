package Implementation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class IsConnected {

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
		boolean ans= isConnected(adjMatrix);
		System.out.println(ans);

	}

	private static boolean isConnected(int[][] adjMatrix) {
		if(adjMatrix.length==0) {
			return true;
		}
		
		Queue<Integer> pendingVertices= new LinkedList<>();
		boolean[] visited= new boolean[adjMatrix.length];
		
		return helper(adjMatrix,pendingVertices,visited,0);
	}

	private static boolean helper(int[][] adjMatrix, Queue<Integer> pendingVertices, boolean[] visited, int currentVertex) {
		pendingVertices.add(currentVertex);
		visited[currentVertex]=true;
		
		while(!pendingVertices.isEmpty()) {
			int front= pendingVertices.remove();
			for(int i=0;i<visited.length;i++) {
				if(adjMatrix[front][i]==1 && !visited[i]) {
				pendingVertices.add(i);
				visited[i]=true;
				}
			}
		}
		//After traversing if any vertex is unvisited then we return false
		for(int i=0;i<visited.length;i++) {
			if(!visited[i]) {
				return false;
			}
		}
		return true;
	}

}
