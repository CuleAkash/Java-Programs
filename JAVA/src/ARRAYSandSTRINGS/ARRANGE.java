package ARRAYSandSTRINGS;

import java.util.Scanner;

public class ARRANGE {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the max number:");
		int N= s.nextInt();
		int arr[]= arrange(N);
		for(int i=0;i<N;i++)
		{
			System.out.print(arr[i]+ " ");
		}

	}
//	public static int[] arrange(int N)
//	{
//		int start=0,end=N-1,value=1;
//		int arr[]= new int[N];
//		while(start<=end)
//		{
//			arr[start++]=value;
//			if(value==N)
//			{
//				break;
//			}
//			value++;
//			arr[end--]=value++;
//			
//		}
//				
//		return arr;
//	}
	public static int[] arrange(int N)
	{
		int start,end,value=1;
		int arr[]= new int[N];
				for(start=0,end=N-1;start<=(N-1)/2 && end>=(N+1)/2;start++,end--)
				{
					arr[start]=value;
					value++;
					arr[end]=value;
					value++;
				}
				if(start==end)
				{
					arr[start]=value;
				}
				
				return arr;
	}
	

}
