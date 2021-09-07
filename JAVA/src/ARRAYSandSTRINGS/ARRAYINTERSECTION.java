package ARRAYSandSTRINGS;

import java.util.Scanner;

public class ARRAYINTERSECTION {

	public static void main(String[] args) {
		int[] arr1= create();//create first array
		int[] arr2= create();//create second array
		print_array_intersection(arr1,arr2);

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

		public static void print_array_intersection(int[] arr1, int[] arr2)
		{
			for(int i=0;i<arr1.length;i++)
			{
				for(int j=0;j<arr2.length;j++)
				{
					if(arr1[i]==arr2[j])// if ith element of first array is equal to jth element of secondarray
					{
						System.out.print(arr1[i]+" ");
						arr2[j]= Integer.MIN_VALUE;// we wont consider that element of second array again
						break;// to avoid matching of element of first array with another element of second array we break the loop
					}
				}
			}
		}
}
