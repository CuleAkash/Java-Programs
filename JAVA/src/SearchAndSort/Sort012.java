package SearchAndSort;

import java.util.Scanner;

public class Sort012 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size= s.nextInt();
		int[] arr= create(size);
		sort012(arr);
		System.out.print("The sorted array is: ");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
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
	
	public static void sort012(int[] arr)
	{
		int n= arr.length;
		int i=0;
		int nextZ=0,nextT=n-1;
		extracted(arr, i, nextZ, nextT);
	}

	private static void extracted(int[] arr, int i, int nextZ, int nextT) {
		while(i<=nextT)
		{
			if(arr[i]==0)
			{
				int temp=arr[nextZ];
				arr[nextZ]=arr[i];
				arr[i]=temp;
				nextZ++;i++;
			}
			else if(arr[i]==2)
			{
				int temp=arr[nextT];
				arr[nextT]=arr[i];
				arr[i]=temp;
				nextT--;
			}
			else {
				i++;
			}
			}
	}

}
