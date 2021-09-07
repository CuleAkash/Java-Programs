import java.util.Scanner;

public class Sum_recursion {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int size = s.nextInt();
		int[] input= new int[size];
		for(int i=0;i<size;i++)
		{
			input[i]= s.nextInt();
			
		}
		int sum = sum_arr(input);
		System.out.println(sum);
		

	}
	
	public static int sum_arr(int[] input)
	{
		if(input.length<=1)
		{
			return input[0];
		}
		
		int[] smallInput= new int[input.length-1];
		for(int i=0;i<input.length-1;i++)
		{
			smallInput[i]=input[i+1];
		}
		int small_ans= sum_arr(smallInput); // for sum of next n-1 elements
		return input[0]+small_ans;
	}

}
