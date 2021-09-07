package ARRAYSandSTRINGS;

public class SecondLargest {

	public static void main(String[] args) {
		int[] input= {2,6,9,65,10,25,87,56,32};
		int size= input.length;
		int second_largest= second_largest(input,size);
		System.out.println(second_largest);

	}

	public static int second_largest(int[] arr,int size)// function to find the second largest element by bubble sorting two times and returning the second last element
	{int n=0;
		for(int round=1;round<=2;round++)
		{
			int i=0;
			while(i<size-round)
			{
				if(arr[i]>arr[i+1])
				{
					int temp= arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=temp;
				}
				i++;
			}
			n=arr[i];
		}
		return n;
		
	}
}
