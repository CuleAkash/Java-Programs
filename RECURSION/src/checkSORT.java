
public class checkSORT {

	public static void main(String[] args) {
		int[] input = {1,3,7,6};
		System.out.print("Tthe array is sorted?: "+check_sort(input));

	}
	
	public static boolean check_sort(int[] input)
	{
		if(input.length<=1)
		{
			return true;
		}
		int[] smallInput= new int[input.length-1];
		for(int i=0;i<input.length-1;i++)
		{
			smallInput[i]= input[i+1];
		}
		boolean check= check_sort(smallInput); // assuming this function will give whether the small array is sorted or not
		if(!check) // if the small array is not sorted the whole arr is not possible to be sorted
		{
			return false;
		}
		if(input[0]<=input[1])// if the small array is sorted the we will check the 1st and second element only
		{
			return true;
		
		}
		else
		{
			return false;
		}
	}

}
