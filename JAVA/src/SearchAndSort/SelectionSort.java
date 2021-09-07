package SearchAndSort;

public class SelectionSort {

	public static void main(String[] args) {
		int[] input= {2,5,6,8,9};
		int size= input.length;
		int[] sorted_arr= selection_sort(input,size);
		for(int i=0;i<size;i++)
		{
			System.out.println(sorted_arr[i]);
		}

	}
	
	
	public static int[] selection_sort(int[] arr, int size)
	{
		for(int i=0;i<size-1;i++)
		{
			int min = arr[i];
			int minIndex= i;
			for(int j=i+1;j<size;j++)
			{
				if(arr[j]<min)
				{
					min= arr[j];
					minIndex=j;
				}
			}
			if(minIndex!=i)
			{
				arr[minIndex]= arr[i];
				arr[i]= min;
			}
		}
		return arr;
	}
	

}
