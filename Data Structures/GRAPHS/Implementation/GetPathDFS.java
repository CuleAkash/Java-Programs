package Implementation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GetPathDFS {

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
		
		int start= s.nextInt();
		int end= s.nextInt();
		getPathDFS(adjMatrix,start,end);
		

	}

	private static void getPathDFS(int[][] adjMatrix, int start, int end) {
//		Queue<Integer> pV= new LinkedList<>();
		boolean[] visited = new boolean[adjMatrix.length];
		
		ArrayList<Integer> ans= helper(adjMatrix,start,end,visited);
		for(int i:ans) {
			System.out.print(i+" ");
		}
		
	}

	private static ArrayList<Integer> helper(int[][] adjMatrix, int start, int end,boolean[] visited) {
		if(start==end) {
			ArrayList<Integer> ans= new ArrayList<>();
			ans.add(start);
			return ans;
		}
		
		visited[start]= true;
		for(int i=0;i<adjMatrix.length;i++) {
			if(!visited[i] && adjMatrix[start][i]==1) {
				ArrayList<Integer> smallAns= helper(adjMatrix, i, end, visited);
				if(smallAns!=null) {
					smallAns.add(start);
					return smallAns;
				}
			}
		}
		return null;
		
	}

}
