package ARRAYSandSTRINGS;

import java.util.Scanner;

public class linearsearch {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int arr[]= create();
		System.out.println("Enter the digit to be searched:");
		int digit = s.nextInt();
		int index = Binary_Search(arr,digit);
		System.out.println(index);
		

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
	
	public static int Binary_Search(int arr[],int digit)
	{
		Scanner s= new Scanner(System.in);
		int size= arr.length;
		int i;
		for(i=0;i<size;i++)
		{
			if(arr[i]==digit)
			{
				return i;
			}
		}
		return -1;
	}
}
