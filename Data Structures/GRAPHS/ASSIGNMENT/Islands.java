package ASSIGNMENT;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import Implementation.BFSinUnconnectedGraph;

public class Islands {

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
		
		int count= connectedIslands(adjMatrix);
		System.out.println(count);

	}

	private static int connectedIslands(int[][] adjMatrix) {
		if(adjMatrix.length==0 || adjMatrix.length==1) {
			return adjMatrix.length;
		}
		
		Queue<Integer> pendingVertices= new LinkedList<>();
		boolean[] visited= new boolean[adjMatrix.length];
		int count=0;
		
		for(int i=0;i<visited.length;i++) {
			if(!visited[i]) {
				bfsInUnconnectedGraph(adjMatrix,i,pendingVertices,visited);
				count++;
				//for each bfs call there will be a connected graph
			}
		}
		return count;
		
	}

	private static void bfsInUnconnectedGraph(int[][] adjMatrix, int currentVertex, Queue<Integer> pendingVertices,
			boolean[] visited) {
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
		
	}

}
