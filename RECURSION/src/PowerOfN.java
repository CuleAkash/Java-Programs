import java.util.Scanner;

public class PowerOfN {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int base= s.nextInt();
		int power = s.nextInt();
		double sum = power(base,power);
		System.out.println(sum);

	}
	
	public static double power(int b, int p)
	{
		if(b==0)
		{
			return 0;
		}
		if(b==0 && p==0)
		{
			return 1;
		}
		if(p==0)
		{
			return 1;
		}
		return b * power(b,p-1);
	}

}
