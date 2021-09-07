package SearchAndSort;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int[] arr= create();
		insertion_sort(arr);
		System.out.println("the array is: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		

	}
	
	public static int[] create()
	{
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size= s.nextInt();
		int[] arr= new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]= s.nextInt();
		}
		return arr;
	}
	
	public static void insertion_sort(int[] arr)
	{
		int size= arr.length;
		int temp=0;
		int i=1;
		while(i<size)
		{
			temp= arr[i];
			int j=i-1;
			while(j>=0)
			{
				if(temp<arr[j])
				{
					arr[j+1]=arr[j];
				}
				else
				{
					break;
				}
			}
			arr[j+1]=temp;
			i++;
		}
	}

}
