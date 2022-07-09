package Intro;

import java.util.Scanner;



public class Fibonnaci {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		System.out.println(fibonnaciBetter(n));

	}
	
	private static int fibonnaciBetter(int n) {
		// n=3
		int[] arr= new int[n+1];
		for(int i=0;i<n+1;i++) {
			arr[i]=-1;
		}
		return fibonnaciBetter(n,arr);
	}

	private static int fibonnaciBetter(int n, int[] arr) {
		if(n==0 || n==1) {
			arr[n]=n;
			return n;
		}
		// arr[0] = 0;
		// arr[1] =1;
		// arr[2] = 1;
		// arr[3] = 2;
		// arr[n] = fibonacci at nth position
		
		int ans1= Integer.MIN_VALUE;
		if(arr[n-1]!=-1) {
			ans1=arr[n-1];
		}
		else {
			ans1= fibonnaciBetter(n-1, arr);
			arr[n-1]=ans1;
		}
		
		int ans2= Integer.MIN_VALUE;
		if(arr[n-2]!=-1) {
			ans2=arr[n-2];
		}
		else {
			ans2= fibonnaciBetter(n-2, arr);
			arr[n-2]=ans2;
		}
		
		arr[n]= ans1+ans2;
		return arr[n];
		
	}

	public static int fibonnaci(int n) {
		if(n==0 || n==1) {
			return n;
		}
		
		return fibonnaci(n-1)+fibonnaci(n-2);
	}//recursive fibonnaci solution with O(n^2) time complexity
	//we can solve by dp with O(n) time complexity
	

}
