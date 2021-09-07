import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i,a,b;
		System.out.println("enter the two numbers:");
		a= s.nextInt();
		b= s.nextInt();
		System.out.println("the lcm of the two numbers is:");
		
		for(i=(a>b?a:b);i<=a*b;i++)
		{
			if((i%a==0)&&(i%b==0))
			{
					System.out.println(i);
				return;
			}
		}
		}}
