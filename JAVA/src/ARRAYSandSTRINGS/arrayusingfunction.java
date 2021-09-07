package ARRAYSandSTRINGS;
import java.util.Scanner;

public class arrayusingfunction {

	public static void main(String[] args) {
		
		int input[]= Taking_Input();
		print(input);
		int Largest = Largest_Element(input);
		System.out.println("the largest number in the array is: "+ Largest);

	}
	
	public static int[] Taking_Input() // function to create and taking input of an aaray
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = s.nextInt();
		int input[] =new int[size];
		int i;
		for(i=0;i<size;i++)
		{
			input[i]= s.nextInt();
		}
		return input;
	}
	
	public static void print(int input[]) // function to print the array
	{
		int size = input.length; //getting length of the array
		int i=0;
		for(i=0;i<size;i++)
		{
			System.out.print(input[i]+ " ");
		}
		System.out.println();
	}
	
	
	public static int Largest_Element(int input[]) // function to find largest element of the array
	{
		int size = input.length;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<size;i++)
		{
			if(input[i]>max)
			{
				max = input[i];
			}
		}
		return max;
	}
}
