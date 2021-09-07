package PROBLEMS;

import java.util.Scanner;
import java.util.Stack;

public class StockSpan {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int size= s.nextInt();
		int[] stock= new int[size];
		for(int i=0;i<size;i++)
		{
			stock[i]=s.nextInt();
		}
		int[] span= stockSpan(stock);
		for(int i=0;i<size;i++)
		{
			System.out.print(span[i]+" ");
		}

	}
	
	public static int[] stockSpan(int[] stock)
	{
		int[] span= new int[stock.length];
		Stack<Integer> stack= new Stack<>();
		for(int i=0;i<stock.length;i++)
		{
			if(stack.isEmpty())
			{
				span[i]=i+1;
				stack.push(i);
			}
			else
			{
				if(stock[i]<=stock[stack.peek()])
				{
					span[i]=1;
					stack.push(i);
				}
				else
				{int c=1;
					while( !stack.isEmpty())
					{
						if(stock[stack.peek()]>stock[i])
						break;
						stack.pop();
						c++;
					}
					if(stack.isEmpty())
					{
						span[i]=i+1;
						stack.push(i);
					}
					else
					{
						span[i]=c;
					}
				}
			}
		}
		return span;
	}

}
