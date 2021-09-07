package SearchAndSort;

import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size= s.nextInt();
		int[] input= new int[size];
		for(int i=0;i<size;i++)
		{
			input[i]=s.nextInt();
		}
		quick_sort(input,0,size-1);
		for(int i=0;i<size;i++)
		{
			System.out.print(input[i]+" ");
		}

	}
	
	public static void quick_sort(int[] input,int start,int end)
	{
		if(start>=end)
		{
			return;
		}
		int pivotPos= partition(input,start,end);
		quick_sort(input,start,pivotPos-1);
		quick_sort(input,pivotPos+1,end);
	}
	
	public static int partition(int[] input,int start, int end)
	{
		int pivot= input[start];
		int count=0;
		
		for(int i=start+1;i<=end;i++)
		{
			if(input[i]<=pivot)
			{
				count++;
			}
		}
		int pivotPos= start+count;
		input[start]= input[pivotPos];
		input[pivotPos]=pivot;
		int i=start,j=end;
		while(i<pivotPos && j>pivotPos)
		{
			if(input[i]<=pivot)
			{
				i++;
			}
			if(input[j]>pivot)
			{
				j--;
			}
			else if(input[i]>pivot && input[j]<=pivot)
			{
				int temp= input[j];
				input[j]= input[i];
				input[i]=temp;
				i++;
				j--;
				}
			
		}
		return pivotPos;
	}

}
