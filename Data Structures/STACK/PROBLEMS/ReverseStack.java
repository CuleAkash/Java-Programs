package PROBLEMS;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {

	public static void main(String[] args) {
		Stack<Integer> stack= new Stack<>();
		Scanner s= new Scanner(System.in);
		int size= s.nextInt();
		int[] arr= new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		
		for(int i: arr)
		{
			stack.push(i);
		}
		reverseStack(stack);
		while(!stack.isEmpty())
		{
			System.out.print(stack.pop()+" ");
		}
		
	}
	
	private static void reverseStack(Stack<Integer> stack)
	{
		Stack<Integer> helper= new Stack<>();
		 reverseStack(stack,helper);
	}
	
	public static void reverseStack(Stack<Integer> stack,Stack<Integer> helper)
	{
		if(stack.size()==1 || stack.isEmpty())
		{
			return;
		}
		
		int temp= stack.pop();
		reverseStack(stack, helper);
		while(!stack.isEmpty())
		{
			int temp1=stack.pop();
			helper.push(temp1);
		}
		stack.push(temp);
		while(!helper.isEmpty())
		{
			int temp1=helper.pop();
			stack.push(temp1);
		}
	}

}
