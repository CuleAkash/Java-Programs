
public class LastIndex {

	public static void main(String[] args) {
		int[] input= {9,8,10,8};
		int k= 8;
		int index = last_index(input,k);
		System.out.println(index);

	}
	
	private static int last_index(int[] input, int k)
	{
		return last_index(input,k,input.length-1);
	}
	
	public static int last_index(int[] input, int k,int end)
	{
		if(end<=0)
		{
			if(input[end]==k)
			{
				return end;
			}
			else
			{
				return -1;
			}
		}
		if(input[end]==k)
		{
			return end;
		}
		return last_index(input,k,end-1);
	}

}
