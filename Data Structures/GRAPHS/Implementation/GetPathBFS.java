package Implementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GetPathBFS {

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
		ArrayList<Integer> ans= getPathBFS(adjMatrix,start,end);
		for(int i:ans) {
			System.out.print(i+" ");
		}
	}

	private static ArrayList<Integer> getPathBFS(int[][] adjMatrix, int start, int end) {
		if(adjMatrix.length==0) {
			return null;
		}
		Queue<Integer> pendingVertices= new LinkedList<>();
		boolean[] visited= new boolean[adjMatrix.length];
		HashMap<Integer,Integer> map= new HashMap<>();
		
		return helper(adjMatrix,start,end,pendingVertices,visited,map);
	}

	private static ArrayList<Integer> helper(int[][] adjMatrix, int start, int end, Queue<Integer> pendingVertices,
			boolean[] visited, HashMap<Integer, Integer> map) {
		if(start==end) {
			ArrayList<Integer> ans= new ArrayList<>();
			ans.add(start);
			return ans;
		}
		pendingVertices.add(start);
		visited[start]=true;
		map.put(start, -1);
		boolean pathFound=false;
		while(!pendingVertices.isEmpty() && !pathFound) {
			int front= pendingVertices.remove();
			for(int i=0;i<visited.length;i++) {
				if(adjMatrix[front][i]==1 && !visited[i]) {
					map.put(i, front);
					pendingVertices.add(i);
					visited[i]=true;
				}
				if(i==end) {
					pathFound=true;//to get out of the while loop
					break;//to get out of for loop
				}
			}
		}
		
		//Now to get out of the while loop there are two possibilities
		//1. pV is empty hence no path
		//2. pathFound is true
		if(pathFound) {
			ArrayList<Integer> ans= new ArrayList<>();
			int key= end;
			while(key!=start) {
				ans.add(key);
				key= map.get(key);
			}
			ans.add(start);
			return ans;
		}
		else {
			return null;//no path found
		}
		}

}
