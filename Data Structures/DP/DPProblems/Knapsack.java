package DPProblems;

import java.util.Scanner;

public class Knapsack {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int size= s.nextInt();
		int[] values= new int[size];
		int[] weights= new int[size];
		
		
		
		for(int i=0;i<size;i++) {
			weights[i]= s.nextInt();
		}
		
		for(int i=0;i<size;i++) {
			values[i]= s.nextInt();
		}
		int maxWeight= s.nextInt();
		
		int maxValue= knapSack(values,weights,size,maxWeight);
		System.out.println(maxValue);
		
		

	}
	
	
	
	//recursive solution
	private static int knapSack(int[] values, int[] weights, int size, int maxWeight) {
		return knapSack(values, weights, size, maxWeight,0,0);
	}

	private static int knapSack(int[] values, int[] weights, int size, int maxWeight,int i, int currWeight) {
		if(size==0) {
			return 0;
		}
		
		if(i==size) {
			return 0;
		}
		
		if(currWeight+weights[i]>maxWeight) {
			return 0;
		}
		
		int myAns=0;
		if(weights[i]<=maxWeight) {
		int includeElement= values[i]+knapSack(values, weights, size, maxWeight, i+1, currWeight+weights[i]);
		
		int notIncludeElement= knapSack(values, weights, size, maxWeight, i+1, currWeight);
		myAns= Math.max(includeElement, notIncludeElement);
		}
		else {
			myAns= knapSack(values, weights, size, maxWeight, i+1, currWeight);
		}
		return myAns;
	}

}
