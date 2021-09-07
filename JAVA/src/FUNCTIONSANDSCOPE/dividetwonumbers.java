package FUNCTIONSANDSCOPE;

import java.util.Scanner;

public class dividetwonumbers {
	
	public static void Divide_Numbers(int nume,int deno)//function to print the value of qoutient
	{
		if(deno==0)
		{
			System.out.println("not feasible");
			return;
		}
		//System.out.println("The quotient is: "+ (double)nume/deno); // to print the quotient in double variable type
		System.out.println("The quotient is: "+ nume/deno);
		
		
	}
	/*public static int Divide_Numbers(int nume,int deno){
		if(deno==0)
		{
			return Integer.MIN_VALUE; // if we have declared the return data type in the function as integer we have to return some integer madndatory
		}
		int q = nume/deno;
		return q;
		
	}*/
	//function to onle return the vale of quotient

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int nume,deno;
		System.out.println("Enter the Numerator and Denominator:");
		nume= s.nextInt();
		deno= s.nextInt();
		//System.out.print("The Qoutient of the division will be:");
		//int q = 
		Divide_Numbers(nume,deno);
		//System.out.println(q);
		

	}

}
