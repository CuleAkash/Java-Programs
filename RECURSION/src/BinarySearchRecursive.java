import java.util.Scanner;

public class BinarySearchRecursive {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size= s.nextInt();
		int[] input= new int[size];
		for(int i=0;i<size;i++)
		{
			input[i]= s.nextInt();
		}
		int find=s.nextInt();
		int ans= binary_search(input,find);
		System.out.println(ans);

	}
	
	private static int binary_search(int[] arr,int k)
	{
		return binary_search(arr, k,0,arr.length-1);
	}
	
	public static int binary_search(int[] arr, int k,int start,int end)
	{
		if(start>end)
		{
			return -1;
		}
		int mid= (start+end)/2;
		int i=0;
		if(arr[mid]==k)
		{
			return mid;
		}
		else
		{
			if(k>arr[mid])
			{
				i= binary_search(arr, k, mid+1, end);
			}
			else
			{
				i= binary_search(arr, k, start, mid-1);
			}
		}
		return i;
	}

}
