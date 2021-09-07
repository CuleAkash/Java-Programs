

import java.util.Scanner;

public class even {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter the num:");
	int a;
	a = s.nextInt();
	
	if(a%2==0) {
		System.out.println("the num is even");
	}
	else {
		System.out.println("the num is odd");
	}
	}

}
