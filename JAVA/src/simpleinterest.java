import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class simpleinterest {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int p,r,t;
		System.out.println("enter the principal,rate and time:");
		p= s.nextInt();
		r= s.nextInt();
		t= s.nextInt();
		int si= (p*r*t)/100;
		System.out.print("the simple interest is:");
		System.out.println(si);
		
		

	}

}
