import java.util.Scanner;

public class PrintNNumbers {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		
		printN(n);
		

	}
	
	public static void printN(int n)
	{
		if(n==1)
		{
			System.out.print(n+" ");
			return;
		}
		
		printN(n-1);
		System.out.print(n+" ");
	}

}
