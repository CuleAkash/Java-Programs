package DPProblems;

import java.util.HashMap;
import java.util.Scanner;

public class MinCostPath {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int m= s.nextInt();
		int[][] matrix= new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				matrix[i][j]=s.nextInt();
			}
		}
		
		int minCost= minCostPathBetterI(matrix,n,m);
		System.out.println(minCost);

	}
	
	
	
	
	
	//Iterative solution
	//it is done using another matrix with one extra row and col for infinity
	private static int minCostPathBetterI(int[][] matrix, int n, int m) {
		int[][] dp= new int[n+1][m+1];
		
		for(int i=0;i<=n;i++) {
			dp[i][m]=Integer.MAX_VALUE;
		}
		
		for(int i=0;i<=m;i++) {
			dp[n][i]=Integer.MAX_VALUE;
		}
		
		
		
		for(int i=n-1;i>=0;i--) {
			for(int j=m-1;j>=0;j--) {
				if(i==n-1 && j==m-1) {
					dp[i][j]=matrix[i][j];
				}
				else {
					int costRight= dp[i][j+1];
					int costDown= dp[i+1][j];
					int costDiag= dp[i+1][j+1];
					
					dp[i][j]= matrix[i][j]+ Math.min(costDiag, Math.min(costRight, costDown));
				}
			}
		}
		
		
		return dp[0][0];
	}






	//memoization
	private static int minCostPathBetter(int[][] matrix, int n, int m) {
		if(n==0) {
			return Integer.MAX_VALUE;
		}
		HashMap<Pair,Integer> map= new HashMap<>();
		return minCostPathBetter(matrix, n, m,0,0,map);
		
	}







	private static int minCostPathBetter(int[][] matrix, int row, int col, int i, int j, HashMap<Pair, Integer> map) {
		if(i>=row || j>=col) {
			return Integer.MAX_VALUE;
		}
		
		if(i==row-1 && j==col-1) {
			return matrix[i][j];
		}
		
		int costDown=0,costRight=0,costDiag=0;
		
		Pair p= new Pair(i+1,j);
		if(!map.containsKey(p)) {
			 costDown= minCostPathBetter(matrix, row, col, i+1, j, map);
			map.put(p, costDown);
		}
		else {
			costDown=map.get(p);
		}
		
		p= new Pair(i,j+1);
		if(!map.containsKey(p)) {
			 costRight= minCostPathBetter(matrix, row, col, i, j+1, map);
			map.put(p, costRight);
		}
		else {
			costRight=map.get(p);
		}
		
		p= new Pair(i+1,j+1);
		if(!map.containsKey(p)) {
			 costDiag= minCostPathBetter(matrix, row, col, i+1, j+1, map);
			map.put(p, costDiag);
		}
		else {
			costDiag=map.get(p);
		}
		
		return matrix[i][j]+Math.min(costDiag, Math.min(costRight, costDown));	
		}






	//recursive solution
	private static int minCostPath(int[][] matrix, int n, int m) {
		return minCostPath(matrix, m, m, 0, 0);
	}


	
	private static int minCostPath(int[][] matrix, int row, int col, int i, int j) {
		if(row==0) {
			return Integer.MAX_VALUE;
		}
		if(i>=row || j>=col) {
			return Integer.MAX_VALUE;
		}
		
		if(i==row-1 && j==col-1) {
			return matrix[i][j];
		}
		
		int costDown=0,costRight=0,costDiag=0;
		
			costDown= minCostPath(matrix, row, col, i+1, j);
		
		
			costRight= minCostPath(matrix, row, col, i, j+1);
		
			costDiag= minCostPath(matrix, row, col, i+1, j+1);
		
		return matrix[i][j]+Math.min(costDiag, Math.min(costRight, costDown));
	}

}
