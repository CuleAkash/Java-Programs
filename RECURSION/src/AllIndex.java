
public class AllIndex {

	public static void main(String[] args) {
		int[] input = {9,8,10,8,8};
		int k= 8;
		index(input,k);

	}
	
	private static void index(int[] input,int k)
	{
		index(input,k,0);
	}
	
	public static void index(int[] input, int k,int start)
	{
		if(start>=input.length-1)
		{
			if(input[start]==k)
			{
				System.out.print(start+" ");
			}
			return;
		}
		if(input[start]==k)
		{
			System.out.print(start+" ");
		}
		index(input,k,start+1);
	}

}
