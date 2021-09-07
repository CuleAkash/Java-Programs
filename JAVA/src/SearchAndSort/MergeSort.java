package SearchAndSort;

public class MergeSort {

	public static void main(String[] args) {
		int[] input1= {1,9,10,12};
		int[] input2= {2,6,15,20,40};
		int[] sorted_arr= merge_sort(input1,input2); 
		for(int i=0;i<sorted_arr.length;i++)
		{
			System.out.println(sorted_arr[i]);
		}

	}
	
	public static int[] merge_sort(int[] arr1,int[] arr2)
	{
		int[] sort= new int[arr1.length+ arr2.length];
		int size1 = arr1.length;
		int size2 = arr2.length;
		int i=0,j=0,z=0;
		
		while(i<size1 && j<size2)
		{
			if(arr1[i]<arr2[j])
			{
				sort[z]= arr1[i];
				i++;
			}
			else if(arr1[i]>arr2[j])
			{
				sort[z]= arr2[j];
				j++;
			}
			z++;
		}
		if(i==size1)
		{
			while(j<size2)
			{
				sort[z]=arr2[j];
				j++;
				z++;
			}
		}
		else if(j==size2)
		{while(i<size1)
		{
			sort[z]=arr1[i];
			i++;
			z++;}
		}
		return sort;
	}

}
