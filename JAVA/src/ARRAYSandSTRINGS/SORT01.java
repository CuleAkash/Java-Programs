package ARRAYSandSTRINGS;

import java.util.Scanner;

public class SORT01 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size= s.nextInt();
		int[] arr= create(size);
		int[] sorted_arr= sort(arr,size);
		System.out.print("The sorted array is: ");
		for(int i=0;i<size;i++)
		{
			System.out.print(sorted_arr[i]+" ");
		}

	}
	
	public static int[] create(int size) //function to create an array of size size
	{	Scanner s= new Scanner(System.in);
		int[] arr= new int[size];
		System.out.print("Enter the elements of the array: ");
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		return arr;
		
	}

		public static int[] sort(int[] arr,int size)// function to sort the created array
		{
			for(int i=0;i<size;i++)
			{
				if(arr[i]!=0)
				{
					for(int j=i+1;j<size;j++)// if the ith element is 1 we have to check the next elements for a zero to replce it
					{
						if(arr[j]==0)// if any of the jth element is zero
						{
							int k= arr[i];
							arr[i]=arr[j];
							arr[j]=k;// replace the jth element with the ith element, once a i value is replaced no need to check other j values
							break;// then break from the j function to check for thr next ith value
						}
					}}}
			return arr;
		}
}
