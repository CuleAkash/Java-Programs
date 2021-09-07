package ARRAYSandSTRINGS;
import java.util.Scanner;



public class FINDLONE {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the no. of test cases:");
		int Test_Cases= s.nextInt();
		for(int i=1;i<=Test_Cases;i++) {
			System.out.print("Enter the number of elements in the array: ");
			int size = s.nextInt();
			int[] arr= create(size);
			int Lone_Element= Find_Lone_Element(arr);
			System.out.println(Lone_Element);
			
		}
		

	}
	
	public static int[] create(int size)
	{
		int[] arr= new int[size];
		Scanner s= new Scanner(System.in);
		System.out.print("enter the elements of the array: ");
		for(int i=0;i<size;i++)
		{
			arr[i]= s.nextInt();
		}
		return arr;
		
	}
	
	public static int Find_Lone_Element(int[] arr)
	{
		int size = arr.length;
		
		for(int i=0;i<size;i++)
		{int j;
			for( j=0;j<size;j++)
			{	if(i!=j)
				{
					if(arr[i]==arr[j])
					{
						break;
					}
				
			     }
			
			}
			if(j==size)
			{
				return arr[i];
			}
		}
		return Integer.MAX_VALUE;
	}}


