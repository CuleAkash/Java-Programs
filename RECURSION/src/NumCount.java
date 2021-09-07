import java.util.Scanner;

public class NumCount {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int count = countN(n);
		System.out.println(count);
	}
	
	public static int countN(int n)
	{
		if(n/10==0)
		{
			return 1;
		}
		return 1+ countN(n/10);
	}
	
	

}
