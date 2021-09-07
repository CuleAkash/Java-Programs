package ASSIGNMENT1;
import java.util.Scanner;
public class MULTIPLICATIONTABLE {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int i=1,n;
		System.out.println("enter the no.:");
		n= s.nextInt();
		System.out.println("the multiplication table is:");
		while(i<=10)
		{
			System.out.println(n*i);
			i++;
			
		}

	}

}
