import java.util.Scanner;

public class greatestnum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,b;
		System.out.println("enter the two numbers:");
		a= s.nextInt();
		b =s.nextInt();
		
		if(a>b) {
			System.out.println("first num is greater");
		}
		else {
			System.out.println("second num is greater");
		}
		

	}

}
