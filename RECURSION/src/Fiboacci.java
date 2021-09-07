import java.util.Scanner;

public class Fiboacci {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int f= fibonacci(n);
		System.out.println(f);

	}
	
	public static int fibonacci(int n)
	{
		if(n==0)
		{
			return 0;
		}
		if(n==1)
		{
			return 1;
		}
		return fibonacci(n-1)+fibonacci(n-2); // this will give the nth fibonacci number assuming that fibonacci(n-1) will give the n-1th fibonacci number
	}

}
