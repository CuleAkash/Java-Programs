import java.util.Scanner;

public class CheckNumArray {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int[] input = new int[s.nextInt()];
		for(int i=0;i<input.length;i++)
		{
			input[i]= s.nextInt();
		}
		int k= s.nextInt();
		boolean check = check_num(input,k);
		System.out.println(check);

	}
	
	public static boolean check_num(int[] arr, int k)
	{
		if(arr.length<=1)
		{
			if(arr[0]==k)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		if(arr[0]==k)
		{
			return true;
		}
		
		int[] smallInput= new int[arr.length-1];
		for(int i=0;i<arr.length-1;i++)
		{
			smallInput[i]= arr[i+1];
		}
		boolean check= check_num(smallInput,k);
		return check;
		 
		
	}

}
