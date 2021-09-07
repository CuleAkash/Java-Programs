package ARRAYSandSTRINGS;

import java.util.Scanner;

public class SUMOFARRAY {

	public static void main(String[] args) {
		int arr[]= create();
		int sum= sum(arr);
		System.out.println("the sum is: "+sum);
	}
	
	public static int[] create()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = s.nextInt();
		int create[]= new int[size];
		System.out.println("enter the elements of the array:");
		
		for(int i=0;i<size;i++)
		{
			create[i]= s.nextInt();
		}
		return create;
	}

	public static int sum(int arr[])
	{
		int size= arr.length;
		int i;
		int sum=0;
		for(i=0;i<size;i++)
		{
			sum+= arr[i];
		}
		return sum;
	}
}
