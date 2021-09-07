import java.util.Scanner;

public class SumOfNnumbers {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		int sum= sum_N(n);
		System.out.println(sum);

	}
	
	public static int sum_N(int n)
	{
		if(n==1)
		{
			return 1;
		}
		int smallSum= sum_N(n-1);
		return n+smallSum;
	}

}
