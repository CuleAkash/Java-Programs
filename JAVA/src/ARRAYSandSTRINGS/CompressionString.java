package ARRAYSandSTRINGS;

import java.util.Scanner;

public class CompressionString {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the string: ");
		String input = s.next();
		int size= input.length();
		String compressed = compression(input,size);
		System.out.println(compressed);

	}
	
	public static String compression(String input,int size)
	{
		String compressed= "";
		char temp=0;
		int count=0;
		for(int i=0;i<size;i++)
		{
			if(i==0)
			{
				compressed+= input.charAt(i);
				temp=input.charAt(i);
				count=1;
			}
			else
			{
				if(temp==input.charAt(i))
				{
					count++;
					continue;
				}
				else
				{
					if(count==1)
					{
						compressed+= input.charAt(i);
						count=1;
						temp= input.charAt(i);
						continue;
					}
					compressed+= input.charAt(i)+count;
					count=1;
					temp= input.charAt(i);
					
				}
			}
		}
		return compressed;
	}
}
		
