package HeapSort;

import java.util.Scanner;

public class HeapSort {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int[] arr= new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]= s.nextInt();
		}
		
		heapSort(arr,n);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

	private static void heapSort(int[] arr, int n) {
		if(n==0) {
			return;
		}
		
		//Firstly we have to build the heap inside the array only
		
		for(int i=0;i<n;i++) {
			upheapify(arr,i,n);
		}
		
//		for(int i=0;i<n;i++) {
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
		
		//Now as we have build the heap inside the array now we have to just put the smallest elements at the end of the array and we will get array in descending order
		
		for(int i=n-1;i>=0;i--) {
			int temp= arr[i];
			arr[i]= arr[0];
			arr[0]= temp;
			
			for(int j=0;j<n;j++) {
				System.out.print(arr[j]+" ");
			}
			System.out.println();
			
			
			downHeapify(arr,i-1);
			
			
			
		}
		
//		for(int i=0;i<n;i++) {
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
		
		
		
		//We now get the array in the descending order so we have to revserse it
		reverse(arr,n);
		
	}

	private static void reverse(int[] arr, int n) {
		int i=0;
		int j=n-1;
		
		while(i<=j) {
			int temp= arr[i];
			arr[i]= arr[j];
			arr[j]= temp;
			i++;
			j--;
		}
		
	}

	private static void downHeapify(int[] arr, int i) {
		int parentIndex= 0;
		int leftChildIndex=1;
		int rightChildIndex=2;
		int minIndex= parentIndex;
		while(leftChildIndex<=i) {
			if(arr[minIndex]>arr[leftChildIndex]) {
				minIndex= leftChildIndex;
			}
			
			if(rightChildIndex<=i && arr[minIndex]>arr[rightChildIndex]) {
				minIndex= parentIndex;
			}
			
			if(minIndex==parentIndex) {
				break;
			}
			
			int temp= arr[minIndex];
			arr[minIndex]= arr[parentIndex];
			arr[parentIndex]= temp;
			
			parentIndex= minIndex;
			leftChildIndex= (2*parentIndex)+1;
			rightChildIndex= (2*parentIndex)+2;
			}
		
	}

	private static void upheapify(int[] arr, int i, int n) {
		int childIndex=i;
		int parentIndex= (i-1)/2;
		
		while(childIndex>0 && arr[parentIndex]>arr[childIndex]) {
			int temp= arr[childIndex];
			arr[childIndex]= arr[parentIndex];
			arr[parentIndex]= temp;
			childIndex= parentIndex;
			parentIndex= (childIndex-1)/2;
		}
	}

}
