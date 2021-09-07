import java.util.Scanner;

public class gcd {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int a,b;
		System.out.println("Enter the two numbers:");
		a= s.nextInt();
		b=s.nextInt();
		int small= (a>b?b:a);
		int large=(a>b?a:b);
		System.out.print("the gcd is: ");
		while(large%small!=0)
		{
			small=large%small;
			large=small;
		}
		System.out.println(small);

	}

}
