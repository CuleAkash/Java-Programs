package ARRAYSandSTRINGS;

import java.util.Scanner;

public class pushzeros {

	public static void main(String[] args) {
		int[] arr= create();
		pushZeros(arr);
		print(arr);

	}
	
	public static int[] create()
	{
		Scanner s= new Scanner(System.in);
		int size= s.nextInt();
		int arr[]= new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]= s.nextInt();
		}
		return arr;
	}
	
	public static void print(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	
		public static void pushZeros(int[] arr)
		{
			int temp1= 0;
			
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]!=0)
				{
					int temp= arr[temp1];
					arr[temp1]= arr[i];
					arr[i]= temp;
					temp1++;	
				}
					
			}
		}
}
