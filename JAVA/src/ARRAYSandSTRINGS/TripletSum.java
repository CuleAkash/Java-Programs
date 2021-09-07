package ARRAYSandSTRINGS;

import java.util.Scanner;

public class TripletSum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr= create();
		System.out.println("Enter the sum: ");
		int sum = s.nextInt();
		int count = find_count(arr,sum);
		System.out.println("the no. of pairs is: "+count);
		

	}
	
	
	
	public static int[] create()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size= s.nextInt();
		int arr[]= new int[size];
		int i;
		System.out.println("Enter the elements:");
		for(i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		return arr;
	}
	
	public static int find_count(int[] arr,int sum)
	{
		int count=0;
		int size= arr.length;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				for(int k=j+1;k<size;k++)
				{
					
				if(arr[i]+arr[j]+arr[k]==sum)
				{
					count++;
				}
			}
		}}
		return count;
	




	}

}
