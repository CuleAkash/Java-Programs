package SearchAndSort;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the no. of elements in the array: ");
		int size= s.nextInt();
		int[] arr= create(size);
		System.out.print("Enter the element to be found: ");
		int element= s.nextInt();
		int index = find_element(arr,element,size);
		System.out.println("The element is at "+index);

	}
	
	public static int[] create(int size)
	{
		Scanner s= new Scanner(System.in);
		int[] arr= new int[size];
		System.out.print("Enter the elements of the array: ");
		for(int i=0;i<size;i++)
		{
			arr[i]= s.nextInt();
		}
		return arr;
	}

		public static int find_element(int[] arr,int n,int size)
		{
			int start=0,end=size-1;
			while(start<=end)
			{
				int mid= (start+end)/2;
				if(n==arr[mid])
				{
					return mid;
				}
				else if(n>arr[mid])
				{
					start= mid+1;
				}
				else
				{
					end= mid-1;
				}
			}
			return -1;
		}
}
