package SearchAndSort;

import java.util.Scanner;

public class MergSort {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int[] input= new int[s.nextInt()];
		System.out.print("Enter the elemnets of the array: ");
		for(int i=0;i<input.length;i++)
		{
			input[i]= s.nextInt();
		}
		for(int i=0;i<input.length;i++)
		{
			System.out.print(input[i]+" ");
		}
		System.out.println();
		merge_sort(input);
		for(int i=0;i<input.length;i++)
		{
			System.out.print(input[i]+" ");
		}

	}
	
	private static void merge_sort(int[] input)
	{
		
		merge_sort(input,0,input.length-1);
	}

	public static void merge_sort(int[] input, int start,int end)
	{
		if(start>=end)
		{
			return;
		}
		int mid= (start+end)/2; // splitting the array into two equal parts
		merge_sort(input,start,mid);
		merge_sort(input,mid+1,end);
		int[] sr=merge(input,start,end);
		for(int i=0;i<sr.length;i++)
		{
			input[i]=sr[i];
		}
	}
	
	public static int[] merge(int[] input, int start, int end) // merging two sorted sides of the array
	{
		int end1= ((start+end)/2);
		int start2= ((start+end)/2)+1;
		int[] sorted_arr= new int[input.length] ;
		int i=0;
		while(start<=end1 && start2<=end)
		{
			if(input[start]<=input[start2])
			{
				sorted_arr[i]=input[start++];
			}
			else
			{
				sorted_arr[i]= input[start2++];
			}
			i++;
		}
		if(start>end1)
		{
			while(start2<=end)
			{
				sorted_arr[i]= input[start2++];
				i++;
			}
		}
		else if(start2>end)
		{
			while(start<=end1)
			{
				sorted_arr[i]=input[start++];
				i++;
			}
		}
		
		return sorted_arr;
	}
}
