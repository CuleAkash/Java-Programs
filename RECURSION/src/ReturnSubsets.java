
public class ReturnSubsets {

	public static void main(String[] args) {
		int[] arr= {2,3,5,6};
		int[][] output=return_subset(arr);
		for(int i=0;i<output.length;i++)
		{
			for(int j=0;j<output[i].length;j++)
			{
				System.out.print(output[i][j]+" ");
			}
			System.out.println();
		}

	}
	private static int[][] return_subset(int[] arr)
	{
		
		return return_subset(arr,0);
	}
	
	public static int[][] return_subset(int[] arr, int start)
	{
		if(start==arr.length)
		{
			int[][] neout= new int[1][0];
			return neout;
		}
		int[][] smallAns= return_subset(arr, start+1);
		int[][] output= new int[smallAns.length*2][];
		int k=0;
		for(int i=0;i<smallAns.length;i++)
		{
			output[k]= new int[smallAns[i].length];
			for(int j=0;j<smallAns[i].length;j++)
			{
				output[k][j]=smallAns[i][j];
			}
			k++;
		}
		for(int i=0;i<smallAns.length;i++)
		{
			output[k]= new int[smallAns[i].length+1];
			output[k][0]= arr[start];
			for(int j=0;j<smallAns[i].length;j++)
			{
				output[k][j+1]=smallAns[i][j];
			}
			k++;
		}
		return output;
	}

}
