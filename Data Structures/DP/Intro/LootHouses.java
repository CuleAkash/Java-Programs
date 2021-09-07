package Intro;

import java.util.Scanner;

public class LootHouses {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int size= s.nextInt();
		int[] arr= new int[size];
		
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		
		int ans= lootHousesBetter(arr);
		System.out.println(ans);

	}
	
	
	
	//iterative
	private static int lootHousesBetter(int[] arr) {
		if(arr.length==0) {
			return 0;
		}
		
		if(arr.length==1) {
			return arr[0];
		}
		
		int maxAmount[]= new int[arr.length];
		maxAmount[0]=arr[0];
		maxAmount[1]= Math.max(arr[0], arr[1]);
		
		for(int i=2;i<arr.length;i++) {
			maxAmount[i]= Math.max(maxAmount[i-2]+arr[i], maxAmount[i-1]);
		}
		
		return maxAmount[arr.length-1];
	}




	//recursive solution
	private static int lootHouses(int[] arr) {
		return lootHouses(arr,0,arr.length-1);
	}




	private static int lootHouses(int[] arr, int start, int end) {
		if(start>end) {
			return 0;
		}
		
		return Math.max(arr[start]+lootHouses(arr, start+2, end), lootHouses(arr, start+1, end));
	}

}
