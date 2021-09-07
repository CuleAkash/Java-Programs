import java.util.Scanner;

public class sumofn {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i=1,n,sum=0;
		System.out.println("enter the no.:");
		n= s.nextInt();
		
		while(i<=n)
		{
			sum = sum+i;
			i++;
		}
		System.out.println("the sum is:" + sum);
	}

}
