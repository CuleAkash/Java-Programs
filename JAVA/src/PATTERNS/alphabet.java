package PATTERNS;

import java.util.Scanner;

public class alphabet {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the no. of rows:");
		int i=1,j,n=s.nextInt();
		char ch;
		
		System.out.println("the pattern is: ");
		
		for(i=1;i<=n;i++)
		{
			ch = (char)('A' +i- 1);
				for(j=1;j<i;j++)
				
				{
					System.out.print(ch);
					ch = (char)(ch+1);
					
				}
				
				System.out.println(ch);
		}

	}

}
